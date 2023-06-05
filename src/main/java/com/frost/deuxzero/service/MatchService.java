package com.frost.deuxzero.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frost.deuxzero.exception.ResourceConflictException;
import com.frost.deuxzero.exception.ResourceNotFoundException;
import com.frost.deuxzero.model.Match;
import com.frost.deuxzero.repository.MatchRepository;

@Service
public class MatchService {
	
	@Autowired
	private MatchRepository matchRepository;
	
	public Match getMatchById( Long id ) throws ResourceNotFoundException {	
		return matchRepository.findById(id).orElseThrow( () -> new ResourceNotFoundException("No such Panier !") );
	}
	
	public List<Match> getAllMatchs() throws ResourceNotFoundException {	
		List<Match> matchs = new ArrayList<>();	
		matchRepository.findAll().forEach(matchs::add);	
		return matchs;
	}
	
	public Match saveMatch( Match match ) {
		return matchRepository.save(match);
	}
	
	public Match createMatch( Match match ) throws ResourceConflictException {	
		Optional<Match> matchTmp = matchRepository.findById( match.getId() );
		if ( matchTmp.isPresent() ) { throw new ResourceConflictException("Match existe deja"); }	
		return saveMatch( match );
	}

}
