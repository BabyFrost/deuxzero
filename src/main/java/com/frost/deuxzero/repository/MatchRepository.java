package com.frost.deuxzero.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frost.deuxzero.model.MatchEquipe;
import com.frost.deuxzero.model.Matchx;
import com.frost.deuxzero.model.Sante;

@Repository
public interface MatchRepository extends JpaRepository < Matchx, Long > {
	
	//Optional<Joueur> findByName(String name);
	List<Matchx> findAllByOrderByDateAsc();
	
	List<Matchx> findBySanteOrderByDateAsc( Sante sante );
	
	//List<Matchx> findByJoueurOrderByDateAsc( Joueur joueur );
	
	Optional<Matchx> findByEquipeA( MatchEquipe equipe );
	
	Optional<Matchx> findByEquipeB( MatchEquipe equipe );

}
