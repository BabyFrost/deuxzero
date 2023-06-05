package com.frost.deuxzero.dto;

import com.frost.deuxzero.model.Joueur;

public class JoueurDTOShort {
	
	private Long id;
	private String name;
	private String sante;
	
	public JoueurDTOShort () { }
	
	public JoueurDTOShort ( Joueur joueur) {
		
		this.id = joueur.getId();
		this.name = joueur.getName();
		this.sante = joueur.getSante().getName();
		
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

	public String getSante() {
		return sante;
	}

	public void setSante(String sante) {
		this.sante = sante;
	}

}
