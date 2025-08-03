package com.frost.deuxzero.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.frost.deuxzero.dto.MotmVoteCountDTO;
import com.frost.deuxzero.dto.MotmVoteDTO;
import com.frost.deuxzero.model.Joueur;
import com.frost.deuxzero.model.Matchx;
import com.frost.deuxzero.model.MotmVote;
import com.frost.deuxzero.service.JoueurService;
import com.frost.deuxzero.service.MatchService;
import com.frost.deuxzero.service.MotmVoteService;

@Controller
@RequestMapping("/motm")
public class MotmVoteController {
	
	@Autowired
	private MotmVoteService motmVoteService;
	
	@Autowired
	private JoueurService joueurService;
	
	@Autowired
	private MatchService matchService;
	
	@PostMapping("/vote")
	@ResponseBody
    public ResponseEntity<?> submitVote ( @RequestBody MotmVoteDTO motmVoteDTO ) {
		
		
		
		System.out.println( "Match : " + motmVoteDTO.getMatch());
		System.out.println( "Username : " + motmVoteDTO.getUsername());
		System.out.println( "Vote : " + motmVoteDTO.getVote());
		
		Matchx match = matchService.getMatchById( motmVoteDTO.getMatch() );
		Joueur votant = joueurService.getJoueurByName( motmVoteDTO.getUsername().toUpperCase() );
		Joueur vote = joueurService.getJoueurById( motmVoteDTO.getVote() );
		
		if ( motmVoteService.getAllMotmVotesByMatchAndVotant(match, votant).isEmpty() && match.isCanVoteMotm() && votant != vote  ) {
			
			MotmVote motmVote = new MotmVote();
			Date date = new Date();
			motmVote.setDate( date.getTime() );
			motmVote.setMatch( match );
			motmVote.setVotant( votant );
			motmVote.setVote( vote );
			
			motmVoteService.saveMotmVote(motmVote);
			
			
			//COUNT VOTES AND SET MOTM
			match = motmVote.getMatch();
			Map<Joueur, Integer> voteCount = new HashMap<>();
			List<MotmVote> motmVotesList = match.getMotmVotes();
			for ( MotmVote motmVoteSub : motmVotesList ) {
				Joueur joueurVote = motmVoteSub.getVote();
				voteCount.put(joueurVote, voteCount.getOrDefault(joueurVote, 0) + 1 );
			}
			
			int max = 0;
			for (Map.Entry<Joueur, Integer> entry : voteCount.entrySet()) {
			    Joueur joueur = entry.getKey();
			    int count = entry.getValue();
			    
			    if (count > max) {
			    	match.setMotm(joueur);
			    	max = count;
			    }
			}
			matchService.saveMatch(match);
		}
		
		return ResponseEntity.ok().build();	
	}
	
}
