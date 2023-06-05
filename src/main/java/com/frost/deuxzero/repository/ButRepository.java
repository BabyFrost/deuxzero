package com.frost.deuxzero.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.frost.deuxzero.model.But;

@Repository
public interface ButRepository extends CrudRepository < But, Long > {

}
