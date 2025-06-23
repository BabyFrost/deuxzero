package com.frost.deuxzero.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frost.deuxzero.exception.ResourceConflictException;
import com.frost.deuxzero.exception.ResourceNotFoundException;
import com.frost.deuxzero.model.MatchHighlight;
import com.frost.deuxzero.model.Matchx;
import com.frost.deuxzero.repository.MatchHighlightRepository;

@Service
public class MatchHighlightService {
	
	@Autowired
	private MatchHighlightRepository matchHighlightRepository;
	
	public MatchHighlight getMatchHighlightById( Long id ) throws ResourceNotFoundException {	
		return matchHighlightRepository.findById(id).orElseThrow( () -> new ResourceNotFoundException("No such MatchHighlight !") );
	}
	
	public List<MatchHighlight> getAllMatchHighlights() throws ResourceNotFoundException {	
		List<MatchHighlight> matchHighlights = new ArrayList<>();	
		matchHighlightRepository.findAll().forEach(matchHighlights::add);	
		return matchHighlights;
	}
	
	public List<MatchHighlight> getAllMatchHighlightsByMatch(Matchx match) throws ResourceNotFoundException {	
		List<MatchHighlight> matchHighlights = matchHighlightRepository.findAllByMatch(match);
		return matchHighlights;
	}
	
	public MatchHighlight saveMatchHighlight( MatchHighlight matchHighlight ) {
		return matchHighlightRepository.save(matchHighlight);
	}
	
	public MatchHighlight createMatchHighlight( MatchHighlight matchHighlight ) throws ResourceConflictException {	
		Optional<MatchHighlight> matchHighlightTmp = matchHighlightRepository.findById( matchHighlight.getId() );
		if ( matchHighlightTmp.isPresent() ) { throw new ResourceConflictException("MatchHighlight existe deja"); }	
		return saveMatchHighlight( matchHighlight );
	}

}
