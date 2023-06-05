package com.frost.deuxzero.dto;

import java.util.ArrayList;
import java.util.List;

import com.frost.deuxzero.model.Equipe;
import com.frost.deuxzero.model.Joueur;
import com.frost.deuxzero.model.Match;
import com.frost.deuxzero.model.Sante;

public class SanteDTO {
	
	private Long id;
	private String name;
	private List<JoueurDTO> joueurs = new ArrayList<>();
	private List<MatchDTO> matchs = new ArrayList<>();
	private List<EquipeDTO> equipes = new ArrayList<>();
	
	public SanteDTO() { }
	
	public SanteDTO( Sante sante) {
		
		this.id = sante.getId();
		this.name = sante.getName();
		
		List<Joueur> listJoueurs = sante.getJoueurs();
		for ( int i=0; i<listJoueurs.size(); i++ ) {
			joueurs.add( new JoueurDTO( listJoueurs.get(i) ) );
		}
		
		List<Match> listMatchs =sante.getMatchs();
		for ( int i=0; i<listMatchs.size(); i++ ) {
			matchs.add( new MatchDTO( listMatchs.get(i) ) );
		}
		
		List<Equipe> listEquipes = sante.getEquipes();
		for ( int i=0; i<listEquipes.size(); i++ ) {
			equipes.add( new EquipeDTO( listEquipes.get(i) ) );
		}
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<JoueurDTO> getJoueurs() {
		return joueurs;
	}

	public void setJoueurs(List<JoueurDTO> joueurs) {
		this.joueurs = joueurs;
	}

	public List<MatchDTO> getMatchs() {
		return matchs;
	}

	public void setMatchs(List<MatchDTO> matchs) {
		this.matchs = matchs;
	}

	public List<EquipeDTO> getEquipes() {
		return equipes;
	}

	public void setEquipes(List<EquipeDTO> equipes) {
		this.equipes = equipes;
	}

}
