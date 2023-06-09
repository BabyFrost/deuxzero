package com.frost.deuxzero.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.frost.deuxzero.model.Joueur;

@Repository
public interface JoueurRepository extends CrudRepository < Joueur, Long > {
	
	Optional<Joueur> findByName(String name);

}
