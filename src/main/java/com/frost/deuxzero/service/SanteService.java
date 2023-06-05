package com.frost.deuxzero.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frost.deuxzero.exception.ResourceConflictException;
import com.frost.deuxzero.exception.ResourceNotFoundException;
import com.frost.deuxzero.model.Sante;
import com.frost.deuxzero.repository.SanteRepository;

@Service
public class SanteService {

	@Autowired
	private SanteRepository santeRepository;
	
	public Sante getSanteById( Long id ) throws ResourceNotFoundException {	
		return santeRepository.findById(id).orElseThrow( () -> new ResourceNotFoundException("No such Sante !") );
	}
	
	public List<Sante> getAllSantes() throws ResourceNotFoundException {	
		List<Sante> santes = new ArrayList<>();	
		santeRepository.findAll().forEach(santes::add);	
		return santes;
	}
	
	public Sante saveSante( Sante sante ) {
		return santeRepository.save(sante);
	}
	
	public Sante createSante( Sante sante ) throws ResourceConflictException {	
		Optional<Sante> santeTmp = santeRepository.findById( sante.getId() );
		if ( santeTmp.isPresent() ) { throw new ResourceConflictException("Sante existe deja"); }	
		return saveSante( sante );
	}
	
}
