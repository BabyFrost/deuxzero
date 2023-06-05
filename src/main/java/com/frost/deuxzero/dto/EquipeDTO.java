package com.frost.deuxzero.dto;

import java.util.ArrayList;
import java.util.List;

import com.frost.deuxzero.model.Equipe;
import com.frost.deuxzero.model.MatchEquipe;

public class EquipeDTO {
	
    private Long id;
    private String name;
	private SanteDTOShort sante;
	private List<MatchEquipeDTO> matchs = new ArrayList<>();
	
	public EquipeDTO() { }
	
	public EquipeDTO( Equipe equipe) {
		
		this.id = equipe.getId();
		this.name = equipe.getName();
		this.sante = new SanteDTOShort( equipe.getSante() );
		
		List<MatchEquipe> listMatchsEquipe =equipe.getMatchs();
		for ( int i=0; i<listMatchsEquipe.size(); i++ ) {
			matchs.add( new MatchEquipeDTO( listMatchsEquipe.get(i) ) );
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

	public List<MatchEquipeDTO> getMatchs() {
		return matchs;
	}

	public void setMatchs(List<MatchEquipeDTO> matchs) {
		this.matchs = matchs;
	}

	public SanteDTOShort getSante() {
		return sante;
	}

	public void setSante(SanteDTOShort sante) {
		this.sante = sante;
	}

}
