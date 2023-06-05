package com.frost.deuxzero.dto;

import com.frost.deuxzero.model.MatchEquipe;

public class MatchEquipeDTOShort {
	
    private Long id;
    private String name;
    private String resultat;
    private int marques;
    private int encaisses;
	
	public MatchEquipeDTOShort () { }
	
	public MatchEquipeDTOShort ( MatchEquipe matchEquipe) {
		
		this.id = matchEquipe.getId();
		this.name = matchEquipe.getName();
		this.resultat = matchEquipe.getResultat();
		this.marques = matchEquipe.getMarques();
		this.encaisses = matchEquipe.getEncaisses();
		
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

	public String getResultat() {
		return resultat;
	}

	public void setResultat(String resultat) {
		this.resultat = resultat;
	}

	public int getMarques() {
		return marques;
	}

	public void setMarques(int marques) {
		this.marques = marques;
	}

	public int getEncaisses() {
		return encaisses;
	}

	public void setEncaisses(int encaisses) {
		this.encaisses = encaisses;
	}

}
