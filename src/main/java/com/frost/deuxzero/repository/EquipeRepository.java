package com.frost.deuxzero.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.frost.deuxzero.model.Equipe;

@Repository
public interface EquipeRepository extends CrudRepository < Equipe, Long > {

}
