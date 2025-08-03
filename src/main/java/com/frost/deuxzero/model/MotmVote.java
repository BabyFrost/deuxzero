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
public class MotmVote {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
    private Long id;
	
	@Column(name = "DATE")
    private Long date;
	
	@ManyToOne
	@JsonBackReference(value="MotmVotant_joueur")
	@JoinColumn(name="VOTANT")
	private Joueur votant;
	
	
	@ManyToOne
	@JsonBackReference(value="MotmVote_joueur")
	@JoinColumn(name="VOTE")
	private Joueur vote;
	
	@ManyToOne
	@JsonBackReference(value="MotmVote_match")
	@JoinColumn(name="MATCH_X")
	private Matchx match;

}
