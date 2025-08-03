package com.frost.deuxzero.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.frost.deuxzero.dto.ButDTO;
import com.frost.deuxzero.dto.JoueurDTO;
import com.frost.deuxzero.dto.JoueurDTOShort;
import com.frost.deuxzero.dto.MatchDTO;
import com.frost.deuxzero.dto.MatchEquipeDTO;
import com.frost.deuxzero.dto.MatchHighlightDTO;
import com.frost.deuxzero.dto.MotmVoteCountDTO;
import com.frost.deuxzero.model.But;
import com.frost.deuxzero.model.Joueur;
import com.frost.deuxzero.model.MatchEquipe;
import com.frost.deuxzero.model.MatchHighlight;
import com.frost.deuxzero.model.Matchx;
import com.frost.deuxzero.model.MotmVote;
import com.frost.deuxzero.service.ButService;
import com.frost.deuxzero.service.EquipeService;
import com.frost.deuxzero.service.JoueurService;
import com.frost.deuxzero.service.MatchEquipeService;
import com.frost.deuxzero.service.MatchService;
import com.frost.deuxzero.service.SanteService;

@Controller
@RequestMapping("/matchs")
public class MatchController {

	@Autowired
	private MatchService matchService;
	
	@Autowired
	private MatchEquipeService matchEquipeService;
	
	@Autowired
	private ButService butService;
	
	@Autowired
	private JoueurService joueurService;
	
	@Autowired
	private SanteService santeService;
	
	@Autowired
	private EquipeService equipeService;
	
	@GetMapping("/{id}")
    public String getMatch ( Model model, @PathVariable Long id ) {
		
		Matchx match = matchService.getMatchById(id);
		MatchDTO matchDTO = new MatchDTO(match);
		
		MatchEquipe matchEquipeDomicile = matchEquipeService.getMatchEquipeDomicile(match);
		MatchEquipe matchEquipeExterieure = matchEquipeService.getMatchEquipeExterieur(match);
		
		List<JoueurDTO> joueursDTODomicileList = new ArrayList<>();
		for (Joueur joueur : matchEquipeDomicile.getJoueurs() ) {
			List<But> butsEnMatchList = butService.getAllButsByMatchAndButeur(match, joueur);
			List<But> passesDEnMatchList = butService.getAllButsByMatchAndPasseur(match, joueur);
			joueur.setButs( butsEnMatchList );
			joueur.setPasses( passesDEnMatchList );
			
			JoueurDTO joueurDTO = new JoueurDTO(joueur);
			
			joueursDTODomicileList.add( joueurDTO );
		}
		
		List<JoueurDTO> joueursDTOExterieurList = new ArrayList<>();
		for (Joueur joueur : matchEquipeExterieure.getJoueurs() ) {
			
			List<But> butsEnMatchList = butService.getAllButsByMatchAndButeur(match, joueur);
			List<But> passesDEnMatchList = butService.getAllButsByMatchAndPasseur(match, joueur);
			joueur.setButs( butsEnMatchList );
			joueur.setPasses( passesDEnMatchList );
			
			JoueurDTO joueurDTO = new JoueurDTO(joueur);
			
			
			joueursDTOExterieurList.add( joueurDTO );
		}
		
		List<MatchHighlightDTO> matchHighlightsDTOList = new ArrayList<>();
		for (MatchHighlight highlight : match.getHighlights() ) {
			matchHighlightsDTOList.add( new MatchHighlightDTO(highlight) );
		}
		
		List<ButDTO> butsDTOList = new ArrayList<>();
		for (But but : match.getButs() ) {
			butsDTOList.add( new ButDTO(but) );
		}
		
		
		Map<Joueur, Integer> voteCount = new HashMap<>();
		List<MotmVote> motmVotesList = match.getMotmVotes();
		for ( MotmVote motmVote : motmVotesList ) {
			Joueur joueurVote = motmVote.getVote();
			voteCount.put(joueurVote, voteCount.getOrDefault(joueurVote, 0) + 1 );
		}
		
		List<MotmVoteCountDTO> motmVotesCountDTOList = new ArrayList<>();
		for (Map.Entry<Joueur, Integer> entry : voteCount.entrySet()) {
		    Joueur joueur = entry.getKey();
		    int count = entry.getValue();
		    motmVotesCountDTOList.add(new MotmVoteCountDTO(joueur, count));
		}
		
		
		
		
		model.addAttribute("match", matchDTO);
		model.addAttribute("joueursDomicile", joueursDTODomicileList);
		model.addAttribute("joueursExterieur", joueursDTOExterieurList);
		model.addAttribute("highlights", matchHighlightsDTOList);
		model.addAttribute("buts", butsDTOList);
		model.addAttribute("motmVotesList", motmVotesCountDTOList);
		
		return "match";
	}
	
	@PostMapping
	public String postMatch( @RequestBody MatchDTO matchDTO ) {
		
		Matchx match = new Matchx();	
		match.setSante( santeService.getSanteById( matchDTO.getSante().getId() ) );
		match.setDate( new Date() .getTime() ); //COME BACK THE DATE AND TIME PASSED BY THE USER TO LONG
		match.setMotm( joueurService.getJoueurById( matchDTO.getMotm().getId() ) );
		match.setCanVoteMotm( matchDTO.isCanVoteMotm() );
		match = matchService.saveMatch(match);
		
		List<MatchEquipeDTO> matchEquipeDTOList = new ArrayList<>();
		matchEquipeDTOList.add(matchDTO.getEquipeA());
		matchEquipeDTOList.add(matchDTO.getEquipeB());
		
		boolean homeT=true;
		for ( MatchEquipeDTO matchEquipeDTO : matchEquipeDTOList ) {
			
			MatchEquipe matchEquipe = new MatchEquipe();
			if (homeT) matchEquipe.setMatchsAsA(match);
			if (!homeT) matchEquipe.setMatchsAsB(match);
			matchEquipe.setEquipe( equipeService.getEquipeById( matchEquipeDTO.getEquipe().getId() ) );
			matchEquipe.setCapitaine( joueurService.getJoueurById( matchEquipeDTO.getCapitaine().getId() ) );
			for ( JoueurDTOShort joueurDTOShort : matchEquipeDTO.getJoueurs() ) {
				matchEquipe.getJoueurs().add( joueurService.getJoueurById( joueurDTOShort.getId() ) );
			}
			matchEquipe.setMarques( matchEquipeDTO.getMarques() );
			matchEquipe.setEncaisses( matchEquipeDTO.getEncaisses() );
			String resultat = "";
			if ( matchEquipe.getMarques() > matchEquipe.getEncaisses() ) {
				resultat = "V";
			} else if ( matchEquipe.getMarques() < matchEquipe.getEncaisses() ) {
				resultat = "D";
			} else {
				resultat = "N";
			}
			matchEquipe.setResultat(resultat);
			matchEquipe = matchEquipeService.saveMatchEquipe(matchEquipe);
			homeT=false;
		}
		
		List<ButDTO> butsDTOList = matchDTO.getButs();
		for (ButDTO butDTO : butsDTOList) {
			
			But but = new But();
			but.setEquipe(null);
			but.setMatch(match);
			but.setButeur(null);
			but.setPasseur(null);
			but.setMinute(0);
			but.setScore("");
			but = butService.saveBut(but);
			
		}
		
		
		
		
		return null;
	}
	
}
