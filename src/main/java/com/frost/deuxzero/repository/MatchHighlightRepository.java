package com.frost.deuxzero.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frost.deuxzero.model.MatchHighlight;
import com.frost.deuxzero.model.Matchx;

@Repository
public interface MatchHighlightRepository extends JpaRepository <MatchHighlight, Long> {
	
	List<MatchHighlight> findAllByMatch(Matchx match);

}
