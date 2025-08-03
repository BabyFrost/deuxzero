package com.frost.deuxzero.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frost.deuxzero.model.Joueur;

@Repository
public interface JoueurRepository extends JpaRepository < Joueur, Long > {
	
	Optional<Joueur> findByName(String name);
	
	Optional<Joueur> findByHandle(String handle);

}
