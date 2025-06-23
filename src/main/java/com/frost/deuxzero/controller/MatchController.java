package com.frost.deuxzero.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.frost.deuxzero.dto.ButDTO;
import com.frost.deuxzero.dto.JoueurDTO;
import com.frost.deuxzero.dto.JoueurDTOShort;
import com.frost.deuxzero.dto.MatchDTO;
import com.frost.deuxzero.dto.MatchHighlightDTO;
import com.frost.deuxzero.model.But;
import com.frost.deuxzero.model.Joueur;
import com.frost.deuxzero.model.MatchEquipe;
import com.frost.deuxzero.model.MatchHighlight;
import com.frost.deuxzero.model.Matchx;
import com.frost.deuxzero.service.ButService;
import com.frost.deuxzero.service.MatchEquipeService;
import com.frost.deuxzero.service.MatchHighlightService;
import com.frost.deuxzero.service.MatchService;

@Controller
@RequestMapping("/matchs")
public class MatchController {

	@Autowired
	private MatchService matchService;
	
	@Autowired
	private MatchEquipeService matchEquipeService;
	
	@Autowired
	private MatchHighlightService matchHighlightService;
	
	@Autowired
	private ButService butService;
	
	@GetMapping("/{id}")
    public String getMatch ( Model model, @PathVariable Long id ) {
		
		Matchx match = matchService.getMatchById(id);
		MatchDTO matchDTO = new MatchDTO(match);
		
		MatchEquipe matchEquipeDomicile = matchEquipeService.getMatchEquipeDomicile(match);
		MatchEquipe matchEquipeExterieure = matchEquipeService.getMatchEquipeExterieur(match);
		
		List<JoueurDTO> joueursDTODomicileList = new ArrayList<>();
		for (Joueur joueur : matchEquipeDomicile.getJoueurs() ) {
			joueursDTODomicileList.add( new JoueurDTO(joueur) );
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
		
		
		model.addAttribute("match", matchDTO);
		model.addAttribute("joueursDomicile", joueursDTODomicileList);
		model.addAttribute("joueursExterieur", joueursDTOExterieurList);
		model.addAttribute("highlights", matchHighlightsDTOList);
		model.addAttribute("buts", butsDTOList);
		
		return "match";
	}
	
}
