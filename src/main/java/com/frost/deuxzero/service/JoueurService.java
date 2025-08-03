package com.frost.deuxzero.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frost.deuxzero.exception.ResourceConflictException;
import com.frost.deuxzero.exception.ResourceNotFoundException;
import com.frost.deuxzero.model.Joueur;
import com.frost.deuxzero.repository.JoueurRepository;

@Service
public class JoueurService {
	
	@Autowired
	private JoueurRepository joueurRepository;
	
	public Joueur getJoueurById( Long id ) throws ResourceNotFoundException {	
		return joueurRepository.findById(id).orElseThrow( () -> new ResourceNotFoundException("No such Joueur !") );
	}
	
	public Joueur getJoueurByName( String name ) throws ResourceNotFoundException {	
		return joueurRepository.findByName(name).orElseThrow( () -> new ResourceNotFoundException("No such Joueur !") );
	}
	
	public Joueur getJoueurByHandle( String handle ) throws ResourceNotFoundException {	
		return joueurRepository.findByHandle(handle).orElseThrow( () -> new ResourceNotFoundException("No such Handle !") );
	}
	
	public List<Joueur> getAllJoueurs() throws ResourceNotFoundException {	
		List<Joueur> joueurs = new ArrayList<>();	
		joueurRepository.findAll().forEach(joueurs::add);	
		return joueurs;
	}
	
	public Joueur saveJoueur( Joueur joueur ) {
		return joueurRepository.save(joueur);
	}
	
	public Joueur createJoueur( Joueur joueur ) throws ResourceConflictException {	
		Optional<Joueur> joueurTmp = joueurRepository.findById( joueur.getId() );
		if ( joueurTmp.isPresent() ) { throw new ResourceConflictException("Joueur existe deja"); }	
		return saveJoueur( joueur );
	}

}
