package com.frost.deuxzero;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.frost.deuxzero.model.But;
import com.frost.deuxzero.model.Equipe;
import com.frost.deuxzero.model.Joueur;
import com.frost.deuxzero.model.Matchx;
import com.frost.deuxzero.model.MatchEquipe;
import com.frost.deuxzero.model.Sante;
import com.frost.deuxzero.repository.ButRepository;
import com.frost.deuxzero.repository.EquipeRepository;
import com.frost.deuxzero.repository.JoueurRepository;
import com.frost.deuxzero.repository.MatchEquipeRepository;
import com.frost.deuxzero.repository.MatchRepository;
import com.frost.deuxzero.repository.SanteRepository;

@Component
public class DbInit {
	
	@Autowired
	SanteRepository santeRepository;
	
	@Autowired
	JoueurRepository joueurRepository;
	
	@Autowired
	EquipeRepository equipeRepository;
	
	@Autowired
	MatchRepository matchRepository;
	
	@Autowired
	MatchEquipeRepository matchEquipeRepository;
	
	@Autowired
	ButRepository butRepository;
	
	@PostConstruct
    private void postConstruct() {
		
		Sante sante = new Sante();
		sante.setName("ELEVEN SURE");
		santeRepository.save(sante);
		
		Joueur joueur = new Joueur();
		joueur.setName("GILBERT");
		joueur.setSante(sante);
		joueurRepository.save(joueur);
		
			joueur = new Joueur();
			joueur.setName("MOSES");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("TCHOUPO");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("HAROLD");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("BASSOGOG");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("ANCIEN");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("KADJI");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("NDELE");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("POGBA");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("PRESI");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("MENDEZ");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("GHISLAIN");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("LIONEL");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("BRONDON");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("WILFRIED");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("ULRICH");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("KAKA");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("KANTE");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("BLAISO");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("YANNICK");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("BOREL");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("RUDY");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("AHSAN");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("FABRICE");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("DUPLEX");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("CHRISTIAN");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("ANTOINE");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("STYVE");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("NICOLAS");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("BERTRAND");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("RUBEN");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("JOSPAIN");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("MARCEL");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("INVITE");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
		
		Equipe equipe = new Equipe();
		equipe.setName("BLEUS");
		equipe.setSante(sante);
		equipeRepository.save(equipe);
		
			equipe = new Equipe();
			equipe.setName("VERTS");
			equipe.setSante(sante);
			equipeRepository.save(equipe);
			
			equipe = new Equipe();
			equipe.setName("ELEVEN SURE");
			equipe.setSante(sante);
			equipeRepository.save(equipe);
			
			equipe = new Equipe();
			equipe.setName("J.D.N");
			equipe.setSante(sante);
			equipeRepository.save(equipe);
		
		Matchx match = new Matchx();
		match.setSante(sante);
		match.setMotm( joueurRepository.findByName( "BASSOGOG" ).get() );
		match.setDate( 1685876400000L );
		//match.setDate( DateFormatConverter.toLocalDateTimeInMilliseconds(new Date()) );
		matchRepository.save(match);
		
		MatchEquipe matchEquipe = new MatchEquipe();
		matchEquipe.setEquipe( equipeRepository.findById((long) 1).get() );
		matchEquipe.setMatchsAsA(match);
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "HAROLD" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "BASSOGOG" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "MENDEZ" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "GILBERT" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "WILFRIED" ).get() );
		matchEquipe.setCapitaine( joueurRepository.findByName( "BASSOGOG" ).get() );
		matchEquipe.setResultat("V");
		matchEquipe.setMarques(2);
		matchEquipe.setEncaisses(0);
		matchEquipeRepository.save(matchEquipe);
		
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe( equipeRepository.findById((long) 2).get() );
			matchEquipe.setMatchsAsB(match);
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "TCHOUPO" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "POGBA" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "MOSES" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "BOREL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "KANTE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "YANNICK" ).get() );
			matchEquipe.setCapitaine( joueurRepository.findByName( "TCHOUPO" ).get() );
			matchEquipe.setResultat("D");
			matchEquipe.setMarques(0);
			matchEquipe.setEncaisses(2);
			matchEquipeRepository.save(matchEquipe);
			
			But but = new But();
			but.setEquipe( matchEquipeRepository.findById((long) 1).get() );
			but.setMatch(match);
			but.setButeur( joueurRepository.findByName( "BASSOGOG" ).get() );
			but.setPasseur( joueurRepository.findByName( "HAROLD" ).get() );
			but.setMinute(21);
			butRepository.save(but);
			
			but = new But();
			but.setEquipe( matchEquipeRepository.findById((long) 1).get() );
			but.setMatch(match);
			but.setButeur( joueurRepository.findByName( "INVITE" ).get() );
			but.setPasseur( joueurRepository.findByName( "BASSOGOG" ).get() );
			but.setMinute(78);
			butRepository.save(but);
			
			
			
		//DEUXIEME MATCH
		//EQUIPE 1 CE SONT LES BLEUES
		//EQUIPE 2 CE SONT LES VERTS
			
		match = new Matchx();
		match.setSante(sante);
		match.setMotm( joueurRepository.findByName( "TCHOUPO" ).get() );
		match.setDate( 1686466800000L );
		//match.setDate( DateFormatConverter.toLocalDateTimeInMilliseconds(new Date()) );
		matchRepository.save(match);
			
		matchEquipe = new MatchEquipe();
		matchEquipe.setEquipe( equipeRepository.findById((long) 1).get() );
		matchEquipe.setMatchsAsA(match);
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "HAROLD" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "BLAISO" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "MENDEZ" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "KADJI" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "NDELE" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "WILFRIED" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "BOREL" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "GILBERT" ).get() );
		matchEquipe.setCapitaine( joueurRepository.findByName( "GILBERT" ).get() );
		matchEquipe.setResultat("D");
		matchEquipe.setMarques(0);
		matchEquipe.setEncaisses(1);
		matchEquipeRepository.save(matchEquipe);
			
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe( equipeRepository.findById((long) 2).get() );
			matchEquipe.setMatchsAsB(match);
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "PRESI" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "MOSES" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "TCHOUPO" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "BRONDON" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "BASSOGOG" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LIONEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "AHSAN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "POGBA" ).get() );
			matchEquipe.setCapitaine( joueurRepository.findByName( "POGBA" ).get() );
			matchEquipe.setResultat("V");
			matchEquipe.setMarques(1);
			matchEquipe.setEncaisses(0);
			matchEquipeRepository.save(matchEquipe);
				
			but = new But();
			but.setEquipe( matchEquipeRepository.findById((long) 2).get() );
			but.setMatch(match);
			but.setButeur( joueurRepository.findByName( "BASSOGOG" ).get() );
			but.setPasseur( null );
			but.setMinute(31);
			butRepository.save(but);
		
				
				
		//TROISIEME MATCH
				
		match = new Matchx();
		match.setSante(sante);
		match.setMotm( joueurRepository.findByName( "BLAISO" ).get() );
		match.setDate( 1687071600000L );
		matchRepository.save(match);
				
		matchEquipe = new MatchEquipe();
		matchEquipe.setEquipe( equipeRepository.findById((long) 1).get() );
		matchEquipe.setMatchsAsA(match);
		matchEquipe.setCapitaine( joueurRepository.findByName( "BOREL" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "BOREL" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "DUPLEX" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "NDELE" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "CHRISTIAN" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "BLAISO" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "ANCIEN" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "HAROLD" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "AHSAN" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "RUDY" ).get() );
		matchEquipe.setResultat("V");
		matchEquipe.setMarques(2);
		matchEquipe.setEncaisses(1);
		matchEquipeRepository.save(matchEquipe);
				
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe( equipeRepository.findById((long) 2).get() );
			matchEquipe.setMatchsAsB(match);
			matchEquipe.setCapitaine( joueurRepository.findByName( "LIONEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LIONEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "MOSES" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "GILBERT" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "KADJI" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "KAKA" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "TCHOUPO" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "BASSOGOG" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "FABRICE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "WILFRIED" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "MENDEZ" ).get() );
			matchEquipe.setResultat("D");
			matchEquipe.setMarques(1);
			matchEquipe.setEncaisses(2);
			matchEquipeRepository.save(matchEquipe);
					
			but = new But();
			but.setEquipe( matchEquipeRepository.findById((long) 2).get() );
			but.setMatch(match);
			but.setButeur( joueurRepository.findByName( "KADJI" ).get() );
			but.setPasseur( joueurRepository.findByName( "MOSES" ).get() );
			but.setMinute(21);
			butRepository.save(but);
					
			but = new But();
			but.setEquipe( matchEquipeRepository.findById((long) 1).get() );
			but.setMatch(match);
			but.setButeur( joueurRepository.findByName( "BLAISO" ).get() );
			but.setPasseur( joueurRepository.findByName( "BOREL" ).get() );
			but.setMinute(46);
			butRepository.save(but);
			
			but = new But();
			but.setEquipe( matchEquipeRepository.findById((long) 1).get() );
			but.setMatch(match);
			but.setButeur( joueurRepository.findByName( "CHRISTIAN" ).get() );
			but.setPasseur( joueurRepository.findByName( "BLAISO" ).get() );
			but.setMinute(61);
			butRepository.save(but);
			
		
		//QUATRIEME MATCH
			
		match = new Matchx();
		match.setSante(sante);
		match.setMotm( joueurRepository.findByName( "INVITE" ).get() );
		match.setDate( 1687672800000L );
		matchRepository.save(match);
					
		matchEquipe = new MatchEquipe();
		matchEquipe.setEquipe( equipeRepository.findById((long) 1).get() );
		matchEquipe.setMatchsAsA(match);
		matchEquipe.setCapitaine( joueurRepository.findByName( "BASSOGOG" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "BASSOGOG" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "BLAISO" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "MENDEZ" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "GHISLAIN" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "NICOLAS" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "BOREL" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "CHRISTIAN" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "WILFRIED" ).get() );
		matchEquipe.setResultat("V");
		matchEquipe.setMarques(1);
		matchEquipe.setEncaisses(0);
		matchEquipeRepository.save(matchEquipe);
					
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe( equipeRepository.findById((long) 2).get() );
			matchEquipe.setMatchsAsB(match);
			matchEquipe.setCapitaine( joueurRepository.findByName( "PRESI" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "PRESI" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "MOSES" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "NDELE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "KADJI" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "BERTRAND" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "DUPLEX" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ANTOINE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "STYVE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "TCHOUPO" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "POGBA" ).get() );
			matchEquipe.setResultat("D");
			matchEquipe.setMarques(0);
			matchEquipe.setEncaisses(1);
			matchEquipeRepository.save(matchEquipe);
						
			but = new But();
			but.setEquipe( matchEquipeRepository.findById((long) 1).get() );
			but.setMatch(match);
			but.setButeur( joueurRepository.findByName( "BLAISO" ).get() );
			but.setPasseur( joueurRepository.findByName( "NICOLAS" ).get() );
			but.setMinute(56);
			butRepository.save(but);
				
		//CINQUIEME MATCH		
		match = new Matchx();
		match.setSante(sante);
		match.setMotm( joueurRepository.findByName( "INVITE" ).get() );
		match.setDate( 1688882400000L );
		matchRepository.save(match);
						
		matchEquipe = new MatchEquipe();
		matchEquipe.setEquipe( equipeRepository.findById((long) 1).get() );
		matchEquipe.setMatchsAsA(match);
		matchEquipe.setCapitaine( joueurRepository.findByName( "KADJI" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "KADJI" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "MOSES" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "KANTE" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "ANCIEN" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "WILFRIED" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "BLAISO" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "CHRISTIAN" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "POGBA" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "FABRICE" ).get() );
		matchEquipe.setResultat("N");
		matchEquipe.setMarques(2);
		matchEquipe.setEncaisses(2);
		matchEquipeRepository.save(matchEquipe);
						
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe( equipeRepository.findById((long) 2).get() );
			matchEquipe.setMatchsAsB(match);
			matchEquipe.setCapitaine( joueurRepository.findByName( "NDELE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "NDELE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "GILBERT" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "RUBEN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "TCHOUPO" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "JOSPAIN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "GHISLAIN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "HAROLD" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "STYVE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "PRESI" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "BASSOGOG" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LIONEL" ).get() );
			matchEquipe.setResultat("N");
			matchEquipe.setMarques(2);
			matchEquipe.setEncaisses(2);
			matchEquipeRepository.save(matchEquipe);
							
			but = new But();
			but.setEquipe( matchEquipeRepository.findById((long) 2).get() );
			but.setMatch(match);
			but.setButeur( joueurRepository.findByName( "TCHOUPO" ).get() );
			but.setPasseur( joueurRepository.findByName( "GHISLAIN" ).get() );
			but.setMinute(4);
			butRepository.save(but);
			
			but = new But();
			but.setEquipe( matchEquipeRepository.findById((long) 1).get() );
			but.setMatch(match);
			but.setButeur( joueurRepository.findByName( "KADJI" ).get() );
			but.setPasseur( joueurRepository.findByName( "KANTE" ).get() );
			but.setMinute(40);
			butRepository.save(but);
			
			but = new But();
			but.setEquipe( matchEquipeRepository.findById((long) 1).get() );
			but.setMatch(match);
			but.setButeur( joueurRepository.findByName( "BASSOGOG" ).get() );
			but.setPasseur( null );
			but.setMinute(60);
			butRepository.save(but);
			
			but = new But();
			but.setEquipe( matchEquipeRepository.findById((long) 2).get() );
			but.setMatch(match);
			but.setButeur( joueurRepository.findByName( "BLAISO" ).get() );
			but.setPasseur( null );
			but.setMinute(4);
			butRepository.save(but);
			
			
		//SIXIEME MATCH	16-07-2023	
		match = new Matchx();
		match.setSante(sante);
		match.setMotm( joueurRepository.findByName( "BRONDON" ).get() );
		match.setDate( 1689487200000L );
		matchRepository.save(match);
							
		//BLEUE
		matchEquipe = new MatchEquipe();
		matchEquipe.setEquipe( equipeRepository.findById((long) 1).get() );
		matchEquipe.setMatchsAsA(match);
		matchEquipe.setCapitaine( joueurRepository.findByName( "GILBERT" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "GILBERT" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "PRESI" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "BRONDON" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "BOREL" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "FABRICE" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "NDELE" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "BLAISO" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "WILFRIED" ).get() );
		matchEquipe.setResultat("V");
		matchEquipe.setMarques(2);
		matchEquipe.setEncaisses(0);
		matchEquipeRepository.save(matchEquipe);
				
			//VERTS
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe( equipeRepository.findById((long) 2).get() );
			matchEquipe.setMatchsAsB(match);
			matchEquipe.setCapitaine( joueurRepository.findByName( "MOSES" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "MOSES" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "BASSOGOG" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ANCIEN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "KADJI" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "KANTE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "JOSPAIN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "GHISLAIN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "DUPLEX" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "HAROLD" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "CHRISTIAN" ).get() );
			matchEquipe.setResultat("D");
			matchEquipe.setMarques(0);
			matchEquipe.setEncaisses(2);
			matchEquipeRepository.save(matchEquipe);
								
			but = new But();
			but.setEquipe( matchEquipeRepository.findById((long) 1).get() );
			but.setMatch(match);
			but.setButeur( joueurRepository.findByName( "BLAISO" ).get() );
			but.setPasseur( joueurRepository.findByName( "BRONDON" ).get() );
			but.setMinute(32);
			butRepository.save(but);
				
			but = new But();
			but.setEquipe( matchEquipeRepository.findById((long) 1).get() );
			but.setMatch(match);
			but.setButeur( joueurRepository.findByName( "BRONDON" ).get() );
			but.setPasseur( joueurRepository.findByName( "BLAISO" ).get() );
			but.setMinute(60);
			butRepository.save(but);
		
		//SEPTIEME MATCH 23-07-2023	
		match = new Matchx();
		match.setSante(sante);
		match.setMotm( joueurRepository.findByName( "BLAISO" ).get() );
		match.setDate( 1690092000000L );
		matchRepository.save(match);
						
		//BLEUE
		matchEquipe = new MatchEquipe();
		matchEquipe.setEquipe( equipeRepository.findById((long) 1).get() );
		matchEquipe.setMatchsAsA(match);
		matchEquipe.setCapitaine( joueurRepository.findByName( "GILBERT" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "GILBERT" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "NDELE" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "BLAISO" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "WILFRIED" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "BERTRAND" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "HAROLD" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "FABRICE" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "CHRISTIAN" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "DUPLEX" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "STYVE" ).get() );
		matchEquipe.setResultat("V");
		matchEquipe.setMarques(2);
		matchEquipe.setEncaisses(0);
		matchEquipeRepository.save(matchEquipe);
			
			//VERTS
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe( equipeRepository.findById((long) 2).get() );
			matchEquipe.setMatchsAsB(match);
			matchEquipe.setCapitaine( joueurRepository.findByName( "MOSES" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "MOSES" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "PRESI" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ULRICH" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "JOSPAIN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "KANTE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "TCHOUPO" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ANCIEN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "BOREL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "BASSOGOG" ).get() );
			matchEquipe.setResultat("D");
			matchEquipe.setMarques(0);
			matchEquipe.setEncaisses(2);
			matchEquipeRepository.save(matchEquipe);
							
			but = new But();
			but.setEquipe( matchEquipeRepository.findById((long) 1).get() );
			but.setMatch(match);
			but.setButeur( joueurRepository.findByName( "BLAISO" ).get() );
			but.setPasseur( joueurRepository.findByName( "HAROLD" ).get() );
			but.setMinute(35);
			butRepository.save(but);
			
			but = new But();
			but.setEquipe( matchEquipeRepository.findById((long) 1).get() );
			but.setMatch(match);
			but.setButeur( joueurRepository.findByName( "DUPLEX" ).get() );
			but.setPasseur( joueurRepository.findByName( "BLAISO" ).get() );
			but.setMinute(50);
			butRepository.save(but);
		
		//HUITIEME MATCH 30-07-2023	
		match = new Matchx();
		match.setSante(sante);
		match.setMotm( joueurRepository.findByName( "INVITE" ).get() );
		match.setDate( 1690696800000L );
		matchRepository.save(match);
								
		//BLEUE
		matchEquipe = new MatchEquipe();
		matchEquipe.setEquipe( equipeRepository.findById((long) 3).get() );
		matchEquipe.setMatchsAsA(match);
		matchEquipe.setCapitaine( joueurRepository.findByName( "PRESI" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "PRESI" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "WILFRIED" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "TCHOUPO" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "GHISLAIN" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "MOSES" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "KANTE" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "KADJI" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "BASSOGOG" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "BRONDON" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "ANCIEN" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "POGBA" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "CHRISTIAN" ).get() );
		matchEquipe.setResultat("V");
		matchEquipe.setMarques(5);
		matchEquipe.setEncaisses(4);
		matchEquipeRepository.save(matchEquipe);
					
			//VERTS
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe( equipeRepository.findById((long) 4).get() );
			matchEquipe.setMatchsAsB(match);
			matchEquipe.setCapitaine( joueurRepository.findByName( "INVITE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "INVITE" ).get() );
			matchEquipe.setResultat("D");
			matchEquipe.setMarques(4);
			matchEquipe.setEncaisses(5);
			matchEquipeRepository.save(matchEquipe);
									
			but = new But();
			but.setEquipe( matchEquipeRepository.findById((long) 3).get() );
			but.setMatch(match);
			but.setButeur( joueurRepository.findByName( "KADJI" ).get() );
			but.setPasseur( joueurRepository.findByName( "BASSOGOG" ).get() );
			but.setMinute(32);
			butRepository.save(but);
					
			but = new But();
			but.setEquipe( matchEquipeRepository.findById((long) 3).get() );
			but.setMatch(match);
			but.setButeur( joueurRepository.findByName( "BASSOGOG" ).get() );
			but.setPasseur( joueurRepository.findByName( "GILBERT" ).get() );
			but.setMinute(60);
			butRepository.save(but);
			
			but = new But();
			but.setEquipe( matchEquipeRepository.findById((long) 3).get() );
			but.setMatch(match);
			but.setButeur( joueurRepository.findByName( "BRONDON" ).get() );
			but.setPasseur( joueurRepository.findByName( "KADJI" ).get() );
			but.setMinute(32);
			butRepository.save(but);
					
			but = new But();
			but.setEquipe( matchEquipeRepository.findById((long) 3).get() );
			but.setMatch(match);
			but.setButeur( joueurRepository.findByName( "BRONDON" ).get() );
			but.setPasseur( joueurRepository.findByName( "KANTE" ).get() );
			but.setMinute(60);
			butRepository.save(but);
			
			but = new But();
			but.setEquipe( matchEquipeRepository.findById((long) 3).get() );
			but.setMatch(match);
			but.setButeur( joueurRepository.findByName( "GHISLAIN" ).get() );
			but.setPasseur( null );
			but.setMinute(32);
		butRepository.save(but);
		
		
		//NEUVIEME MATCH 06-08-2023	
		match = new Matchx();
		match.setSante(sante);
		match.setMotm( joueurRepository.findByName( "INVITE" ).get() );
		match.setDate( 1691301600000L );
		matchRepository.save(match);
								
		//BLEUE
		matchEquipe = new MatchEquipe();
		matchEquipe.setEquipe( equipeRepository.findById((long) 1).get() );
		matchEquipe.setMatchsAsA(match);
		matchEquipe.setCapitaine( joueurRepository.findByName( "BLAISO" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "BLAISO" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "HAROLD" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "MOSES" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "JOSPAIN" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "NDELE" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "KADJI" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "FABRICE" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "LIONEL" ).get() );
		matchEquipe.setResultat("N");
		matchEquipe.setMarques(1);
		matchEquipe.setEncaisses(1);
		matchEquipeRepository.save(matchEquipe);
					
			//VERTS
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe( equipeRepository.findById((long) 2).get() );
			matchEquipe.setMatchsAsB(match);
			matchEquipe.setCapitaine( joueurRepository.findByName( "PRESI" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "PRESI" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "KAKA" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "KANTE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "DUPLEX" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ANCIEN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "GILBERT" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "TCHOUPO" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ULRICH" ).get() );
			matchEquipe.setResultat("N");
			matchEquipe.setMarques(1);
			matchEquipe.setEncaisses(1);
			matchEquipeRepository.save(matchEquipe);
									
			but = new But();
			but.setEquipe( matchEquipeRepository.findById((long) 1).get() );
			but.setMatch(match);
			but.setButeur( joueurRepository.findByName( "INVITE" ).get() );
			but.setPasseur( joueurRepository.findByName( "BLAISO" ).get() );
			but.setMinute(45);
			butRepository.save(but);
					
			but = new But();
			but.setEquipe( matchEquipeRepository.findById((long) 2).get() );
			but.setMatch(match);
			but.setButeur( joueurRepository.findByName( "PRESI" ).get() );
			but.setPasseur( joueurRepository.findByName( "TCHOUPO" ).get() );
			but.setMinute(76);
		butRepository.save(but);
		
		// DIXIEME MATCH 13-08-2023
		match = new Matchx();
		match.setSante(sante);
		match.setMotm(joueurRepository.findByName("ULRICH").get());
		match.setDate(1691906400000L);
		matchRepository.save(match);

		// BLEUE
		matchEquipe = new MatchEquipe();
		matchEquipe.setEquipe(equipeRepository.findById((long) 1).get());
		matchEquipe.setMatchsAsA(match);
		matchEquipe.setCapitaine(joueurRepository.findByName("BLAISO").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("BLAISO").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("MOSES").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("BRONDON").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("ULRICH").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("HAROLD").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("NDELE").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("STYVE").get());
		matchEquipe.setResultat("V");
		matchEquipe.setMarques(3);
		matchEquipe.setEncaisses(0);
		matchEquipeRepository.save(matchEquipe);

			// VERTS
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe(equipeRepository.findById((long) 2).get());
			matchEquipe.setMatchsAsB(match);
			matchEquipe.setCapitaine(joueurRepository.findByName("KAKA").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("KAKA").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("BASSOGOG").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("CHRISTIAN").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("FABRICE").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("GILBERT").get());
			matchEquipe.setResultat("D");
			matchEquipe.setMarques(0);
			matchEquipe.setEncaisses(3);
			matchEquipeRepository.save(matchEquipe);
	
			but = new But();
			but.setEquipe(matchEquipeRepository.findById((long) 1).get());
			but.setMatch(match);
			but.setButeur(joueurRepository.findByName("ULRICH").get());
			but.setPasseur(joueurRepository.findByName("MOSES").get());
			but.setMinute(35);
			butRepository.save(but);
	
			but = new But();
			but.setEquipe(matchEquipeRepository.findById((long) 1).get());
			but.setMatch(match);
			but.setButeur(joueurRepository.findByName("ULRICH").get());
			but.setPasseur(joueurRepository.findByName("MOSES").get());
			but.setMinute(60);
			butRepository.save(but);
			
			but = new But();
			but.setEquipe(matchEquipeRepository.findById((long) 1).get());
			but.setMatch(match);
			but.setButeur(joueurRepository.findByName("BRONDON").get());
			but.setPasseur(joueurRepository.findByName("HAROLD").get());
			but.setMinute(81);
			butRepository.save(but);
			
		//ONZIEME MATCH 20-08-2023
		match = new Matchx();
		match.setSante(sante);
		match.setMotm(joueurRepository.findByName("BLAISO").get());
		match.setDate(1692511200000L);
		matchRepository.save(match);

		// BLEUE
		matchEquipe = new MatchEquipe();
		matchEquipe.setEquipe(equipeRepository.findById((long) 1).get());
		matchEquipe.setMatchsAsA(match);
		matchEquipe.setCapitaine(joueurRepository.findByName("BLAISO").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("BLAISO").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("MOSES").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("HAROLD").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("BRONDON").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("POGBA").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("DUPLEX").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("LIONEL").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("NDELE").get());
		matchEquipe.setResultat("V");
		matchEquipe.setMarques(3);
		matchEquipe.setEncaisses(1);
		matchEquipeRepository.save(matchEquipe);

			// VERTS
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe(equipeRepository.findById((long) 2).get());
			matchEquipe.setMatchsAsB(match);
			matchEquipe.setCapitaine(joueurRepository.findByName("GILBERT").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("GILBERT").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("KADJI").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("PRESI").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("KANTE").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("BASSOGOG").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("BOREL").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("MARCEL").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("FABRICE").get());
			matchEquipe.setResultat("D");
			matchEquipe.setMarques(1);
			matchEquipe.setEncaisses(3);
			matchEquipeRepository.save(matchEquipe);

			but = new But();
			but.setEquipe(matchEquipeRepository.findById((long) 1).get());
			but.setMatch(match);
			but.setButeur(joueurRepository.findByName("BLAISO").get());
			but.setPasseur(joueurRepository.findByName("BRONDON").get());
			but.setMinute(23);
			butRepository.save(but);
	
			but = new But();
			but.setEquipe(matchEquipeRepository.findById((long) 1).get());
			but.setMatch(match);
			but.setButeur(joueurRepository.findByName("BLAISO").get());
			but.setPasseur(joueurRepository.findByName("BRONDON").get());
			but.setMinute(39);
			butRepository.save(but);
			
			but = new But();
			but.setEquipe(matchEquipeRepository.findById((long) 1).get());
			but.setMatch(match);
			but.setButeur(joueurRepository.findByName("BLAISO").get());
			but.setPasseur(joueurRepository.findByName("LIONEL").get());
			but.setMinute(64);
			butRepository.save(but);
	
			but = new But();
			but.setEquipe(matchEquipeRepository.findById((long) 2).get());
			but.setMatch(match);
			but.setButeur(joueurRepository.findByName("INVITE").get());
			but.setPasseur(joueurRepository.findByName("BASSOGOG").get());
			but.setMinute(82);
			butRepository.save(but);
			
		//DOUZIEME MATCH 27-08-2023
		match = new Matchx();
		match.setSante(sante);
		match.setMotm(joueurRepository.findByName("KAKA").get());
		match.setDate(1693116000000L);
		matchRepository.save(match);

		// BLEUE
		matchEquipe = new MatchEquipe();
		matchEquipe.setEquipe(equipeRepository.findById((long) 1).get());
		matchEquipe.setMatchsAsA(match);
		matchEquipe.setCapitaine(joueurRepository.findByName("BLAISO").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("BLAISO").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("KAKA").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("HAROLD").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("LIONEL").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("NDELE").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("DUPLEX").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("BRONDON").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("AHSAN").get());
		matchEquipe.setResultat("V");
		matchEquipe.setMarques(3);
		matchEquipe.setEncaisses(0);
		matchEquipeRepository.save(matchEquipe);

			// VERTS
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe(equipeRepository.findById((long) 2).get());
			matchEquipe.setMatchsAsB(match);
			matchEquipe.setCapitaine(joueurRepository.findByName("BASSOGOG").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("BASSOGOG").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("GILBERT").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("MOSES").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("TCHOUPO").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("KANTE").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("JOSPAIN").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("ULRICH").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("ANTOINE").get());
			matchEquipe.setResultat("D");
			matchEquipe.setMarques(0);
			matchEquipe.setEncaisses(3);
			matchEquipeRepository.save(matchEquipe);

			but = new But();
			but.setEquipe(matchEquipeRepository.findById((long) 1).get());
			but.setMatch(match);
			but.setButeur(joueurRepository.findByName("INVITE").get());
			but.setPasseur(joueurRepository.findByName("KAKA").get());
			but.setMinute(24);
			butRepository.save(but);
		
			but = new But();
			but.setEquipe(matchEquipeRepository.findById((long) 1).get());
			but.setMatch(match);
			but.setButeur(joueurRepository.findByName("KAKA").get());
			but.setPasseur(joueurRepository.findByName("HAROLD").get());
			but.setMinute(34);
			butRepository.save(but);
				
			but = new But();
			but.setEquipe(matchEquipeRepository.findById((long) 1).get());
			but.setMatch(match);
			but.setButeur(joueurRepository.findByName("KAKA").get());
			but.setPasseur(joueurRepository.findByName("HAROLD").get());
			but.setMinute(67);
			butRepository.save(but);
			
			but = new But();
			but.setEquipe(matchEquipeRepository.findById((long) 1).get());
			but.setMatch(match);
			but.setButeur(joueurRepository.findByName("INVITE").get());
			but.setPasseur(joueurRepository.findByName("AHSAN").get());
			but.setMinute(67);
			butRepository.save(but);
			
		//TREIZIEME MATCH 03-09-2023
		match = new Matchx();
		match.setSante(sante);
		match.setMotm(joueurRepository.findByName("KAKA").get());
		match.setDate(1693720800000L);
		matchRepository.save(match);

		// BLEUE
		matchEquipe = new MatchEquipe();
		matchEquipe.setEquipe(equipeRepository.findById((long) 1).get());
		matchEquipe.setMatchsAsA(match);
		matchEquipe.setCapitaine(joueurRepository.findByName("ULRICH").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("ULRICH").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("FABRICE").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("GILBERT").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("ANCIEN").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("KANTE").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("HAROLD").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("BLAISO").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("BASSOGOG").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("LIONEL").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("KAKA").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("DUPLEX").get());
		matchEquipe.setResultat("N");
		matchEquipe.setMarques(2);
		matchEquipe.setEncaisses(2);
		matchEquipeRepository.save(matchEquipe);

			// VERTS
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe(equipeRepository.findById((long) 2).get());
			matchEquipe.setMatchsAsB(match);
			matchEquipe.setCapitaine(joueurRepository.findByName("MOSES").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("MOSES").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("PRESI").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("JOSPAIN").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("NDELE").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("WILFRIED").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("POGBA").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("KADJI").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("GHISLAIN").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("CHRISTIAN").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("BOREL").get());
			matchEquipe.setResultat("N");
			matchEquipe.setMarques(2);
			matchEquipe.setEncaisses(2);
			matchEquipeRepository.save(matchEquipe);

			but = new But();
			but.setEquipe(matchEquipeRepository.findById((long) 2).get());
			but.setMatch(match);
			but.setButeur(joueurRepository.findByName("MOSES").get());
			but.setPasseur(joueurRepository.findByName("KADJI").get());
			but.setMinute(20);
			butRepository.save(but);
			
			but = new But();
			but.setEquipe(matchEquipeRepository.findById((long) 2).get());
			but.setMatch(match);
			but.setButeur(joueurRepository.findByName("PRESI").get());
			but.setPasseur(joueurRepository.findByName("CHRISTIAN").get());
			but.setMinute(60);
			butRepository.save(but);
					
			but = new But();
			but.setEquipe(matchEquipeRepository.findById((long) 1).get());
			but.setMatch(match);
			but.setButeur(joueurRepository.findByName("KAKA").get());
			but.setPasseur( null );
			but.setMinute(78);
			butRepository.save(but);
				
			but = new But();
			but.setEquipe(matchEquipeRepository.findById((long) 1).get());
			but.setMatch(match);
			but.setButeur(joueurRepository.findByName("KAKA").get());
			but.setPasseur( null );
			but.setMinute(85);
			butRepository.save(but);
			
		//QUATORZIEME MATCH 10-09-2023
		match = new Matchx();
		match.setSante(sante);
		match.setMotm(joueurRepository.findByName("BRONDON").get());
		match.setDate(1694325600000L);
		matchRepository.save(match);

		// BLEUE
		matchEquipe = new MatchEquipe();
		matchEquipe.setEquipe(equipeRepository.findById((long) 1).get());
		matchEquipe.setMatchsAsA(match);
		matchEquipe.setCapitaine(joueurRepository.findByName("BLAISO").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("BLAISO").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("BRONDON").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("KADJI").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("BOREL").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("GILBERT").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("ANCIEN").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("FABRICE").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("HAROLD").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("STYVE").get());
		matchEquipe.getJoueurs().add(joueurRepository.findByName("RUBEN").get());
		matchEquipe.setResultat("V");
		matchEquipe.setMarques(4);
		matchEquipe.setEncaisses(0);
		matchEquipeRepository.save(matchEquipe);

			// VERTS
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe(equipeRepository.findById((long) 2).get());
			matchEquipe.setMatchsAsB(match);
			matchEquipe.setCapitaine(joueurRepository.findByName("MOSES").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("MOSES").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("PRESI").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("POGBA").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("JOSPAIN").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("KANTE").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("BASSOGOG").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("NDELE").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("ULRICH").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("LIONEL").get());
			matchEquipe.getJoueurs().add(joueurRepository.findByName("MARCEL").get());
			matchEquipe.setResultat("D");
			matchEquipe.setMarques(0);
			matchEquipe.setEncaisses(4);
			matchEquipeRepository.save(matchEquipe);

			but = new But();
			but.setEquipe(matchEquipeRepository.findById((long) 1).get());
			but.setMatch(match);
			but.setButeur(joueurRepository.findByName("BLAISO").get());
			but.setPasseur(joueurRepository.findByName("BRONDON").get());
			but.setMinute(3);
			butRepository.save(but);
				
			but = new But();
			but.setEquipe(matchEquipeRepository.findById((long) 1).get());
			but.setMatch(match);
			but.setButeur(joueurRepository.findByName("BRONDON").get());
			but.setPasseur(joueurRepository.findByName("KADJI").get());
			but.setMinute(60);
			butRepository.save(but);
						
			but = new But();
			but.setEquipe(matchEquipeRepository.findById((long) 1).get());
			but.setMatch(match);
			but.setButeur(joueurRepository.findByName("INVITE").get());
			but.setPasseur(joueurRepository.findByName("KADJI").get());
			but.setMinute(70);
			butRepository.save(but);
					
			but = new But();
			but.setEquipe(matchEquipeRepository.findById((long) 1).get());
			but.setMatch(match);
			but.setButeur(joueurRepository.findByName("INVITE").get());
			but.setPasseur(joueurRepository.findByName("KADJI").get());
			but.setMinute(90);
			butRepository.save(but);
			
			
			
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		///////////////////////////////////////////// VANIER VANIER VANIER VANIER VANIER VANIER VANIER VANIER VANIER VANIER VANIER //////////////////////////////	
			
			
		sante = new Sante();
		sante.setName("237 McArthur");
		santeRepository.save(sante);
		
			joueur = new Joueur();
			joueur.setName("ALAIN");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("KEVIN");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("EBELLE");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("ROSTAND");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("JOSEPH");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("THIERRY");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("NDJOCK");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("CLOTAIRE");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("YVAN");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("ARMEL");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("LASSANA");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("FRANCK");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("KAMGA");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("CABREL");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("LEONEL");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("RODRIGUE");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("WELL");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("ARMAND");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("PANDEV");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("PNJ");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
		equipe = new Equipe();
		equipe.setName("ROUGES");
		equipe.setSante(sante);
		equipeRepository.save(equipe);
			
			equipe = new Equipe();
			equipe.setName("VERTS");
			equipe.setSante(sante);
			equipeRepository.save(equipe);
				
			equipe = new Equipe();
			equipe.setName("237 MCARTHUR");
			equipe.setSante(sante);
			equipeRepository.save(equipe);
				
		match = new Matchx();
		match.setSante(sante);
		match.setMotm( joueurRepository.findByName( "THIERRY" ).get() );
		match.setDate( 1750266000000L );
		//match.setDate( DateFormatConverter.toLocalDateTimeInMilliseconds(new Date()) );
		matchRepository.save(match);
		
		matchEquipe = new MatchEquipe();
		matchEquipe.setEquipe( equipeRepository.findById((long) 5).get() );
		matchEquipe.setMatchsAsA(match);
		matchEquipe.setCapitaine( joueurRepository.findByName( "ALAIN" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "EBELLE" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "ALAIN" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "WELL" ).get() );
		matchEquipe.setResultat("D");
		matchEquipe.setMarques(1);
		matchEquipe.setEncaisses(2);
		matchEquipeRepository.save(matchEquipe);
		
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe( equipeRepository.findById((long) 6).get() );
			matchEquipe.setMatchsAsB(match);
			matchEquipe.setCapitaine( joueurRepository.findByName( "KEVIN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "KEVIN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "KAMGA" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "CLOTAIRE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "YVAN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "THIERRY" ).get() );
			matchEquipe.setResultat("V");
			matchEquipe.setMarques(2);
			matchEquipe.setEncaisses(1);
			matchEquipeRepository.save(matchEquipe);
			
			but = new But();
			but.setEquipe(matchEquipeRepository.findById((long) 5).get());
			but.setMatch(match);
			but.setButeur(joueurRepository.findByName("ARMAND").get());
			but.setPasseur(joueurRepository.findByName("PNJ").get());
			but.setMinute(50);
			butRepository.save(but);
	
			but = new But();
			but.setEquipe(matchEquipeRepository.findById((long) 6).get());
			but.setMatch(match);
			but.setButeur(joueurRepository.findByName("PNJ").get());
			but.setPasseur(joueurRepository.findByName("PNJ").get());
			but.setMinute(75);
			butRepository.save(but);
			
			but = new But();
			but.setEquipe(matchEquipeRepository.findById((long) 6).get());
			but.setMatch(match);
			but.setButeur(joueurRepository.findByName("KAMGA").get());
			but.setPasseur(joueurRepository.findByName("PNJ").get());
			but.setMinute(85);
			butRepository.save(but);
				
	}

}
