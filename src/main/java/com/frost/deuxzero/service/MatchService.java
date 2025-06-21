package com.frost.deuxzero.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frost.deuxzero.exception.ResourceConflictException;
import com.frost.deuxzero.exception.ResourceNotFoundException;
import com.frost.deuxzero.model.MatchEquipe;
import com.frost.deuxzero.model.Matchx;
import com.frost.deuxzero.model.Sante;
import com.frost.deuxzero.repository.MatchRepository;

@Service
public class MatchService {
	
	@Autowired
	private MatchRepository matchRepository;
	
	public Matchx getMatchById( Long id ) throws ResourceNotFoundException {	
		return matchRepository.findById(id).orElseThrow( () -> new ResourceNotFoundException("No such Panier !") );
	}
	
	public Matchx getMatchByEquipeA( MatchEquipe equipe ) throws ResourceNotFoundException {	
		return matchRepository.findByEquipeA(equipe).orElseThrow( () -> new ResourceNotFoundException("No such Panier !") );
	}
	
	public Matchx getMatchByEquipeB( MatchEquipe equipe ) throws ResourceNotFoundException {	
		return matchRepository.findByEquipeB(equipe).orElseThrow( () -> new ResourceNotFoundException("No such Panier !") );
	}
	
	public List<Matchx> getAllMatchs() throws ResourceNotFoundException {	
		List<Matchx> matchs = new ArrayList<>();	
		matchRepository.findAll().forEach(matchs::add);	
		return matchs;
	}
	
	public List<Matchx> getAllMatchsOrderByDateAsc() throws ResourceNotFoundException {	
		List<Matchx> matchs = new ArrayList<>();	
		matchRepository.findAllByOrderByDateAsc().forEach(matchs::add);	
		return matchs;
	}
	
	public List<Matchx> getAllMatchsBySanteOrderByDateAsc( Sante sante ) throws ResourceNotFoundException {	
		List<Matchx> matchs = new ArrayList<>();	
		matchRepository.findBySanteOrderByDateAsc( sante ).forEach(matchs::add);	
		return matchs;
	}
	
	public Matchx saveMatch( Matchx match ) {
		return matchRepository.save(match);
	}
	
	public Matchx createMatch( Matchx match ) throws ResourceConflictException {	
		Optional<Matchx> matchTmp = matchRepository.findById( match.getId() );
		if ( matchTmp.isPresent() ) { throw new ResourceConflictException("Match existe deja"); }	
		return saveMatch( match );
	}

}
