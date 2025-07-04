package com.frost.deuxzero.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.frost.deuxzero.model.But;
import com.frost.deuxzero.model.Joueur;
import com.frost.deuxzero.model.Matchx;

@Repository
public interface ButRepository extends CrudRepository < But, Long > {

	List<But> findAllByMatchAndButeur(Matchx match, Joueur buteur);
	List<But> findAllByMatchAndPasseur(Matchx match, Joueur passeur);
	
}
