package com.frost.deuxzero.dto;

import java.text.SimpleDateFormat;

import com.frost.deuxzero.model.MotmVote;

public class MotmVoteDTO {
	
    private Long id;
    private String date;
	private Long votant;
	private Long vote;
	private Long match;
	private String username;
	
	public MotmVoteDTO () { }
	
	public MotmVoteDTO ( MotmVote motmVote ) {
		this.id = motmVote.getId();
		this.date = new SimpleDateFormat("dd/MM/yyyy").format( motmVote.getDate() );
		this.votant = motmVote.getVotant().getId();
		this.vote = motmVote.getVote().getId();
		this.match = motmVote.getMatch().getId();
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

	public Long getVotant() {
		return votant;
	}

	public void setVotant(Long votant) {
		this.votant = votant;
	}

	public Long getVote() {
		return vote;
	}

	public void setVote(Long vote) {
		this.vote = vote;
	}

	public Long getMatch() {
		return match;
	}

	public void setMatch(Long match) {
		this.match = match;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
