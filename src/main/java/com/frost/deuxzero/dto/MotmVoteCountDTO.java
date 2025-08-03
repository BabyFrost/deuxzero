package com.frost.deuxzero.dto;

import com.frost.deuxzero.model.Joueur;

public class MotmVoteCountDTO {

	private JoueurDTOShort joueur;
	private int count;
	
	public MotmVoteCountDTO () { }
	
	public MotmVoteCountDTO (Joueur joueur, Integer count) {
		this.joueur = new JoueurDTOShort(joueur);
		this.count = count;
	}

	public JoueurDTOShort getJoueur() {
		return joueur;
	}

	public void setJoueur(JoueurDTOShort joueur) {
		this.joueur = joueur;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
