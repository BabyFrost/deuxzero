package com.frost.deuxzero.dto;

import com.frost.deuxzero.model.But;

public class ButDTOShort {
	
    private Long id;
	private Long buteur;
	private Long passeur;
	
	public ButDTOShort () { }
	
	public ButDTOShort ( But but) {
		
		this.id = but.getId();
		this.buteur = but.getButeur().getId();
		
		if ( but.getPasseur() != null ) {
			this.passeur = but.getPasseur().getId();
		}
		
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getButeur() {
		return buteur;
	}

	public void setButeur(Long buteur) {
		this.buteur = buteur;
	}

	public Long getPasseur() {
		return passeur;
	}

	public void setPasseur(Long passeur) {
		this.passeur = passeur;
	}

}
