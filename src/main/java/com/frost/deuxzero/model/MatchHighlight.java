package com.frost.deuxzero.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class MatchHighlight {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
    private Long id;
	
	@ManyToOne
	@JsonBackReference(value="highlights_match")
	@JoinColumn(name="MATCH_X")
	private Matchx match;
	
	@ManyToOne
	@JsonBackReference(value="highlights_equipe")
	@JoinColumn(name="EQUIPE")
	private MatchEquipe equipe;
	
	@ManyToOne
	@JsonBackReference(value="highlights_joueur")
	@JoinColumn(name="JOUEUR")
	private Joueur joueur;
	
	@Column(name = "DESCRIPTION")
    private String description;

}
