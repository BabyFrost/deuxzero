package com.frost.deuxzero.dto;

import com.frost.deuxzero.model.Sante;

public class SanteDTO {
	
	private Long id;
	
	private String name;
	
	public SanteDTO() { }
	
	public SanteDTO( Sante sante) {
		
		this.id = sante.getId();
		this.name = sante.getName();
		
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
