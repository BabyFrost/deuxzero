package com.frost.deuxzero.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frost.deuxzero.exception.ResourceConflictException;
import com.frost.deuxzero.exception.ResourceNotFoundException;
import com.frost.deuxzero.model.But;
import com.frost.deuxzero.model.Joueur;
import com.frost.deuxzero.model.Matchx;
import com.frost.deuxzero.repository.ButRepository;

@Service
public class ButService {
	
	@Autowired
	private ButRepository butRepository;
	
	public But getButById( Long id ) throws ResourceNotFoundException {	
		return butRepository.findById(id).orElseThrow( () -> new ResourceNotFoundException("No such But !") );
	}
	
	public List<But> getAllButs() throws ResourceNotFoundException {	
		List<But> buts = new ArrayList<>();	
		butRepository.findAll().forEach(buts::add);	
		return buts;
	}
	
	public List<But> getAllButsByMatchAndButeur(Matchx match, Joueur buteur) throws ResourceNotFoundException {	
		List<But> buts = new ArrayList<>();	
		butRepository.findAllByMatchAndButeur(match, buteur).forEach(buts::add);	
		return buts;
	}
	
	public List<But> getAllButsByMatchAndPasseur(Matchx match, Joueur passeur) throws ResourceNotFoundException {	
		List<But> passesD = new ArrayList<>();	
		butRepository.findAllByMatchAndPasseur(match, passeur).forEach(passesD::add);	
		return passesD;
	}
	
	public But saveBut( But but ) {
		return butRepository.save(but);
	}
	
	public But createBut( But but ) throws ResourceConflictException {	
		Optional<But> butTmp = butRepository.findById( but.getId() );
		if ( butTmp.isPresent() ) { throw new ResourceConflictException("But existe deja"); }	
		return saveBut( but );
	}

}
