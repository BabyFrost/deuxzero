package com.frost.deuxzero.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.frost.deuxzero.model.Joueur;
import com.frost.deuxzero.model.MatchEquipe;
import com.frost.deuxzero.model.Matchx;

@Repository
public interface MatchEquipeRepository extends CrudRepository < MatchEquipe, Long > {

	Optional<MatchEquipe> findByMatchsAsA(Matchx matchsAsA);
	Optional<MatchEquipe> findByMatchsAsB(Matchx matchsAsB);
	
}
