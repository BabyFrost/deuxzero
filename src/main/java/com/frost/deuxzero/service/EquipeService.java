package com.frost.deuxzero.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frost.deuxzero.exception.ResourceConflictException;
import com.frost.deuxzero.exception.ResourceNotFoundException;
import com.frost.deuxzero.model.Equipe;
import com.frost.deuxzero.repository.EquipeRepository;

@Service
public class EquipeService {
	
	@Autowired
	private EquipeRepository equipeRepository;
	
	public Equipe getEquipeById( Long id ) throws ResourceNotFoundException {	
		return equipeRepository.findById(id).orElseThrow( () -> new ResourceNotFoundException("No such equipe !") );
	}
	
	public List<Equipe> getAllEquipes() throws ResourceNotFoundException {	
		List<Equipe> equipes = new ArrayList<>();	
		equipeRepository.findAll().forEach(equipes::add);	
		return equipes;
	}
	
	public Equipe saveEquipe( Equipe equipe ) {
		return equipeRepository.save(equipe);
	}
	
	public Equipe createEquipe( Equipe equipe ) throws ResourceConflictException {	
		Optional<Equipe> equipeTmp = equipeRepository.findById( equipe.getId() );
		if ( equipeTmp.isPresent() ) { throw new ResourceConflictException("Equipe existe deja"); }	
		return saveEquipe( equipe );
	}

}
