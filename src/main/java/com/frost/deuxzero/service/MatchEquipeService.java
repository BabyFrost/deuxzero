package com.frost.deuxzero.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frost.deuxzero.exception.ResourceConflictException;
import com.frost.deuxzero.exception.ResourceNotFoundException;
import com.frost.deuxzero.model.MatchEquipe;
import com.frost.deuxzero.repository.MatchEquipeRepository;

@Service
public class MatchEquipeService {
	
	@Autowired
	private MatchEquipeRepository matchEquipeRepository;
	
	public MatchEquipe getMatchEquipeById( Long id ) throws ResourceNotFoundException {	
		return matchEquipeRepository.findById(id).orElseThrow( () -> new ResourceNotFoundException("No such MatchEquipe !") );
	}
	
	public List<MatchEquipe> getAllMatchEquipes() throws ResourceNotFoundException {	
		List<MatchEquipe> matchEquipes = new ArrayList<>();	
		matchEquipeRepository.findAll().forEach(matchEquipes::add);	
		return matchEquipes;
	}
	
	public MatchEquipe saveMatchEquipe( MatchEquipe matchEquipe ) {
		return matchEquipeRepository.save(matchEquipe);
	}
	
	public MatchEquipe createMatchEquipe( MatchEquipe matchEquipe ) throws ResourceConflictException {	
		Optional<MatchEquipe> matchEquipeTmp = matchEquipeRepository.findById( matchEquipe.getId() );
		if ( matchEquipeTmp.isPresent() ) { throw new ResourceConflictException("MatchEquipe existe deja"); }	
		return saveMatchEquipe( matchEquipe );
	}

}
