package com.frost.deuxzero.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frost.deuxzero.model.Joueur;
import com.frost.deuxzero.model.Matchx;
import com.frost.deuxzero.model.MotmVote;

@Repository
public interface MotmVoteRepository extends JpaRepository <MotmVote, Long> {

	List<MotmVote> findAllByMatchAndVotant(Matchx match, Joueur votant);
	
}
