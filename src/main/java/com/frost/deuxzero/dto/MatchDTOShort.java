package com.frost.deuxzero.dto;

import java.text.SimpleDateFormat;

import com.frost.deuxzero.model.Matchx;

public class MatchDTOShort {
	
    private Long id;
    private String date;
	private Long equipeA;
	private Long equipeB;
	
	public MatchDTOShort () { }
	
	public MatchDTOShort ( Matchx match) {
		
		this.id = match.getId();
		this.date = new SimpleDateFormat("dd/MM/yyyy").format( match.getDate() );
		this.equipeA = match.getEquipeA().getId();
		this.equipeB = match.getEquipeA().getId();
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
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
