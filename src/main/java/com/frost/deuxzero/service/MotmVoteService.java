package com.frost.deuxzero.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frost.deuxzero.exception.ResourceConflictException;
import com.frost.deuxzero.exception.ResourceNotFoundException;
import com.frost.deuxzero.model.Joueur;
import com.frost.deuxzero.model.Matchx;
import com.frost.deuxzero.model.MotmVote;
import com.frost.deuxzero.repository.MotmVoteRepository;

@Service
public class MotmVoteService {
	
	@Autowired
	private MotmVoteRepository motmVoteRepository;
	
	public MotmVote getMotmVoteById( Long id ) throws ResourceNotFoundException {	
		return motmVoteRepository.findById(id).orElseThrow( () -> new ResourceNotFoundException("No such MotmVote !") );
	}
	
	public List<MotmVote> getAllMotmVotes() throws ResourceNotFoundException {	
		List<MotmVote> motmVotes = new ArrayList<>();	
		motmVoteRepository.findAll().forEach(motmVotes::add);	
		return motmVotes;
	}
	
	public List<MotmVote> getAllMotmVotesByMatchAndVotant( Matchx match, Joueur votant ) throws ResourceNotFoundException {	
		List<MotmVote> motmVotes = new ArrayList<>();	
		motmVoteRepository.findAllByMatchAndVotant(match, votant).forEach(motmVotes::add);	
		return motmVotes;
	}
	
	public MotmVote saveMotmVote( MotmVote motmVote ) {
		return motmVoteRepository.save(motmVote);
	}
	
	public MotmVote createMotmVote( MotmVote motmVote ) throws ResourceConflictException {	
		Optional<MotmVote> motmVoteTmp = motmVoteRepository.findById( motmVote.getId() );
		if ( motmVoteTmp.isPresent() ) { throw new ResourceConflictException("MotmVote existe deja"); }	
		return saveMotmVote( motmVote );
	}

}
