package com.frost.deuxzero.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Match {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
    private Long id;
	
	@Column(name = "DATE")
    private Long date;
	
	@ManyToOne
	@JsonBackReference(value="matchs_sante")
	@JoinColumn(name="SANTE")
	private Sante sante;
	
	@OneToOne(mappedBy = "matchsAsA")
	@JoinColumn(name="EQUIPE_A")
	@JsonBackReference(value="equipeA_match")
	private MatchEquipe equipeA;
	
	@OneToOne(mappedBy = "matchsAsB")
	@JoinColumn(name="EQUIPE_B")
	@JsonBackReference(value="equipeB_match")
	private MatchEquipe equipeB;
	
	@OneToMany(mappedBy = "match", cascade=CascadeType.ALL)
	@JsonManagedReference(value="buts_match")
	private List<But> buts = new ArrayList<>();

}
