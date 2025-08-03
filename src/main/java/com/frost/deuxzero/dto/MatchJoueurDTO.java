package com.frost.deuxzero.dto;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.frost.deuxzero.model.But;
import com.frost.deuxzero.model.Joueur;
import com.frost.deuxzero.model.Matchx;

public class MatchJoueurDTO {

	private Long id;
    private String date;
	private SanteDTO sante;
	private MatchEquipeDTO equipeA;
	private MatchEquipeDTO equipeB;
	private List<ButDTO> buts = new ArrayList<>();
	private JoueurDTOShort motm;
	private String resultat;
	private int butsM;
	private int passesD;
	
	public MatchJoueurDTO () { }
	
	public MatchJoueurDTO ( Matchx match, Joueur joueur) {
		
		this.id = match.getId();
		this.date = new SimpleDateFormat("dd/MM/yyyy").format( match.getDate() );
		this.sante = new SanteDTO( match.getSante() );
		this.equipeA = new MatchEquipeDTO( match.getEquipeA() );
		this.equipeB = new MatchEquipeDTO( match.getEquipeB() );
		this.motm = new JoueurDTOShort( match.getMotm() );
		
		List<But> listButs = match.getButs();
		for ( But but : listButs ) {
			if (but.getButeur().getId() == joueur.getId() ) {
				butsM++;
			} else if ( but.getPasseur().getId() == joueur.getId() ) {
				passesD++;
			}
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

	public JoueurDTOShort getMotm() {
		return motm;
	}

	public void setMotm(JoueurDTOShort motm) {
		this.motm = motm;
	}

	public String getResultat() {
		return resultat;
	}

	public void setResultat(String resultat) {
		this.resultat = resultat;
	}

	public int getButsM() {
		return butsM;
	}

	public void setButsM(int butsM) {
		this.butsM = butsM;
	}

	public int getPassesD() {
		return passesD;
	}

	public void setPassesD(int passesD) {
		this.passesD = passesD;
	}
	
}
