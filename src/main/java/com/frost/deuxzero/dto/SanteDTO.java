package com.frost.deuxzero.dto;

import java.util.ArrayList;
import java.util.List;

import com.frost.deuxzero.model.Equipe;
import com.frost.deuxzero.model.Joueur;
import com.frost.deuxzero.model.Matchx;
import com.frost.deuxzero.model.Sante;

public class SanteDTO {
	
	private Long id;
	private String name;
	private List<JoueurDTOShort> joueurs = new ArrayList<>();
	private List<MatchDTOShort> matchs = new ArrayList<>();
	private List<EquipeDTOShort> equipes = new ArrayList<>();
	
	public SanteDTO() { }
	
	public SanteDTO( Sante sante) {
		
		this.id = sante.getId();
		this.name = sante.getName();
		
		List<Joueur> listJoueurs = sante.getJoueurs();
		for ( int i=0; i<listJoueurs.size(); i++ ) {
			joueurs.add( new JoueurDTOShort( listJoueurs.get(i) ) );
		}
		
		List<Matchx> listMatchs =sante.getMatchs();
		for ( int i=0; i<listMatchs.size(); i++ ) {
			matchs.add( new MatchDTOShort( listMatchs.get(i) ) );
		}
		
		List<Equipe> listEquipes = sante.getEquipes();
		for ( int i=0; i<listEquipes.size(); i++ ) {
			equipes.add( new EquipeDTOShort( listEquipes.get(i) ) );
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

	public List<JoueurDTOShort> getJoueurs() {
		return joueurs;
	}

	public void setJoueurs(List<JoueurDTOShort> joueurs) {
		this.joueurs = joueurs;
	}

	public List<MatchDTOShort> getMatchs() {
		return matchs;
	}

	public void setMatchs(List<MatchDTOShort> matchs) {
		this.matchs = matchs;
	}

	public List<EquipeDTOShort> getEquipes() {
		return equipes;
	}

	public void setEquipes(List<EquipeDTOShort> equipes) {
		this.equipes = equipes;
	}

}
