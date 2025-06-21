package com.frost.deuxzero.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class MatchEquipe {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
    private Long id;
	
	@Column(name = "NAME")
    private String name;
	
	@Column(name = "RESULTAT")
    private String resultat;
	
	@Column(name = "MARQUES")
    private int marques;
	
	@Column(name = "ENCAISSES")
    private int encaisses;
	
	@ManyToOne
	@JsonBackReference(value="matchs_equipe")
	@JoinColumn(name="EQUIPE")
	private Equipe equipe;
	
	@OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "MATCH_AS_A", referencedColumnName = "ID")
	@JsonManagedReference(value="equipeA_match")
	private Matchx matchsAsA;
	
	@OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "MATCH_AS_B", referencedColumnName = "ID")
	@JsonManagedReference(value="equipeB_match")
	private Matchx matchsAsB;
	
	@ManyToMany( cascade=CascadeType.REMOVE )
	@JoinTable( name = "T_JOUEURS_EQUIPE", joinColumns = @JoinColumn(name = "JOUEUR"), inverseJoinColumns = @JoinColumn(name = "EQUIPE") )
	@JsonManagedReference(value="joueurs_de_equipe")
	private List<Joueur> joueurs = new ArrayList<>();
	
	@ManyToOne
	@JsonBackReference(value="capitaine_equipe")
	@JoinColumn(name="CAPITAINE")
	private Joueur capitaine;
	
	@OneToMany(mappedBy = "equipe", cascade=CascadeType.ALL)
	@JsonManagedReference(value="buts_equipe")
	private List<But> buts = new ArrayList<>();

}
