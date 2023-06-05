package com.frost.deuxzero.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.frost.deuxzero.model.Match;

@Repository
public interface MatchRepository extends CrudRepository < Match, Long > {

}
