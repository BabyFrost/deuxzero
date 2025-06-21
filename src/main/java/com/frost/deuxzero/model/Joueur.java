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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
public class Joueur {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
    private Long id;
	
	@Column(name = "NAME")
    private String name;
	
	@ManyToOne
	@JsonBackReference(value="jouers_sante")
	@JoinColumn(name="SANTE")
	private Sante sante;
	
	//@ManyToMany(  cascade=CascadeType.REMOVE )
	//@JoinTable( name = "T_JOUEURS_EQUIPE", joinColumns = @JoinColumn(name = "JOUEUR"), inverseJoinColumns = @JoinColumn(name = "EQUIPE") )
	@ManyToMany(  mappedBy="joueurs" )
	@JsonBackReference(value="joueurs_de_equipe")
	private List<MatchEquipe> matchs = new ArrayList<>();
	
	@OneToMany(mappedBy = "capitaine", cascade=CascadeType.ALL)
	@JsonManagedReference(value="capitaine_equipe")
	private List<MatchEquipe> capitanats = new ArrayList<>();
	
	@OneToMany(mappedBy = "buteur", cascade=CascadeType.ALL)
	@JsonManagedReference(value="buts_joueur")
	private List<But> buts = new ArrayList<>();
	
	@OneToMany(mappedBy = "passeur", cascade=CascadeType.ALL)
	@JsonManagedReference(value="passes_joueur")
	private List<But> passes = new ArrayList<>();
	
	@OneToMany(mappedBy = "motm", cascade=CascadeType.ALL)
	@JsonManagedReference(value="motm_joueur")
	private List<Matchx> motms = new ArrayList<>();
}
