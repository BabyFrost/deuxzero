package com.frost.deuxzero.dto;

import com.frost.deuxzero.model.Matchx;

public class MatchDTOShort {
	
    private Long id;
	private Long equipeA;
	private Long equipeB;
	
	public MatchDTOShort () { }
	
	public MatchDTOShort ( Matchx match) {
		
		this.id = match.getId();
		this.equipeA = match.getEquipeA().getId();
		this.equipeB = match.getEquipeA().getId();
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEquipeA() {
		return equipeA;
	}

	public void setEquipeA(Long equipeA) {
		this.equipeA = equipeA;
	}

	public Long getEquipeB() {
		return equipeB;
	}

	public void setEquipeB(Long equipeB) {
		this.equipeB = equipeB;
	}

}
