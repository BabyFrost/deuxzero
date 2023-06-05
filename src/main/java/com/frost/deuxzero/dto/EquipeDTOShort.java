package com.frost.deuxzero.dto;

import com.frost.deuxzero.model.Equipe;

public class EquipeDTOShort {
	
    private Long id;
    private String name;
	
	public EquipeDTOShort() { }
	
	public EquipeDTOShort( Equipe equipe) {
		
		this.id = equipe.getId();
		this.name = equipe.getName();
		
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
