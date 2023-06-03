package com.frost.deuxzero.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.frost.deuxzero.model.Sante;

@Repository
public interface SanteRepository extends CrudRepository < Sante, Long > {

}
