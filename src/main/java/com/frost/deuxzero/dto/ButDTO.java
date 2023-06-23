package com.frost.deuxzero.dto;

import com.frost.deuxzero.model.But;

public class ButDTO {
	
    private Long id;
	private JoueurDTOShort buteur;
	private JoueurDTOShort passeur;
	private MatchEquipeDTOShort equipe;
	private MatchDTOShort match;
	
	public ButDTO () { }
	
	public ButDTO ( But but) {
		
		this.id = but.getId();
		this.buteur = new JoueurDTOShort( but.getButeur() );
		
		if ( but.getPasseur() != null ) {
			this.passeur = new JoueurDTOShort( but.getPasseur() );
		}
		
		this.equipe = new MatchEquipeDTOShort( but.getEquipe() );
		this.match = new MatchDTOShort( but.getMatch() );
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public JoueurDTOShort getButeur() {
		return buteur;
	}

	public void setButeur(JoueurDTOShort buteur) {
		this.buteur = buteur;
	}

	public JoueurDTOShort getPasseur() {
		return passeur;
	}

	public void setPasseur(JoueurDTOShort passeur) {
		this.passeur = passeur;
	}

	public MatchEquipeDTOShort getEquipe() {
		return equipe;
	}

	public void setEquipe(MatchEquipeDTOShort equipe) {
		this.equipe = equipe;
	}

	public MatchDTOShort getMatch() {
		return match;
	}

	public void setMatch(MatchDTOShort match) {
		this.match = match;
	}

}
