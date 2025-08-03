package com.frost.deuxzero.dto;

import com.frost.deuxzero.model.Sante;

public class SanteDTOShort {
	
	private Long id;
	private String name;
	private String logo;
	private String country;
	private String address;
	private String manager;
	
	public SanteDTOShort() { }
	
	public SanteDTOShort( Sante sante) {
		
		this.id = sante.getId();
		this.name = sante.getName();
		this.logo = sante.getLogo();
		this.country = sante.getCountry();
		this.address = sante.getAddress();
		this.manager = sante.getManager();
		
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

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

}
