package com.frost.deuxzero.model;

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
public class But {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
    private Long id;
	
	@ManyToOne
	@JsonBackReference(value="buts_joueur")
	@JoinColumn(name="BUTEUR")
	private Joueur buteur;
	
	@ManyToOne
	@JsonBackReference(value="passes_joueur")
	@JoinColumn(name="PASSEUR")
	private Joueur passeur;
	
	@ManyToOne
	@JsonBackReference(value="buts_equipe")
	@JoinColumn(name="EQUIPE")
	private MatchEquipe equipe;
	
	@ManyToOne
	@JsonBackReference(value="buts_match")
	@JoinColumn(name="MATCH")
	private Match match;
	
	@Column(name = "MINUTE")
    private int minute;

}
