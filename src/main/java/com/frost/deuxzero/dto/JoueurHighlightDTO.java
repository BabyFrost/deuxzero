package com.frost.deuxzero.dto;

import com.frost.deuxzero.model.MatchHighlight;

public class JoueurHighlightDTO {

	private Long id;
	private MatchDTOShort match;
	private String description;
	
	public JoueurHighlightDTO () { }
	
	public JoueurHighlightDTO (MatchHighlight matchHighlight) {
		this.id = matchHighlight.getId();
		this.match = new MatchDTOShort( matchHighlight.getMatch() );
		this.description = matchHighlight.getDescription();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public MatchDTOShort getMatch() {
		return match;
	}

	public void setMatch(MatchDTOShort match) {
		this.match = match;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
