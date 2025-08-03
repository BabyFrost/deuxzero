package com.frost.deuxzero.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
public class Joueur {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
    private Long id;
	
	@Column(name = "NAME")
    private String name;
	
	@Column(name = "FIRSTNAME")
    private String firstname;
	
	@Column(name = "LASTNAME")
    private String lastname;
	
	@Column(name = "HANDLE")
    private String handle;
	
	@ManyToOne
	@JsonBackReference(value="jouers_sante")
	@JoinColumn(name="SANTE")
	private Sante sante;
	
	//@ManyToMany(  cascade=CascadeType.REMOVE )
	//@JoinTable( name = "T_JOUEURS_EQUIPE", joinColumns = @JoinColumn(name = "JOUEUR"), inverseJoinColumns = @JoinColumn(name = "EQUIPE") )
	@ManyToMany(  mappedBy="joueurs" )
	@JsonBackReference(value="joueurs_de_equipe")
	private List<MatchEquipe> matchs = new ArrayList<>();
	
	@OneToMany(mappedBy = "joueur", cascade=CascadeType.ALL)
	@JsonManagedReference(value="highlights_joueur")
	private List<MatchHighlight> highlights = new ArrayList<>();
	
	@OneToMany(mappedBy = "capitaine", cascade=CascadeType.ALL)
	@JsonManagedReference(value="capitaine_equipe")
	private List<MatchEquipe> capitanats = new ArrayList<>();
	
	@OneToMany(mappedBy = "buteur", cascade=CascadeType.ALL)
	@JsonManagedReference(value="buts_joueur")
	private List<But> buts = new ArrayList<>();
	
	@OneToMany(mappedBy = "passeur", cascade=CascadeType.ALL)
	@JsonManagedReference(value="passes_joueur")
	private List<But> passes = new ArrayList<>();
	
	@OneToMany(mappedBy = "motm", cascade=CascadeType.ALL)
	@JsonManagedReference(value="motm_joueur")
	private List<Matchx> motms = new ArrayList<>();
	
	@OneToMany(mappedBy = "votant", cascade=CascadeType.ALL)
	@JsonManagedReference(value="MotmVotant_joueur")
	private List<MotmVote> mesVotes = new ArrayList<>();
	
	@OneToMany(mappedBy = "vote", cascade=CascadeType.ALL)
	@JsonManagedReference(value="MotmVote_joueur")
	private List<MotmVote> votesRecus = new ArrayList<>();
	
	@Override
	public int hashCode() {
	    return Objects.hash(id); // only use ID or simple immutable fields
	}
	
	@Override
	public boolean equals(Object o) {
	    if (this == o) return true;
	    if (o == null || getClass() != o.getClass()) return false;
	    Joueur joueur = (Joueur) o;
	    return Objects.equals(id, joueur.id);
	}
}
