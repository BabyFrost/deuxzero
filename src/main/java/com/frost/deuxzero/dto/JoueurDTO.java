package com.frost.deuxzero.dto;

import java.util.ArrayList;
import java.util.List;

import com.frost.deuxzero.model.But;
import com.frost.deuxzero.model.Joueur;
import com.frost.deuxzero.model.Match;
import com.frost.deuxzero.model.MatchEquipe;

public class JoueurDTO {
	
	private Long id;
	private String name;
	private SanteDTOShort sante;
	private List<MatchEquipeDTOShort> matchs = new ArrayList<>();
	private List<MatchEquipeDTOShort> capitanats = new ArrayList<>();
	private List<ButDTOShort> buts = new ArrayList<>();
	private List<ButDTOShort> passes = new ArrayList<>();
	private List<MatchDTOShort> motms = new ArrayList<>();
	private int points;
	private int matchsJ;
	private int victoires;
	private int nuls;
	private int defaites;
	private int butsM;
	private int passesD;
	private int butsME;
	private int butsEE;
	private int motmsR;
	
	public JoueurDTO () { }
	
	public JoueurDTO ( Joueur joueur) {
		
		this.id = joueur.getId();
		this.name = joueur.getName();
		this.sante = new SanteDTOShort( joueur.getSante() );
		
		List<MatchEquipe> listMatch = joueur.getMatchs();
		for ( int i=0; i<listMatch.size(); i++ ) {
			matchs.add( new MatchEquipeDTOShort( listMatch.get(i) ) );
		}
		
		List<MatchEquipe> listCapitanats = joueur.getCapitanats();
		for ( int i=0; i<listCapitanats.size(); i++ ) {
			capitanats.add( new MatchEquipeDTOShort( listCapitanats.get(i) ) );
		}
		
		List<But> listButs = joueur.getButs();
		for ( int i=0; i<listButs.size(); i++ ) {
			buts.add( new ButDTOShort( listButs.get(i) ) );
		}
		
		List<But> listPasses = joueur.getPasses();
		for ( int i=0; i<listPasses.size(); i++ ) {
			passes.add( new ButDTOShort( listPasses.get(i) ) );
		}
		
		List<Match> listMotms = joueur.getMotms();
		for ( int i=0; i<listMotms.size(); i++ ) {
			motms.add( new MatchDTOShort( listMotms.get(i) ) );
		}
		
		this.matchsJ = matchs.size();
		this.butsM = buts.size();
		this.passesD = passes.size();
		this.motmsR = motms.size();
		
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

	public List<MatchEquipeDTOShort> getMatchs() {
		return matchs;
	}

	public void setMatchs(List<MatchEquipeDTOShort> matchs) {
		this.matchs = matchs;
	}

	public List<MatchEquipeDTOShort> getCapitanats() {
		return capitanats;
	}

	public void setCapitanats(List<MatchEquipeDTOShort> capitanats) {
		this.capitanats = capitanats;
	}

	public List<ButDTOShort> getButs() {
		return buts;
	}

	public void setButs(List<ButDTOShort> buts) {
		this.buts = buts;
	}

	public List<ButDTOShort> getPasses() {
		return passes;
	}

	public void setPasses(List<ButDTOShort> passes) {
		this.passes = passes;
	}

	public SanteDTOShort getSante() {
		return sante;
	}

	public void setSante(SanteDTOShort sante) {
		this.sante = sante;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getMatchsJ() {
		return matchsJ;
	}

	public void setMatchsJ(int matchsJ) {
		this.matchsJ = matchsJ;
	}

	public int getVictoires() {
		return victoires;
	}

	public void setVictoires(int victoires) {
		this.victoires = victoires;
	}

	public int getNuls() {
		return nuls;
	}

	public void setNuls(int nuls) {
		this.nuls = nuls;
	}

	public int getDefaites() {
		return defaites;
	}

	public void setDefaites(int defaites) {
		this.defaites = defaites;
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

	public int getButsME() {
		return butsME;
	}

	public void setButsME(int butsME) {
		this.butsME = butsME;
	}

	public int getButsEE() {
		return butsEE;
	}

	public void setButsEE(int butsEE) {
		this.butsEE = butsEE;
	}

	public List<MatchDTOShort> getMotms() {
		return motms;
	}

	public void setMotms(List<MatchDTOShort> motms) {
		this.motms = motms;
	}

	public int getMotmsR() {
		return motmsR;
	}

	public void setMotmsR(int motmsR) {
		this.motmsR = motmsR;
	}

}
