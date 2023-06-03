package com.frost.deuxzero.dto;

import com.frost.deuxzero.model.Joueur;

public class JoueurDTO {
	
	private Long id;
	
	private String name;
	
	public JoueurDTO () { }
	
	public JoueurDTO ( Joueur joueur) {
		
		this.id = joueur.getId();
		this.name = joueur.getName();
		
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

}
