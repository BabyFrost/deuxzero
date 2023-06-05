package com.frost.deuxzero.dto;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.frost.deuxzero.model.But;
import com.frost.deuxzero.model.Match;

public class MatchDTO {
	
    private Long id;
    private String date;
	private SanteDTO sante;
	private MatchEquipeDTO equipeA;
	private MatchEquipeDTO equipeB;
	private List<ButDTO> buts = new ArrayList<>();
	
	public MatchDTO () { }
	
	public MatchDTO ( Match match) {
		
		this.id = match.getId();
		this.date = new SimpleDateFormat("dd/MM/yyyy").format( match.getDate() );
		this.sante = new SanteDTO( match.getSante() );
		this.equipeA = new MatchEquipeDTO( match.getEquipeA() );
		this.equipeB = new MatchEquipeDTO( match.getEquipeB() );
		
		List<But> listButs = match.getButs();
		for ( int i=0; i<listButs.size(); i++ ) {
			buts.add( new ButDTO( listButs.get(i) ) );
		}
		
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

	public SanteDTO getSante() {
		return sante;
	}

	public void setSante(SanteDTO sante) {
		this.sante = sante;
	}

	public MatchEquipeDTO getEquipeA() {
		return equipeA;
	}

	public void setEquipeA(MatchEquipeDTO equipeA) {
		this.equipeA = equipeA;
	}

	public MatchEquipeDTO getEquipeB() {
		return equipeB;
	}

	public void setEquipeB(MatchEquipeDTO equipeB) {
		this.equipeB = equipeB;
	}

	public List<ButDTO> getButs() {
		return buts;
	}

	public void setButs(List<ButDTO> buts) {
		this.buts = buts;
	}

}
