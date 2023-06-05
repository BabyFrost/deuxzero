package com.frost.deuxzero.dto;

import java.util.ArrayList;
import java.util.List;

import com.frost.deuxzero.model.But;
import com.frost.deuxzero.model.Joueur;
import com.frost.deuxzero.model.MatchEquipe;

public class MatchEquipeDTO {
	
    private Long id;
    private String name;
    private String resultat;
    private int marques;
    private int encaisses;
	private SanteDTOShort sante;
	private EquipeDTOShort equipe;
	private MatchDTOShort matchsAsA;
	private MatchDTOShort matchsAsB;
	private List<JoueurDTOShort> joueurs = new ArrayList<>();
	private JoueurDTOShort capitaine;
	private List<ButDTOShort> buts = new ArrayList<>();
	
	public MatchEquipeDTO () { }
	
	public MatchEquipeDTO ( MatchEquipe matchEquipe) {
		
		this.id = matchEquipe.getId();
		this.name = matchEquipe.getName();
		this.resultat = matchEquipe.getResultat();
		this.marques = matchEquipe.getMarques();
		this.encaisses = matchEquipe.getEncaisses();
		this.equipe = new EquipeDTOShort( matchEquipe.getEquipe() );	
		if (matchEquipe.getMatchsAsA() != null ) {
			this.matchsAsA = new MatchDTOShort( matchEquipe.getMatchsAsA() );
		}
		
		if (matchEquipe.getMatchsAsB() != null ) {
			this.matchsAsB = new MatchDTOShort( matchEquipe.getMatchsAsB() );
		}
		this.capitaine = new JoueurDTOShort( matchEquipe.getCapitaine() );
		
		List<Joueur> listJoueurs = matchEquipe.getJoueurs();
		for ( int i=0; i<listJoueurs.size(); i++ ) {
			joueurs.add( new JoueurDTOShort( listJoueurs.get(i) ) );
		}
		
		List<But> listButs = matchEquipe.getButs();
		for ( int i=0; i<listButs.size(); i++ ) {
			buts.add( new ButDTOShort( listButs.get(i) ) );
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

	public SanteDTOShort getSante() {
		return sante;
	}

	public void setSante(SanteDTOShort sante) {
		this.sante = sante;
	}

	public EquipeDTOShort getEquipe() {
		return equipe;
	}

	public void setEquipe(EquipeDTOShort equipe) {
		this.equipe = equipe;
	}

	public MatchDTOShort getMatchsAsA() {
		return matchsAsA;
	}

	public void setMatchsAsA(MatchDTOShort matchsAsA) {
		this.matchsAsA = matchsAsA;
	}

	public MatchDTOShort getMatchsAsB() {
		return matchsAsB;
	}

	public void setMatchsAsB(MatchDTOShort matchsAsB) {
		this.matchsAsB = matchsAsB;
	}

	public List<JoueurDTOShort> getJoueurs() {
		return joueurs;
	}

	public void setJoueurs(List<JoueurDTOShort> joueurs) {
		this.joueurs = joueurs;
	}

	public JoueurDTOShort getCapitaine() {
		return capitaine;
	}

	public void setCapitaine(JoueurDTOShort capitaine) {
		this.capitaine = capitaine;
	}

	public List<ButDTOShort> getButs() {
		return buts;
	}

	public void setButs(List<ButDTOShort> buts) {
		this.buts = buts;
	}

}
