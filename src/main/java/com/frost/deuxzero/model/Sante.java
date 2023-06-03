package com.frost.deuxzero.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
public class Sante {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
    private Long id;
	
	@Column(name = "NAME")
    private String name;
	
	@OneToMany(mappedBy = "sante", cascade=CascadeType.ALL)
	@JsonManagedReference(value="jouers_sante")
	private List<Joueur> joueurs = new ArrayList<>();
	
	@OneToMany(mappedBy = "sante", cascade=CascadeType.ALL)
	@JsonManagedReference(value="matchs_sante")
	private List<Match> matchs = new ArrayList<>();
	
	@OneToMany(mappedBy = "sante", cascade=CascadeType.ALL)
	@JsonManagedReference(value="equipes_sante")
	private List<Equipe> equipes = new ArrayList<>();

}
