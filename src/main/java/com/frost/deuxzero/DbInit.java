package com.frost.deuxzero;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.frost.deuxzero.model.But;
import com.frost.deuxzero.model.Equipe;
import com.frost.deuxzero.model.Joueur;
import com.frost.deuxzero.model.Matchx;
import com.frost.deuxzero.model.MatchEquipe;
import com.frost.deuxzero.model.MatchHighlight;
import com.frost.deuxzero.model.Sante;
import com.frost.deuxzero.repository.ButRepository;
import com.frost.deuxzero.repository.EquipeRepository;
import com.frost.deuxzero.repository.JoueurRepository;
import com.frost.deuxzero.repository.MatchEquipeRepository;
import com.frost.deuxzero.repository.MatchHighlightRepository;
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
	MatchHighlightRepository matchHighlightRepository;
	
	@Autowired
	ButRepository butRepository;
	
	@PostConstruct
    private void postConstruct() {
		
		Sante sante = new Sante();
		sante.setName("ELEVEN SURE");
		sante.setLogo("monndole-logo.png");
		sante.setCountry("CAMEROUN");
		sante.setAddress("Direction Technique Orange, Makepe, Douala");
		sante.setManager("MOSES");
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
			joueur.setName("PNJ");
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
			but.setButeur( joueurRepository.findByName( "PNJ" ).get() );
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
			but.setPasseur( joueurRepository.findByName( "PNJ" ).get() );
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
		match.setMotm( joueurRepository.findByName( "PNJ" ).get() );
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
		match.setMotm( joueurRepository.findByName( "PNJ" ).get() );
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
			but.setPasseur( joueurRepository.findByName( "PNJ" ).get() );
			but.setMinute(60);
			butRepository.save(but);
			
			but = new But();
			but.setEquipe( matchEquipeRepository.findById((long) 2).get() );
			but.setMatch(match);
			but.setButeur( joueurRepository.findByName( "BLAISO" ).get() );
			but.setPasseur( joueurRepository.findByName( "PNJ" ).get() );
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
		match.setMotm( joueurRepository.findByName( "PNJ" ).get() );
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
			matchEquipe.setCapitaine( joueurRepository.findByName( "PNJ" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "PNJ" ).get() );
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
			but.setPasseur( joueurRepository.findByName( "PNJ" ).get() );
			but.setMinute(32);
		butRepository.save(but);
		
		
		//NEUVIEME MATCH 06-08-2023	
		match = new Matchx();
		match.setSante(sante);
		match.setMotm( joueurRepository.findByName( "PNJ" ).get() );
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
			but.setButeur( joueurRepository.findByName( "PNJ" ).get() );
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
			but.setButeur(joueurRepository.findByName("PNJ").get());
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
			but.setButeur(joueurRepository.findByName("PNJ").get());
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
			but.setButeur(joueurRepository.findByName("PNJ").get());
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
			but.setPasseur( joueurRepository.findByName( "PNJ" ).get() );
			but.setMinute(78);
			butRepository.save(but);
				
			but = new But();
			but.setEquipe(matchEquipeRepository.findById((long) 1).get());
			but.setMatch(match);
			but.setButeur(joueurRepository.findByName("KAKA").get());
			but.setPasseur( joueurRepository.findByName( "PNJ" ).get() );
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
			but.setButeur(joueurRepository.findByName("PNJ").get());
			but.setPasseur(joueurRepository.findByName("KADJI").get());
			but.setMinute(70);
			butRepository.save(but);
					
			but = new But();
			but.setEquipe(matchEquipeRepository.findById((long) 1).get());
			but.setMatch(match);
			but.setButeur(joueurRepository.findByName("PNJ").get());
			but.setPasseur(joueurRepository.findByName("KADJI").get());
			but.setMinute(90);
			butRepository.save(but);
			
			
			
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		///////////////////////////////////////////// VANIER VANIER VANIER VANIER VANIER VANIER VANIER VANIER VANIER VANIER VANIER //////////////////////////////	
			
			
		sante = new Sante();
		sante.setName("237 McArthur");
		sante.setLogo("237_mcArthur.jpeg");
		sante.setCountry("CANADA");
		sante.setAddress("Robert E. Wilson Public School, 373 McArthur Ave., Ottawa, ON");
		sante.setManager("LOGICIEL");
		santeRepository.save(sante);
		
			joueur = new Joueur();
			joueur.setName("ALAIN");
			joueur.setHandle("APemba10");
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
			joueur.setName("RUCKYO");
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
			joueur.setName("LEONEL");
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
			joueur.setName("RONI");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("HERVE");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("LOGICIEL");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("BRUCE");
			joueur.setSante(sante);
			joueurRepository.save(joueur);

			joueur = new Joueur();
			joueur.setName("ZIZOU");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("LANAYAL");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("FRANKLIN");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("ONDJOCK");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("EZEKIEL");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("NAO");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("KEVIN BROWN");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("ROLAND");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("ALBERTO");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("BARCOLA");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("SABRI");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("CHRIS");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("PRINCE");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("GEORDY");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("SERGE");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("IBRAHIM");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("ANDRE");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("NEYMAR");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("ALBERT");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("PAUL GABY");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("LEO");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("JEAN ROMAIN");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("SHAMIR");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("OLIVIER MENDEZ");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("EUSEBIO");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("CAMAVINGA");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("JORDAN");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("MAJOR");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("DIRANE");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("NATHAN");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("HERVE FONGANG");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("ULRICH C");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("MOREL");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("CEDRIC");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("PERLAP");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("MATHIAS");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("JUNIOR");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("ACHILLE");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("FRIDO");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("AYOCHE");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("AZIZ");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("HERMAN");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("SALAH");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("NEW DC");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("KENFY");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("SOULEY");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
		equipe = new Equipe();
		equipe.setName("ORANGES");
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
			
			
		
			
		//////// MCARTHUR MATCH 0 ///////////
			
		match = new Matchx();
		match.setSante(sante);
		match.setMotm( joueurRepository.findByName( "LANAYAL" ).get() );
		match.setDate( 1749229200000L );
		//match.setDate( DateFormatConverter.toLocalDateTimeInMilliseconds(new Date()) );
		matchRepository.save(match);
		
		matchEquipe = new MatchEquipe();
		matchEquipe.setEquipe( equipeRepository.findById((long) 5).get() );
		matchEquipe.setMatchsAsA(match);
		matchEquipe.setCapitaine( joueurRepository.findByName( "ARMEL" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "ARMEL" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "ALAIN" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "EBELLE" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "PANDEV" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "JOSEPH" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "FRANCK" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "SABRI" ).get() );
		matchEquipe.setResultat("D");
		matchEquipe.setMarques(0);
		matchEquipe.setEncaisses(3);
		matchEquipeRepository.save(matchEquipe);
		
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe( equipeRepository.findById((long) 6).get() );
			matchEquipe.setMatchsAsB(match);
			matchEquipe.setCapitaine( joueurRepository.findByName( "KEVIN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "KEVIN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LANAYAL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "KAMGA" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LOGICIEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "YVAN" ).get() );
			matchEquipe.setResultat("V");
			matchEquipe.setMarques(3);
			matchEquipe.setEncaisses(0);
			matchEquipeRepository.save(matchEquipe);
			
			but = new But();
			but.setEquipe(matchEquipeRepository.findById((long) 5).get());
			but.setMatch(match);
			but.setButeur(joueurRepository.findByName("LANAYAL").get());
			but.setPasseur(joueurRepository.findByName("PNJ").get());
			but.setMinute(60);
			but.setScore("1 : 0");
			butRepository.save(but);
	
			but = new But();
			but.setEquipe(matchEquipeRepository.findById((long) 6).get());
			but.setMatch(match);
			but.setButeur(joueurRepository.findByName("LANAYAL").get());
			but.setPasseur(joueurRepository.findByName("PNJ").get());
			but.setMinute(70);
			but.setScore("2 : 0");
			butRepository.save(but);
			
			but = new But();
			but.setEquipe(matchEquipeRepository.findById((long) 6).get());
			but.setMatch(match);
			but.setButeur(joueurRepository.findByName("LANAYAL").get());
			but.setPasseur(joueurRepository.findByName("PNJ").get());
			but.setMinute(85);
			but.setScore("3 : 0");
			butRepository.save(but);
			
		
		
		MatchHighlight matchHighlight = new MatchHighlight();
		matchHighlight.setMatch(match);
		matchHighlight.setDescription("🚨 Entrée fracassante de LANAYAL, auteur d’un triplé pour son tout premier match, débloquant une rencontre figée à 0-0 et offrant une victoire 3-0 à son équipe. Clutch. Froid. Décisif.");
		matchHighlight.setJoueur(joueurRepository.findByName("LANAYAL").get());
		matchHighlightRepository.save(matchHighlight);
		
		matchHighlight = new MatchHighlight();
		matchHighlight.setMatch(match);
		matchHighlight.setDescription("🧱 Prestation collective solide, avec une équipe bien en place des deux côtés du terrain, qui verrouille défensivement et conserve le clean sheet pour valider une victoire maîtrisée 3-0.");
		matchHighlight.setEquipe(matchEquipeRepository.findById( matchEquipe.getId() ).get());
		matchHighlightRepository.save(matchHighlight);
			
		
		//////// MCARTHUR MATCH 1 ///////////
				
		match = new Matchx();
		match.setSante(sante);
		match.setMotm( joueurRepository.findByName( "PNJ" ).get() );
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
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "ZIZOU" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "ULRICH C" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "LOGICIEL" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "FRANCK" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "NEYMAR" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "ANDRE" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "SABRI" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "CEDRIC" ).get() );
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
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "RUCKYO" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LANAYAL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "BRUCE" ).get() );
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
			but.setScore("1 : 0");
			butRepository.save(but);
	
			but = new But();
			but.setEquipe(matchEquipeRepository.findById((long) 6).get());
			but.setMatch(match);
			but.setButeur(joueurRepository.findByName("LANAYAL").get());
			but.setPasseur(joueurRepository.findByName("PNJ").get());
			but.setMinute(75);
			but.setScore("1 : 1");
			butRepository.save(but);
			
			but = new But();
			but.setEquipe(matchEquipeRepository.findById((long) 6).get());
			but.setMatch(match);
			but.setButeur(joueurRepository.findByName("KAMGA").get());
			but.setPasseur(joueurRepository.findByName("PNJ").get());
			but.setMinute(85);
			but.setScore("1 : 2");
			butRepository.save(but);
			
			
			
			
		//////// MCARTHUR MATCH 2 ///////////
		match = new Matchx();
		match.setSante(sante);
		match.setMotm( joueurRepository.findByName( "PNJ" ).get() );
		match.setDate( 1750438800000L );
		//match.setDate( DateFormatConverter.toLocalDateTimeInMilliseconds(new Date()) );
		matchRepository.save(match);
			
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe( equipeRepository.findById((long) 5).get() );
			matchEquipe.setMatchsAsA(match);
			matchEquipe.setCapitaine( joueurRepository.findByName( "ARMEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "EBELLE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ALAIN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "WELL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "JOSEPH" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ZIZOU" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "PANDEV" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ARMEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ARMAND" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LOGICIEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "FRANKLIN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ONDJOCK" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ALBERTO" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ULRICH C" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "FRANCK" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "SABRI" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "CEDRIC" ).get() );
			matchEquipe.setResultat("D");
			matchEquipe.setMarques(0);
			matchEquipe.setEncaisses(1);
			matchEquipeRepository.save(matchEquipe);
			
				matchEquipe = new MatchEquipe();
				matchEquipe.setEquipe( equipeRepository.findById((long) 6).get() );
				matchEquipe.setMatchsAsB(match);
				matchEquipe.setCapitaine( joueurRepository.findByName( "KEVIN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "KEVIN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "YVAN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "LANAYAL" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "KAMGA" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "EZEKIEL" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "BRUCE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "LEONEL" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "RONI" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "IBRAHIM" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "CHRIS" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "NAO" ).get() );
				matchEquipe.setResultat("V");
				matchEquipe.setMarques(1);
				matchEquipe.setEncaisses(0);
				matchEquipeRepository.save(matchEquipe);
		
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("IBRAHIM").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(42);
				but.setScore("0 : 1");
				butRepository.save(but);
				
		matchHighlight = new MatchHighlight();
		matchHighlight.setMatch(match);
		matchHighlight.setDescription("✅ Score final : 1-0 en faveur des Verts, qui enchaînent une deuxième victoire consécutive et confirment leur bonne dynamique !");
		matchHighlightRepository.save(matchHighlight);
		
		matchHighlight = new MatchHighlight();
		matchHighlight.setMatch(match);
		matchHighlight.setDescription("🧱 Prestation d’équipe solide, avec un bloc bien en place qui permet de préserver le clean sheet et de valider une victoire maîtrisée.");
		matchHighlight.setEquipe(matchEquipeRepository.findById( matchEquipe.getId() ).get());
		matchHighlightRepository.save(matchHighlight);
		
		matchHighlight = new MatchHighlight();
		matchHighlight.setMatch(match);
		matchHighlight.setDescription("💥 Un but exceptionnel de IBRAHIM, qui surprend tout le stade avec une frappe surpuissante depuis le milieu de terrain. Un moment de pur génie qui fait basculer le match");
		matchHighlight.setJoueur(joueurRepository.findByName("IBRAHIM").get());
		matchHighlightRepository.save(matchHighlight);
		
		matchHighlight = new MatchHighlight();
		matchHighlight.setMatch(match);
		matchHighlight.setDescription("🤝 Un match propre, sans fautes excessives, sans bavardages inutiles, ni excès d'engagement ou d’énervement. Une attitude exemplaire à conserver pour les prochaines rencontres.");
		matchHighlightRepository.save(matchHighlight);
		
		
		
		
		////////MCARTHUR MATCH 3 ///////////
		match = new Matchx();
		match.setSante(sante);
		match.setMotm( joueurRepository.findByName( "KEVIN BROWN" ).get() );
		match.setDate( 1750577400000L );
		//match.setDate( DateFormatConverter.toLocalDateTimeInMilliseconds(new Date()) );
		matchRepository.save(match);
			
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe( equipeRepository.findById((long) 5).get() );
			matchEquipe.setMatchsAsA(match);
			matchEquipe.setCapitaine( joueurRepository.findByName( "ARMEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "EBELLE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ALAIN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "WELL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "JOSEPH" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ALBERTO" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "PANDEV" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ARMEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "FRANKLIN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ROLAND" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ULRICH C" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LASSANA" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "FRANCK" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "CEDRIC" ).get() );
			matchEquipe.setResultat("D");
			matchEquipe.setMarques(1);
			matchEquipe.setEncaisses(3);
			matchEquipeRepository.save(matchEquipe);
			
				matchEquipe = new MatchEquipe();
				matchEquipe.setEquipe( equipeRepository.findById((long) 6).get() );
				matchEquipe.setMatchsAsB(match);
				matchEquipe.setCapitaine( joueurRepository.findByName( "KEVIN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "KEVIN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "KEVIN BROWN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "LANAYAL" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "KAMGA" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "EZEKIEL" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "BRUCE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "BARCOLA" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "RONI" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "LOGICIEL" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "HERVE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "PRINCE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "SERGE" ).get() );
				matchEquipe.setResultat("V");
				matchEquipe.setMarques(3);
				matchEquipe.setEncaisses(1);
				matchEquipeRepository.save(matchEquipe);
		
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("LANAYAL").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(15);
				but.setScore("0 : 1");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("JOSEPH").get());
				but.setPasseur(joueurRepository.findByName("PANDEV").get());
				but.setMinute(70);
				but.setScore("1 : 1");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("BARCOLA").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(80);
				but.setScore("1 : 2");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("LANAYAL").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(90);
				but.setScore("1 : 3");
				butRepository.save(but);
				
		matchHighlight = new MatchHighlight();
		matchHighlight.setMatch(match);
		matchHighlight.setDescription("⚽ Score final : 3-1 en faveur des Verts, qui enchaînent une troisième victoire consécutive et confirment leur excellente dynamique ");
		matchHighlightRepository.save(matchHighlight);
		
		matchHighlight = new MatchHighlight();
		matchHighlight.setMatch(match);
		matchHighlight.setDescription("👑 Le capitaine Kevin s’est illustré par son leadership constant, n’hésitant pas à communiquer et replacer ses coéquipiers tout au long du match. Une prestation tactiquement maîtrisée grâce à sa vision du jeu.");
		matchHighlight.setJoueur(joueurRepository.findByName("KEVIN").get());
		matchHighlightRepository.save(matchHighlight);
		
		matchHighlight = new MatchHighlight();
		matchHighlight.setMatch(match);
		matchHighlight.setDescription("🦊 LANAYAL en renard des surfaces, n’a besoin que de quelques bon ballons pour faire trembler les filets. Efficacité maximale ");
		matchHighlight.setJoueur(joueurRepository.findByName("LANAYAL").get());
		matchHighlightRepository.save(matchHighlight);
		
		matchHighlight = new MatchHighlight();
		matchHighlight.setMatch(match);
		matchHighlight.setDescription("⚡ KEVIN BROWN, infatigable, a multiplié les courses et les percées, créant à plusieurs reprises le danger dans le camp adverse. Un moteur essentiel dans le dispositif offensif");
		matchHighlight.setJoueur(joueurRepository.findByName("KEVIN BROWN").get());
		matchHighlightRepository.save(matchHighlight);
		
		matchHighlight = new MatchHighlight();
		matchHighlight.setMatch(match);
		matchHighlight.setDescription("🔥 En fin de match, BARCOLA a su prendre ses responsabilités au moment clé pour redonner l’avantage aux siens. Un geste de patron ");
		matchHighlight.setJoueur(joueurRepository.findByName("BARCOLA").get());
		matchHighlightRepository.save(matchHighlight);
		
		matchHighlight = new MatchHighlight();
		matchHighlight.setMatch(match);
		matchHighlight.setDescription("🛡️ Top Performance de Hervé au poste de latéral, qui a dominé son couloir de la première à la dernière minute.");
		matchHighlight.setJoueur(joueurRepository.findByName("HERVE").get());
		matchHighlightRepository.save(matchHighlight);
		
		
		
		////////MCARTHUR MATCH 4 ///////////
		match = new Matchx();
		match.setSante(sante);
		match.setMotm( joueurRepository.findByName( "ALAIN" ).get() );
		match.setDate( 1750870800000L );
		//match.setDate( DateFormatConverter.toLocalDateTimeInMilliseconds(new Date()) );
		matchRepository.save(match);
		
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe( equipeRepository.findById((long) 5).get() );
			matchEquipe.setMatchsAsA(match);
			matchEquipe.setCapitaine( joueurRepository.findByName( "ARMEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "EBELLE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ALAIN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ANDRE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "FRANCK" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ALBERTO" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ARMAND" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ARMEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ZIZOU" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LOGICIEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LASSANA" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "NEYMAR" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "PAUL GABY" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LEO" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "CEDRIC" ).get() );
			matchEquipe.setResultat("N");
			matchEquipe.setMarques(0);
			matchEquipe.setEncaisses(0);
			matchEquipeRepository.save(matchEquipe);
			
				matchEquipe = new MatchEquipe();
				matchEquipe.setEquipe( equipeRepository.findById((long) 6).get() );
				matchEquipe.setMatchsAsB(match);
				matchEquipe.setCapitaine( joueurRepository.findByName( "KEVIN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "KEVIN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "LANAYAL" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "KAMGA" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "BRUCE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "RONI" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "CLOTAIRE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "HERVE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "CHRIS" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "IBRAHIM" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "YVAN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "NDJOCK" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "SERGE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "RUCKYO" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "PERLAP" ).get() );
				matchEquipe.setResultat("N");
				matchEquipe.setMarques(0);
				matchEquipe.setEncaisses(0);
				matchEquipeRepository.save(matchEquipe);
				
		matchHighlight = new MatchHighlight();
		matchHighlight.setMatch(match);
		matchHighlight.setDescription("⚽ Score final : 0-0 match nul, qui met un terme à la série de 3 victoires consécutives des Verts.");
		matchHighlightRepository.save(matchHighlight);
		
		matchHighlight = new MatchHighlight();
		matchHighlight.setMatch(match);
		matchHighlight.setDescription("🔴 Tres belle performance collective des rouges, notamment au millieu de terrain qui ont su jouer au ballon, sans toutefois parvenir a trouver la faille dans la defense adverse");
		matchHighlight.setEquipe(matchEquipeRepository.findById( 37L ).get());
		matchHighlightRepository.save(matchHighlight);
		
		matchHighlight = new MatchHighlight();
		matchHighlight.setMatch(match);
		matchHighlight.setDescription("🟢 Mention spéciale à Alain, côté Verts, qui a porté les offensives de son équipe et n’a cessé de chercher la faille jusqu’à la dernière minute. Une détermination sans relâche malgré l'issue stérile.");
		matchHighlight.setJoueur(joueurRepository.findByName("ALAIN").get());
		matchHighlightRepository.save(matchHighlight);
		
		////////MCARTHUR MATCH 5 ///////////
		match = new Matchx();
		match.setSante(sante);
		match.setMotm( joueurRepository.findByName( "KEVIN" ).get() );
		match.setDate( 1751043600000L );
		//match.setDate( DateFormatConverter.toLocalDateTimeInMilliseconds(new Date()) );
		matchRepository.save(match);
		
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe( equipeRepository.findById((long) 5).get() );
			matchEquipe.setMatchsAsA(match);
			matchEquipe.setCapitaine( joueurRepository.findByName( "ARMEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ARMEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ALAIN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "PANDEV" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "JOSEPH" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ALBERT" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "FRANKLIN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "FRANCK" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LOGICIEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "PAUL GABY" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LEO" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "CEDRIC" ).get() );
			matchEquipe.setResultat("D");
			matchEquipe.setMarques(0);
			matchEquipe.setEncaisses(2);
			matchEquipeRepository.save(matchEquipe);
			
				matchEquipe = new MatchEquipe();
				matchEquipe.setEquipe( equipeRepository.findById((long) 6).get() );
				matchEquipe.setMatchsAsB(match);
				matchEquipe.setCapitaine( joueurRepository.findByName( "ROSTAND" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "KEVIN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "CLOTAIRE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "CHRIS" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "ROSTAND" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "YVAN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "SERGE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "HERVE FONGANG" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "NATHAN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "PERLAP" ).get() );
				matchEquipe.setResultat("V");
				matchEquipe.setMarques(2);
				matchEquipe.setEncaisses(0);
				matchEquipeRepository.save(matchEquipe);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("KEVIN").get());
				but.setPasseur(joueurRepository.findByName("CLOTAIRE").get());
				but.setMinute(50);
				but.setScore("0 : 1");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("CLOTAIRE").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(90);
				but.setScore("0 : 2");
				butRepository.save(but);
				
		matchHighlight = new MatchHighlight();
		matchHighlight.setMatch(match);
		matchHighlight.setDescription("⚠️ Score final : 2-0 en faveur des Verts, qui ouvrent le score sur un but controversé, inscrit alors que les Oranges s’étaient arrêtés, préoccupés par un joueur Vert au sol, avant de doubler la mise sur une offrande du gardien orange !");
		matchHighlightRepository.save(matchHighlight);
		
		matchHighlight = new MatchHighlight();
		matchHighlight.setMatch(match);
		matchHighlight.setDescription("🌧️ Le match a bien eu lieu malgré des conditions météo très incertaines, avec notamment une pluie battante ayant fait douter de sa tenue.");
		matchHighlightRepository.save(matchHighlight);
		
		matchHighlight = new MatchHighlight();
		matchHighlight.setMatch(match);
		matchHighlight.setDescription("🛑 Rencontre ternie par un excès d’engagement, avec des fautes répétées qui ont clairement nui à l’esprit du jeu.");
		matchHighlightRepository.save(matchHighlight);
		
		////////MCARTHUR MATCH 6 ///////////
		match = new Matchx();
		match.setSante(sante);
		match.setMotm( joueurRepository.findByName( "BARCOLA" ).get() );
		match.setDate( 1751182200000L );
		//match.setDate( DateFormatConverter.toLocalDateTimeInMilliseconds(new Date()) );
		matchRepository.save(match);
		
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe( equipeRepository.findById((long) 5).get() );
			matchEquipe.setMatchsAsA(match);
			matchEquipe.setCapitaine( joueurRepository.findByName( "ARMEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "WELL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "EBELLE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ULRICH C" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ARMEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "JOSEPH" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ALBERTO" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LEO" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "PAUL GABY" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ARMAND" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ROLAND" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "PANDEV" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LASSANA" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "FRANKLIN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "JEAN ROMAIN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "SABRI" ).get() );
			matchEquipe.setResultat("D");
			matchEquipe.setMarques(4);
			matchEquipe.setEncaisses(6);
			matchEquipeRepository.save(matchEquipe);
			
				matchEquipe = new MatchEquipe();
				matchEquipe.setEquipe( equipeRepository.findById((long) 6).get() );
				matchEquipe.setMatchsAsB(match);
				matchEquipe.setCapitaine( joueurRepository.findByName( "KEVIN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "KEVIN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "YVAN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "NAO" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "RONI" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "KAMGA" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "NDJOCK" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "LANAYAL" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "LEONEL" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "CHRIS" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "HERVE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "SERGE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "BARCOLA" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "PRINCE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "CLOTAIRE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "KEVIN BROWN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "OLIVIER MENDEZ" ).get() );
				matchEquipe.setResultat("V");
				matchEquipe.setMarques(6);
				matchEquipe.setEncaisses(4);
				matchEquipeRepository.save(matchEquipe);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("PAUL GABY").get());
				but.setPasseur(joueurRepository.findByName("LEO").get());
				but.setMinute(10);
				but.setScore("1 : 0");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("LEO").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(18);
				but.setScore("2 : 0");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("CLOTAIRE").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(25);
				but.setScore("2 : 1");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("PNJ").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(30);
				but.setScore("2 : 2");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("JOSEPH").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(35);
				but.setScore("3 : 2");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("BARCOLA").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(50);
				but.setScore("3 : 3");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("BARCOLA").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(60);
				but.setScore("3 : 4");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("BARCOLA").get());
				but.setPasseur(joueurRepository.findByName("LEONEL").get());
				but.setMinute(67);
				but.setScore("3 : 5");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("PNJ").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(74);
				but.setScore("4 : 5");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("RONI").get());
				but.setPasseur(joueurRepository.findByName("BARCOLA").get());
				but.setMinute(81);
				but.setScore("4 : 6");
				butRepository.save(but);
				
		matchHighlight = new MatchHighlight();
		matchHighlight.setMatch(match);
		matchHighlight.setDescription("🔥 Score final : 6-4 en faveur des Verts, qui s’imposent au terme d'un match spectaculaire, après avoir été menés au score en première mi-temps !");
		matchHighlightRepository.save(matchHighlight);
		
		matchHighlight = new MatchHighlight();
		matchHighlight.setMatch(match);
		matchHighlight.setDescription("🎯 Léo a signé un très bon match, avec une grosse activité dans le jeu et deux coups francs décisifs : l’un transformé directement, l’autre placé sur la tête de son attaquant pour ouvrir le score.");
		matchHighlight.setJoueur(joueurRepository.findByName("LEO").get());
		matchHighlightRepository.save(matchHighlight);
		
		matchHighlight = new MatchHighlight();
		matchHighlight.setMatch(match);
		matchHighlight.setDescription("🚀 Entrée en jeu fracassante de Barcola, auteur d’un triplé retentissant, dont deux coups francs directs. Une performance XXL qui a totalement renversé le cours du match et offert la victoire à son équipe.");
		matchHighlight.setJoueur(joueurRepository.findByName("BARCOLA").get());
		matchHighlightRepository.save(matchHighlight);
		
		matchHighlight = new MatchHighlight();
		matchHighlight.setMatch(match);
		matchHighlight.setDescription("⚽ Bonne entrée de Roni, qui ajoute son nom à la liste des buteurs et participe pleinement à l’élan offensif des Verts.");
		matchHighlight.setJoueur(joueurRepository.findByName("RONI").get());
		matchHighlightRepository.save(matchHighlight);
		
		matchHighlight = new MatchHighlight();
		matchHighlight.setMatch(match);
		matchHighlight.setDescription("💪 Joseph, infatigable au milieu, a tout donné dans l’impact et l’effort, enchaînant récupérations et projections vers l’avant pour pousser son équipe jusqu’au bout.");
		matchHighlight.setJoueur(joueurRepository.findByName("JOSEPH").get());
		matchHighlightRepository.save(matchHighlight);
		
		////////MCARTHUR MATCH 7 ///////////
		match = new Matchx();
		match.setSante(sante);
		match.setMotm( joueurRepository.findByName( "ANDRE" ).get() );
		match.setDate( 1751475600000L );
		//match.setDate( DateFormatConverter.toLocalDateTimeInMilliseconds(new Date()) );
		matchRepository.save(match);
		
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe( equipeRepository.findById((long) 5).get() );
			matchEquipe.setMatchsAsA(match);
			matchEquipe.setCapitaine( joueurRepository.findByName( "PAUL GABY" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "EBELLE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "FRANCK" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ARMEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ONDJOCK" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ALBERTO" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LEO" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "PAUL GABY" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ARMAND" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ROLAND" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ANDRE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LASSANA" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "CLOTAIRE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "JEAN ROMAIN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "CHRIS" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "RONI" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "CAMAVINGA" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LOGICIEL" ).get() );
			matchEquipe.setResultat("D");
			matchEquipe.setMarques(1);
			matchEquipe.setEncaisses(2);
			matchEquipeRepository.save(matchEquipe);
			
				matchEquipe = new MatchEquipe();
				matchEquipe.setEquipe( equipeRepository.findById((long) 6).get() );
				matchEquipe.setMatchsAsB(match);
				matchEquipe.setCapitaine( joueurRepository.findByName( "YVAN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "YVAN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "SHAMIR" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "KAMGA" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "SERGE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "PRINCE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "KEVIN BROWN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "EUSEBIO" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "BRUCE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "GEORDY" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "JORDAN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "PERLAP" ).get() );
				matchEquipe.setResultat("V");
				matchEquipe.setMarques(2);
				matchEquipe.setEncaisses(1);
				matchEquipeRepository.save(matchEquipe);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("PNJ").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(20);
				but.setScore("1 : 0");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("PNJ").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(40);
				but.setScore("2 : 0");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("CLOTAIRE").get());
				but.setPasseur(joueurRepository.findByName("ANDRE").get());
				but.setMinute(75);
				but.setScore("2 : 1");
				butRepository.save(but);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("✅ Score final : 2-1 en faveur des Verts !");
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("⚔️ Shamir s’est montré dangereux par son sens du placement, réussissant à déstabiliser à plusieurs reprises la défense adverse.");
				matchHighlight.setJoueur(joueurRepository.findByName("SHAMIR").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🔶 André, côté Oranges, a été précieux dans le cœur du jeu, enchaînant les efforts pour organiser et relancer proprement malgré la pression.");
				matchHighlight.setJoueur(joueurRepository.findByName("ANDRE").get());
				matchHighlightRepository.save(matchHighlight);
				
		
		////////MCARTHUR MATCH 8 ///////////
		match = new Matchx();
		match.setSante(sante);
		match.setMotm( joueurRepository.findByName( "ANDRE" ).get() );
		match.setDate( 1751475600000L );
		//match.setDate( DateFormatConverter.toLocalDateTimeInMilliseconds(new Date()) );
		matchRepository.save(match);
		
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe( equipeRepository.findById((long) 5).get() );
			matchEquipe.setMatchsAsA(match);
			matchEquipe.setCapitaine( joueurRepository.findByName( "ARMEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "EBELLE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ARMEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "WELL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ONDJOCK" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ALBERTO" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "FRANKLIN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "CAMAVINGA" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ROLAND" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ANDRE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LASSANA" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "CLOTAIRE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ALAIN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "CHRIS" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "RONI" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "CAMAVINGA" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LOGICIEL" ).get() );
			matchEquipe.setResultat("N");
			matchEquipe.setMarques(1);
			matchEquipe.setEncaisses(1);
			matchEquipeRepository.save(matchEquipe);
			
				matchEquipe = new MatchEquipe();
				matchEquipe.setEquipe( equipeRepository.findById((long) 6).get() );
				matchEquipe.setMatchsAsB(match);
				matchEquipe.setCapitaine( joueurRepository.findByName( "KEVIN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "KEVIN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "SHAMIR" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "KAMGA" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "SERGE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "PRINCE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "JORDAN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "MAJOR" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "NAO" ).get() );
				matchEquipe.setResultat("N");
				matchEquipe.setMarques(1);
				matchEquipe.setEncaisses(1);
				matchEquipeRepository.save(matchEquipe);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("MAJOR").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(10);
				but.setScore("1 : 0");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("ALAIN").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(20);
				but.setScore("1 : 1");
				butRepository.save(but);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("Score final : 1-1 match nul !");
				matchHighlightRepository.save(matchHighlight);
				
		
		////////MCARTHUR MATCH 9 ///////////
		match = new Matchx();
		match.setSante(sante);
		match.setMotm( joueurRepository.findByName( "CLOTAIRE" ).get() );
		match.setDate( 1751787000000L );
		//match.setDate( DateFormatConverter.toLocalDateTimeInMilliseconds(new Date()) );
		matchRepository.save(match);
		
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe( equipeRepository.findById((long) 5).get() );
			matchEquipe.setMatchsAsA(match);
			matchEquipe.setCapitaine( joueurRepository.findByName( "EBELLE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "EBELLE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "JOSEPH" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "WELL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LOGICIEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ANDRE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LASSANA" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "CLOTAIRE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LEO" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ROLAND" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "PANDEV" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ALBERT" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "PRINCE" ).get() );
			matchEquipe.setResultat("V");
			matchEquipe.setMarques(8);
			matchEquipe.setEncaisses(2);
			matchEquipeRepository.save(matchEquipe);
			
				matchEquipe = new MatchEquipe();
				matchEquipe.setEquipe( equipeRepository.findById((long) 6).get() );
				matchEquipe.setMatchsAsB(match);
				matchEquipe.setCapitaine( joueurRepository.findByName( "KEVIN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "KEVIN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "YVAN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "SHAMIR" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "OLIVIER MENDEZ" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "KEVIN BROWN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "LANAYAL" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "BARCOLA" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "ROSTAND" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "DIRANE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "HERVE FONGANG" ).get() );
				matchEquipe.setResultat("D");
				matchEquipe.setMarques(2);
				matchEquipe.setEncaisses(8);
				matchEquipeRepository.save(matchEquipe);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("LEO").get()); //Coup Franc
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(10);
				but.setScore("1 : 0");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("LEO").get()); //Dribble le gardien
				but.setPasseur(joueurRepository.findByName("PANDEV").get());
				but.setMinute(17);
				but.setScore("2 : 0");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("PNJ").get()); //WELL CSC
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(25);
				but.setScore("2 : 1");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("CLOTAIRE").get()); //Lobe
				but.setPasseur(joueurRepository.findByName("LEO").get());
				but.setMinute(30);
				but.setScore("3 : 1");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("DIRANE").get()); //Penalty
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(40);
				but.setScore("3 : 2");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("CLOTAIRE").get());
				but.setPasseur(joueurRepository.findByName("LEO").get());
				but.setMinute(55);
				but.setScore("4 : 2");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("CLOTAIRE").get());
				but.setPasseur(joueurRepository.findByName("PANDEV").get());
				but.setMinute(65);
				but.setScore("5 : 2");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("PANDEV").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get()); // pas de passeur
				but.setMinute(70);
				but.setScore("6 : 2");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("LASSANA").get());
				but.setPasseur(joueurRepository.findByName("LOGICIEL").get());
				but.setMinute(85);
				but.setScore("7 : 2");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("CLOTAIRE").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get()); // pas de passeur
				but.setMinute(90);
				but.setScore("8 : 2");
				butRepository.save(but);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🔥 Score final : 8-2 – Domination totale des Oranges, jamais inquiétés durant la rencontre. Ils mettent ainsi un terme à la série d’invincibilité des Verts !");
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🎨 Quel match de PANDEV, qui clôt son festival créatif ponctué de 2 passes décisives par une reprise de volée en une touche depuis le milieu de terrain, terminant directement au fond des filets. Du grand art. 💥⚽🔥");
				matchHighlight.setJoueur(joueurRepository.findByName("PANDEV").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🪄 Logiciel délivre un centre millimétré, suite à un appel incisif dans la largeur, trouvant son coéquipier seul face au but pour conclure avec sang-froid.");
				matchHighlight.setJoueur(joueurRepository.findByName("LOGICIEL").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🧱 Duo défensif EBELLE - JOSEPH impérial en charnière centrale : les attaquants adverses ont passé 90 minutes dans leurs poches.");
				matchHighlight.setJoueur(joueurRepository.findByName("EBELLE").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🧱 Duo défensif EBELLE - JOSEPH impérial en charnière centrale : les attaquants adverses ont passé 90 minutes dans leurs poches.");
				matchHighlight.setJoueur(joueurRepository.findByName("JOSEPH").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🎯 CLOTAIRE signe une performance XXL : infatigable, il a su sentir tous les bons coups et les convertir avec une précision chirurgicale. Résultat ? 4 buts à son actif.");
				matchHighlight.setJoueur(joueurRepository.findByName("CLOTAIRE").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🧤 ALBERT surprend dans les cages, révélant un talent caché en tant que gardien. Solide sur sa ligne et dominateur dans les airs, il a neutralisé toutes les occasions dangereuses.");
				matchHighlight.setJoueur(joueurRepository.findByName("ALBERT").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🎨 LEO en mode masterclass, avec 2 buts dont un sur coup franc et 2 passes décisives, démontrant toute l’étendue de sa palette technique et de sa vision du jeu.");
				matchHighlight.setJoueur(joueurRepository.findByName("LEO").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🥶 Penalty transformé avec sang-froid et assurance par DIRANE, qui ne tremble pas au moment décisif.");
				matchHighlight.setJoueur(joueurRepository.findByName("DIRANE").get());
				matchHighlightRepository.save(matchHighlight);
				
				
				
				
		//////// MCARTHUR MATCH 10 ///////////
		match = new Matchx();
		match.setSante(sante);
		match.setMotm( joueurRepository.findByName("CLOTAIRE").get() );
		match.setDate( 1752080400000L );
		//match.setDate( DateFormatConverter.toLocalDateTimeInMilliseconds(new Date()) );
		matchRepository.save(match);
		
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe( equipeRepository.findById((long) 5).get() );
			matchEquipe.setMatchsAsA(match);
			matchEquipe.setCapitaine( joueurRepository.findByName( "PNJ" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "JOSEPH" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "SABRI" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "CLOTAIRE" ).get() );
			matchEquipe.setResultat("V");
			matchEquipe.setMarques(2);
			matchEquipe.setEncaisses(1);
			matchEquipeRepository.save(matchEquipe);
			
				matchEquipe = new MatchEquipe();
				matchEquipe.setEquipe( equipeRepository.findById((long) 6).get() );
				matchEquipe.setMatchsAsB(match);
				matchEquipe.setCapitaine( joueurRepository.findByName( "PNJ" ).get() );
				//matchEquipe.getJoueurs().add( joueurRepository.findByName( "NDJOCK" ).get() );
				matchEquipe.setResultat("D");
				matchEquipe.setMarques(1);
				matchEquipe.setEncaisses(2);
				matchEquipeRepository.save(matchEquipe);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("JOSEPH").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(0);
				but.setScore("1 : 0");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("PNJ").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(0);
				but.setScore("1 : 1");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("CLOTAIRE").get());
				but.setPasseur(joueurRepository.findByName("SABRI").get());
				but.setMinute(0);
				but.setScore("2 : 1");
				butRepository.save(but);
				
				
				
		//////// MCARTHUR MATCH 11 ///////////
		match = new Matchx();
		match.setSante(sante);
		match.setMotm( joueurRepository.findByName("PNJ").get() );
		match.setDate( 1752253200000L );
		//match.setDate( DateFormatConverter.toLocalDateTimeInMilliseconds(new Date()) );
		matchRepository.save(match);
		
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe( equipeRepository.findById((long) 5).get() );
			matchEquipe.setMatchsAsA(match);
			matchEquipe.setCapitaine( joueurRepository.findByName( "PNJ" ).get() );
			//matchEquipe.getJoueurs().add( joueurRepository.findByName( "JOSEPH" ).get() );
			matchEquipe.setResultat("N");
			matchEquipe.setMarques(0);
			matchEquipe.setEncaisses(0);
			matchEquipeRepository.save(matchEquipe);
			
				matchEquipe = new MatchEquipe();
				matchEquipe.setEquipe( equipeRepository.findById((long) 6).get() );
				matchEquipe.setMatchsAsB(match);
				matchEquipe.setCapitaine( joueurRepository.findByName( "PNJ" ).get() );
				//matchEquipe.getJoueurs().add( joueurRepository.findByName( "NDJOCK" ).get() );
				matchEquipe.setResultat("N");
				matchEquipe.setMarques(0);
				matchEquipe.setEncaisses(0);
				matchEquipeRepository.save(matchEquipe);
		
		
				
				
		//////// MCARTHUR MATCH 12 ///////////
		match = new Matchx();
		match.setSante(sante);
		match.setMotm( joueurRepository.findByName("KEVIN BROWN").get() );
		match.setDate( 1752390000000L );
		//match.setDate( DateFormatConverter.toLocalDateTimeInMilliseconds(new Date()) );
		matchRepository.save(match);
				
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe( equipeRepository.findById((long) 5).get() );
			matchEquipe.setMatchsAsA(match);
			matchEquipe.setCapitaine( joueurRepository.findByName( "LASSANA" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ALBERT" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LASSANA" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ULRICH C" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LOGICIEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ANDRE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LEO" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "PRINCE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "PANDEV" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "PAUL GABY" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "RONI" ).get() );
			matchEquipe.setResultat("D");
			matchEquipe.setMarques(6);
			matchEquipe.setEncaisses(8);
			matchEquipeRepository.save(matchEquipe);
					
				matchEquipe = new MatchEquipe();
				matchEquipe.setEquipe( equipeRepository.findById((long) 6).get() );
				matchEquipe.setMatchsAsB(match);
				matchEquipe.setCapitaine( joueurRepository.findByName( "NDJOCK" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "NDJOCK" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "NATHAN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "SHAMIR" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "OLIVIER MENDEZ" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "KEVIN BROWN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "BARCOLA" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "ROSTAND" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "KEVIN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "YVAN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "HERVE FONGANG" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "NAO" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "AYOCHE" ).get() );
				matchEquipe.setResultat("V");
				matchEquipe.setMarques(8);
				matchEquipe.setEncaisses(6);
				matchEquipeRepository.save(matchEquipe);
						
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("LEO").get()); //Coup Franc
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(10);
				but.setScore("1 : 0");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("PAUL GABY").get()); //Dribble le gardien
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(17);
				but.setScore("2 : 0");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("PRINCE").get()); //WELL CSC
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(25);
				but.setScore("3 : 0");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("ANDRE").get()); //Lobe
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(30);
				but.setScore("4 : 0");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("PNJ").get()); //Penalty
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(40);
				but.setScore("5 : 0");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("PNJ").get());
				but.setPasseur(joueurRepository.findByName("RONI").get());
				but.setMinute(55);
				but.setScore("6 : 0");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("KEVIN BROWN").get());
				but.setPasseur(joueurRepository.findByName("NDJOCK").get());
				but.setMinute(65);
				but.setScore("6 : 1");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("KEVIN BROWN").get());
				but.setPasseur(joueurRepository.findByName("NATHAN").get()); // pas de passeur
				but.setMinute(70);
				but.setScore("6 : 2");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("KEVIN BROWN").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(85);
				but.setScore("6 : 3");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("BARCOLA").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get()); // pas de passeur
				but.setMinute(90);
				but.setScore("6 : 4");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("BARCOLA").get());
				but.setPasseur(joueurRepository.findByName("OLIVIER MENDEZ").get()); // pas de passeur
				but.setMinute(90);
				but.setScore("6 : 5");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("AYOCHE").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get()); // pas de passeur
				but.setMinute(90);
				but.setScore("6 : 6");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("PNJ").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get()); // pas de passeur
				but.setMinute(90);
				but.setScore("6 : 7");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("PNJ").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get()); // pas de passeur
				but.setMinute(90);
				but.setScore("6 : 8");
				butRepository.save(but);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🔥 Score final : 8-6 en faveur des Verts, au terme d’un match extrêmement disputé, difficile et riche en intensité, où chaque minute a été une bataille.");
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🧠 NDJOCK signe un retour de patron après une longue absence. Placé au cœur du jeu, il a orchestré le tempo avec sang-froid et vision, guidant les siens avec autorité.");
				matchHighlight.setJoueur(joueurRepository.findByName("NDJOCK").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🧩 OLIVIER MENDEZ stabilise le milieu avec simplicité et intelligence, jouant toujours juste pour permettre à ses coéquipiers de s’exprimer.");
				matchHighlight.setJoueur(joueurRepository.findByName("OLIVIER MENDEZ").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🧭 LASSANA, capitaine jusqu’au bout, a porté son équipe dans l’effort, ne lâchant rien, toujours là pour replacer, motiver et pousser ses coéquipiers à se dépasser.");
				matchHighlight.setJoueur(joueurRepository.findByName("LASSANA").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🛡️ ULRICH C, gladiateur en défense centrale, a livré une prestation héroïque face à une attaque adverse particulièrement menaçante. Intraitable dans les duels.");
				matchHighlight.setJoueur(joueurRepository.findByName("ULRICH C").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🌪️ Les Verts ont déployé un véritable déferlement offensif sur les ailes, avec ailiers et latéraux enchaînant les projections et percussions sans relâche. Une intensité constante sur les flancs.");
				matchHighlight.setJoueur(joueurRepository.findByName("ALBERT").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("⚡ HERVÉ FONGANG a mis le feu sur son couloir grâce à sa vitesse supersonique, devenant une solution évidente pour les milieux, qui le lançaient en profondeur les yeux fermés.");
				matchHighlight.setJoueur(joueurRepository.findByName("HERVE FONGANG").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🚀 KEVIN BROWN a carburé tout le match, enchaînant percussions, appels et efforts défensifs, avec un  coup du chapeau à la clé. Inarrêtable.");
				matchHighlight.setJoueur(joueurRepository.findByName("KEVIN BROWN").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🎯 LEO dépose un autre coup franc millimétré en pleine lucarne, une frappe pure et maîtrisée, qui l’érige decidement en véritable expert de l’exercice.");
				matchHighlight.setJoueur(joueurRepository.findByName("LEO").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🦊 Finition d'une touche de balle lechee du bout de l'orteil par PAUL GABY, Fox in the box");
				matchHighlight.setJoueur(joueurRepository.findByName("PAUL GABY").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("💫 PRINCE régale le public avec un but venu d’ailleurs frappe croisee puissante sans hesitation depuis la ligne de corner alors que langle semblait inexistant");
				matchHighlight.setJoueur(joueurRepository.findByName("PRINCE").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🥶 Penalty transformé avec sang-froid et assurance par PNJ, qui ne tremble pas au moment décisif.");
				matchHighlight.setJoueur(joueurRepository.findByName("PNJ").get());
				matchHighlightRepository.save(matchHighlight);
				
				
				
				
		
		//////// MCARTHUR MATCH 13 ///////////
		match = new Matchx();
		match.setSante(sante);
		match.setMotm( joueurRepository.findByName("ALAIN").get() );
		match.setDate( 1752685200000L );
		//match.setDate( DateFormatConverter.toLocalDateTimeInMilliseconds(new Date()) );
		matchRepository.save(match);
		
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe( equipeRepository.findById((long) 5).get() );
			matchEquipe.setMatchsAsA(match);
			matchEquipe.setCapitaine( joueurRepository.findByName( "ARMEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "PRINCE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ARMEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "FRANCK" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ULRICH C" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ALAIN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LEO" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "CLOTAIRE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "EBELLE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "JOSEPH" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ONDJOCK" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "WELL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "CEDRIC" ).get() );
			matchEquipe.setResultat("V");
			matchEquipe.setMarques(1);
			matchEquipe.setEncaisses(0);
			matchEquipeRepository.save(matchEquipe);
			
				matchEquipe = new MatchEquipe();
				matchEquipe.setEquipe( equipeRepository.findById((long) 6).get() );
				matchEquipe.setMatchsAsB(match);
				matchEquipe.setCapitaine( joueurRepository.findByName( "KEVIN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "KEVIN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "HERVE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "YVAN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "EZEKIEL" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "AZIZ" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "BRUCE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "HERVE FONGANG" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "LANAYAL" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "JORDAN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "ROSTAND" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "PERLAP" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "MATHIAS" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "AYOCHE" ).get() );
				matchEquipe.setResultat("D");
				matchEquipe.setMarques(0);
				matchEquipe.setEncaisses(1);
				matchEquipeRepository.save(matchEquipe);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("CEDRIC").get());
				but.setPasseur(joueurRepository.findByName("JOSEPH").get());
				but.setMinute(30);
				but.setScore("1 : 0");
				butRepository.save(but);
		
		
		
		
		
		////////MCARTHUR MATCH 14 ///////////
		match = new Matchx();
		match.setSante(sante);
		match.setMotm( joueurRepository.findByName("ALAIN").get() );
		match.setDate( 1752858000000L );
		//match.setDate( DateFormatConverter.toLocalDateTimeInMilliseconds(new Date()) );
		matchRepository.save(match);
		
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe( equipeRepository.findById((long) 5).get() );
			matchEquipe.setMatchsAsA(match);
			matchEquipe.setCapitaine( joueurRepository.findByName( "ARMEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "FRANCK" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ARMEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "EBELLE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ONDJOCK" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ANDRE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LEO" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "CLOTAIRE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "PANDEV" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "WELL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "FRANKLIN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "CHRIS" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "PRINCE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "CAMAVINGA" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "NEYMAR" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LASSANA" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LOGICIEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "JOSEPH" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "CEDRIC" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ALAIN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "RONI" ).get() );
			matchEquipe.setResultat("N");
			matchEquipe.setMarques(1);
			matchEquipe.setEncaisses(1);
			matchEquipeRepository.save(matchEquipe);
			
				matchEquipe = new MatchEquipe();
				matchEquipe.setEquipe( equipeRepository.findById((long) 6).get() );
				matchEquipe.setMatchsAsB(match);
				matchEquipe.setCapitaine( joueurRepository.findByName( "KEVIN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "KEVIN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "NATHAN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "SHAMIR" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "BRUCE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "SERGE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "YVAN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "HERVE FONGANG" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "MOREL" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "JORDAN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "MAJOR" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "DIRANE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "EZEKIEL" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "RUCKYO" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "IBRAHIM" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "MAJOR" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "AYOCHE" ).get() );
				matchEquipe.setResultat("N");
				matchEquipe.setMarques(1);
				matchEquipe.setEncaisses(1);
				matchEquipeRepository.save(matchEquipe);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("MOREL").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(25);
				but.setScore("1 : 0");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("ALAIN").get()); //Dribble le gardien
				but.setPasseur(joueurRepository.findByName("CEDRIC").get());
				but.setMinute(70);
				but.setScore("1 : 1");
				butRepository.save(but);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("⚔️ Score final : 1-1 Dans un match de haute intensité, riche en qualité technique des deux côtés. Du très beau football du début à la fin.");
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🧠 Génie tactique du capitaine ARMEL, qui a su gérer les rotations avec brio, maintenant qualité et intensité tout au long du match.");
				matchHighlight.setJoueur(joueurRepository.findByName("ARMEL").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("⚡ ALAIN, entré en seconde période, a donné le ton dès son apparition, avant de marquer le but de l’égalisation dans un match très disputé.");
				matchHighlight.setJoueur(joueurRepository.findByName("ALAIN").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🧱 SHAMIR qui a joué en defence centrale comme Frenkie de Jong dans sa jeunesse : vision, calme et relances propres. !");
				matchHighlight.setJoueur(joueurRepository.findByName("SHAMIR").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🔥 MOREL, généreux dans l’effort, a multiplié les percussions tranchantes, dont l’une a mené directement à l’ouverture du score.");
				matchHighlight.setJoueur(joueurRepository.findByName("SHAMIR").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🎯 CEDRIC qui nous fait une Olivier Giroud par son placement dans la surface et ses combinaisons avec ses coequipiers dans les petits espaces. Passe décisive à la clé !");
				matchHighlight.setJoueur(joueurRepository.findByName("CEDRIC").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("💨 SERGE, entré en fin de match, a apporté un second souffle sur les phases de contre-attaque, en multipliant les appels et les efforts dans la profondeur. !");
				matchHighlight.setJoueur(joueurRepository.findByName("SERGE").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🛡️ CHRIS a montré tout son engagement et son sérieux en défense centrale, verrouillant l’axe dans les dernières minutes pour préserver le score.");
				matchHighlight.setJoueur(joueurRepository.findByName("CHRIS").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🎩 NATHAN, grâce à sa technique et son toucher de balle, a été un véritable point de fixation en attaque, faisant respirer son équipe.");
				matchHighlight.setJoueur(joueurRepository.findByName("NATHAN").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🧼 FRANCK, Monsieur Propre au poste de latéral : interventions nettes, propres, toujours bien placé. Rien ne dépasse.");
				matchHighlight.setJoueur(joueurRepository.findByName("NATHAN").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🧭 LASSANA, fidèle à son style : discret mais indispensable, un de ces héros trop peu célébrés. #BusquetsVibes");
				matchHighlight.setJoueur(joueurRepository.findByName("LASSANA").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🛡️ Capitaine ARMEL, exemplaire dans l’axe central. Solide défensivement, propre à la relance. Une performance complète.");
				matchHighlight.setJoueur(joueurRepository.findByName("ARMEL").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("👑 Capitaine KEVIN, leader naturel, toujours présent au départ des sorties de balle. Vision, calme et autorité dans la relance.");
				matchHighlight.setJoueur(joueurRepository.findByName("KEVIN").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("👏 Très bon match collectif, peu de déchets techniques, engagement maîtrisé, et un arbitrage à la hauteur. The Beautiful Game.");
				matchHighlightRepository.save(matchHighlight);
				
				
				
				
		////////MCARTHUR MATCH 15 ///////////
		match = new Matchx();
		match.setSante(sante);
		match.setMotm( joueurRepository.findByName("JOSEPH").get() );
		match.setDate( 1752994800000L );
		//match.setDate( DateFormatConverter.toLocalDateTimeInMilliseconds(new Date()) );
		matchRepository.save(match);
				
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe( equipeRepository.findById((long) 5).get() );
			matchEquipe.setMatchsAsA(match);
			matchEquipe.setCapitaine( joueurRepository.findByName( "ARMEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ARMEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ALBERT" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ULRICH" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "CHRIS" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "WELL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ALAIN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LEO" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "JOSEPH" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "CLOTAIRE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "PAUL GABY" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "RONI" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "PRINCE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "JUNIOR" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ACHILLE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LASSANA" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "FRIDO" ).get() );
			matchEquipe.setResultat("N");
			matchEquipe.setMarques(4);
			matchEquipe.setEncaisses(4);
			matchEquipeRepository.save(matchEquipe);
			
				matchEquipe = new MatchEquipe();
				matchEquipe.setEquipe( equipeRepository.findById((long) 6).get() );
				matchEquipe.setMatchsAsB(match);
				matchEquipe.setCapitaine( joueurRepository.findByName( "KEVIN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "KEVIN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "NAO" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "ROSTAND" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "AYOCHE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "EZEKIEL" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "IBRAHIM" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "AZIZ" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "NDJOCK" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "KEVIN BROWN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "BARCOLA" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "MOREL" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "OLIVIER MENDEZ" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "NATHAN" ).get() );
				matchEquipe.setResultat("N");
				matchEquipe.setMarques(4);
				matchEquipe.setEncaisses(4);
				matchEquipeRepository.save(matchEquipe);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("JOSEPH").get());
				but.setPasseur(joueurRepository.findByName("LEO").get());
				but.setMinute(15);
				but.setScore("1 : 0");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("JOSEPH").get());
				but.setPasseur(joueurRepository.findByName("ALAIN").get());
				but.setMinute(25);
				but.setScore("2 : 0");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("PAUL GABY").get());
				but.setPasseur(joueurRepository.findByName("RONI").get());
				but.setMinute(40);
				but.setScore("3 : 0");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("KEVIN BROWN").get());
				but.setPasseur(joueurRepository.findByName("AYOCHE").get());
				but.setMinute(55);
				but.setScore("3 : 1");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("IBRAHIM").get());
				but.setPasseur(joueurRepository.findByName("NDJOCK").get());
				but.setMinute(65);
				but.setScore("3 : 2");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("KEVIN BROWN").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(75);
				but.setScore("3 : 3");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("NDJOCK").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(85);
				but.setScore("3 : 4");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("ALAIN").get());
				but.setPasseur(joueurRepository.findByName("LASSANA").get());
				but.setMinute(90);
				but.setScore("4 : 4");
				butRepository.save(but);
				
				
				
				
		////////MCARTHUR MATCH 15 ///////////
		match = new Matchx();
		match.setSante(sante);
		match.setMotm( joueurRepository.findByName("LEO").get() );
		match.setDate( 1753290000000L );
		//match.setDate( DateFormatConverter.toLocalDateTimeInMilliseconds(new Date()) );
		matchRepository.save(match);
		
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe( equipeRepository.findById((long) 5).get() );
			matchEquipe.setMatchsAsA(match);
			matchEquipe.setCapitaine( joueurRepository.findByName( "ARMEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "EBELLE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ARMEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ULRICH" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "CHRIS" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LOGICIEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ALAIN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ANDRE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LEO" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "PAUL GABY" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "WELL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "RONI" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ALBERTO" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ROLAND" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "FRANKLIN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "CAMAVINGA" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "PRINCE" ).get() );
			matchEquipe.setResultat("V");
			matchEquipe.setMarques(3);
			matchEquipe.setEncaisses(1);
			matchEquipeRepository.save(matchEquipe);
			
				matchEquipe = new MatchEquipe();
				matchEquipe.setEquipe( equipeRepository.findById((long) 6).get() );
				matchEquipe.setMatchsAsB(match);
				matchEquipe.setCapitaine( joueurRepository.findByName( "KEVIN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "KEVIN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "NAO" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "ROSTAND" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "AYOCHE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "YVAN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "NDJOCK" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "AZIZ" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "SERGE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "KAMGA" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "SHAMIR" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "NATHAN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "LEONEL" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "MAJOR" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "JORDAN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "BRUCE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "SALAH" ).get() );
				matchEquipe.setResultat("D");
				matchEquipe.setMarques(1);
				matchEquipe.setEncaisses(3);
				matchEquipeRepository.save(matchEquipe);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("ALAIN").get());
				but.setPasseur(joueurRepository.findByName("PAUL GABY").get());
				but.setMinute(15);
				but.setScore("1 : 0");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("RONI").get());
				but.setPasseur(joueurRepository.findByName("LEO").get());
				but.setMinute(35);
				but.setScore("2 : 0");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("MAJOR").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(55);
				but.setScore("2 : 1");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("ALBERTO").get());
				but.setPasseur(joueurRepository.findByName("LEO").get());
				but.setMinute(70);
				but.setScore("3 : 1");
				butRepository.save(but);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🍊 Score final : 3-1 en faveur des oranges au terme d'un match globalement maîtrisé, malgré  une grosse frayeur en debut de deuxieme période");
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🧠 WELL qui demontre son enorme intelligence de jeu, en etant très  mobile dans son placement et présent à la troisième passe sur les deux premiers buts. Un maestro discret, mais essentiel !");
				matchHighlight.setJoueur(joueurRepository.findByName("WELL").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("💨 Serge a prouvé qu’il en avait encore sous la semelle, avec une accélération fulgurante en duel défensif, digne d’un jeune joueur à son prime. 🔥 !");
				matchHighlight.setJoueur(joueurRepository.findByName("SERGE").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🗣️ EBELLE, patron de la défense, a guidé ses coéquipiers vocalement tout le match, assurant un bloc solide qui a servi de fondation à la victoire. !");
				matchHighlight.setJoueur(joueurRepository.findByName("EBELLE").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🎯 PAUL GABY a brillé en point de fixation, dos au but, absorbant la pression pour faire jouer les autres. Un match propre et utile.");
				matchHighlight.setJoueur(joueurRepository.findByName("PAUL GABY").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🧩 AZIZ, précieux au milieu, a tenté de stabiliser le tempo et de faciliter la sortie de balle, gardant la tête froide sous pression.");
				matchHighlight.setJoueur(joueurRepository.findByName("AZIZ").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🎨 LEO, en chef d’orchestre, a dicté le rythme au milieu et récompense sa prestation par deux passes décisives. Vision et exécution au top.");
				matchHighlight.setJoueur(joueurRepository.findByName("LEO").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🔎 NDJOCK n’a cessé de chercher des solutions offensives avec ses passes tranchantes dans la zone décisive, jusqu’au coup de sifflet final.");
				matchHighlight.setJoueur(joueurRepository.findByName("AZIZ").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🧠 Capitaine ARMEL a sublimé sa prestation défensive par des relances précises et des prises de décision impeccables. Calme et lucide sous pression.");
				matchHighlight.setJoueur(joueurRepository.findByName("ARMEL").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("⚡ NAO, intenable sur son flanc, a déployé un énorme volume de jeu avant de voir son match s’arrêter prématurément sur blessure, après un choc sévère. Courage et rétablissement à lui. 💪");
				matchHighlight.setJoueur(joueurRepository.findByName("AZIZ").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🥶 RONI a été récompensé de ses nombreux appels de qualité avec un superbe but sur une frappe croisée pleine de sang-froid. Tranchant et décisif.");
				matchHighlight.setJoueur(joueurRepository.findByName("RONI").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🛡️ CHRIS qui ne cesse de monter en puissance depuis son retour de blessure, s’interposant régulièrement sur son aile face aux offensives adverses. De l'engagement et du cœur.");
				matchHighlight.setJoueur(joueurRepository.findByName("CHRIS").get());
				matchHighlightRepository.save(matchHighlight);
				
				
		
		////////MCARTHUR MATCH 16 ///////////
		match = new Matchx();
		match.setSante(sante);
		match.setMotm( joueurRepository.findByName("PANDEV").get() );
		match.setDate( 1753462800000L );
		//match.setDate( DateFormatConverter.toLocalDateTimeInMilliseconds(new Date()) );
		matchRepository.save(match);
				
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe( equipeRepository.findById((long) 5).get() );
			matchEquipe.setMatchsAsA(match);
			matchEquipe.setCapitaine( joueurRepository.findByName( "ARMEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "JEAN ROMAIN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ARMEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "EBELLE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "WELL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ROLAND" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ALAIN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ANDRE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "PANDEV" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LASSANA" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "JOSEPH" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "RONI" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LOGICIEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "CHRIS" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "PRINCE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "CEDRIC" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ACHILLE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "NEW DC" ).get() );
			matchEquipe.setResultat("V");
			matchEquipe.setMarques(3);
			matchEquipe.setEncaisses(0);
			matchEquipeRepository.save(matchEquipe);
			
				matchEquipe = new MatchEquipe();
				matchEquipe.setEquipe( equipeRepository.findById((long) 6).get() );
				matchEquipe.setMatchsAsB(match);
				matchEquipe.setCapitaine( joueurRepository.findByName( "KEVIN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "SHAMIR" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "YVAN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "SERGE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "AYOCHE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "DIRANE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "BRUCE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "KEVIN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "MAJOR" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "KAMGA" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "HERMAN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "JORDAN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "SALAH" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "OLIVIER MENDEZ" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "ROSTAND" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "BARCOLA" ).get() );
				matchEquipe.setResultat("D");
				matchEquipe.setMarques(0);
				matchEquipe.setEncaisses(3);
				matchEquipeRepository.save(matchEquipe);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("PANDEV").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(15);
				but.setScore("1 : 0");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("PANDEV").get());
				but.setPasseur(joueurRepository.findByName("ALAIN").get());
				but.setMinute(35);
				but.setScore("2 : 0");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("PANDEV").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(75);
				but.setScore("3 : 0");
				butRepository.save(but);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🟠 Score final : 3-0 en faveur des oranges au terme d'un match maîtrisé de fond en comble");
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🎩 PANDEV qui sort une masterclass tout simplement, auteur d’un coup du chapeau dans un match où tout lui réussissait. Vision, finition, confiance - Ndole du jour.");
				matchHighlight.setJoueur(joueurRepository.findByName("PANDEV").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🧩 LOGICIEL : Vraiment, en toute humilité, ce n’était là qu’un fragment de mon vrai niveau. À Douala, j’étais le meilleur 6 de mon quartier. Olivier Mendez ne me laissera pas mentir");
				matchHighlight.setJoueur(joueurRepository.findByName("LOGICIEL").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🧩 LOGICIEL suite et fin : C’est juste que bon, j’ai dû faire une reconversion professionnelle à cause des milieux Orange qu'on connais tous très bien.");
				matchHighlight.setJoueur(joueurRepository.findByName("LOGICIEL").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🔥 MAJOR a mouillé le maillot jusqu’au bout, se battant en attaque pour garder son équipe à flot, malgré l’adversité.");
				matchHighlight.setJoueur(joueurRepository.findByName("MAJOR").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🧱 Duo défensif EBELLE - ARMEL solide en defense centrale comme a leur habitude, permettant aux oranges de conserver le cleansheet.");
				matchHighlight.setJoueur(joueurRepository.findByName("EBELLE").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🧱 Duo défensif EBELLE - ARMEL solide en defense centrale comme a leur habitude, permettant aux Oranges de conserver le cleansheet.");
				matchHighlight.setJoueur(joueurRepository.findByName("ARMEL").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("⚔️ HERMAN, engagé en attaque, n’a jamais cessé de chercher la faille pour inquiéter la défense adverse.");
				matchHighlight.setJoueur(joueurRepository.findByName("HERMAN").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🔁 ANDRÉ, généreux dans l’effort, a été au cœur du jeu, toujours bien placé, que ce soit en phase défensive ou offensive. Un vrai relais pour ses coéquipiers.");
				matchHighlight.setJoueur(joueurRepository.findByName("ANDRE").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🧭 LASSANA, pilier essentiel de l'imprenable milieu a 3, a dominé par ses prises de décision intelligentes, sa simplicité de jeu et son impact discret mais fondamental.");
				matchHighlight.setJoueur(joueurRepository.findByName("LASSANA").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🎯 ALAIN, fidèle à lui-même, a rayonné par sa maîtrise au milieu de terrain, dictant le tempo avec calme et justesse, et signant une passe décisive pour couronner sa prestation.");
				matchHighlight.setJoueur(joueurRepository.findByName("ALAIN").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("💨 AYOCHE, infatigable, a tout donné dans l’effort jusqu’au dernier coup de sifflet.");
				matchHighlight.setJoueur(joueurRepository.findByName("AYOCHE").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("⚡ Notable KONFO, en feu sur son couloir, a pris le dessus à plusieurs reprises sur les défenseurs adverses. Percutant, explosif, sans retenue.");
				matchHighlight.setJoueur(joueurRepository.findByName("ACHILLE").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🛡️ SERGE a su jouer sur ses forces avec intelligence, apportant sécurité et stabilité à son poste tout au long du match. Solide et lucide.");
				matchHighlight.setJoueur(joueurRepository.findByName("AYOCHE").get());
				matchHighlightRepository.save(matchHighlight);
		
				
				
		////////MCARTHUR MATCH 17 ///////////
		match = new Matchx();
		match.setSante(sante);
		match.setMotm( joueurRepository.findByName("MAJOR").get() );
		match.setDate( 1753599600000L );
		match.setCanVoteMotm(false);
		//match.setDate( DateFormatConverter.toLocalDateTimeInMilliseconds(new Date()) );
		matchRepository.save(match);
				
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe( equipeRepository.findById((long) 5).get() );
			matchEquipe.setMatchsAsA(match);
			matchEquipe.setCapitaine( joueurRepository.findByName( "JOSEPH" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "JOSEPH" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ROLAND" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "WELL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ULRICH C" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "NEW DC" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ALAIN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "PRINCE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "CLOTAIRE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ACHILLE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "PANDEV" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LOGICIEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "CHRIS" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LEO" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "PAUL GABY" ).get() );
			matchEquipe.setResultat("D");
			matchEquipe.setMarques(4);
			matchEquipe.setEncaisses(5);
			matchEquipeRepository.save(matchEquipe);
			
				matchEquipe = new MatchEquipe();
				matchEquipe.setEquipe( equipeRepository.findById((long) 6).get() );
				matchEquipe.setMatchsAsB(match);
				matchEquipe.setCapitaine( joueurRepository.findByName( "KEVIN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "IBRAHIM" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "AYOCHE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "YVAN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "KEVIN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "EZEKIEL" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "DIRANE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "NDJOCK" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "OLIVIER MENDEZ" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "KEVIN BROWN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "KAMGA" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "AZIZ" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "MAJOR" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "ROSTAND" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "HERVE FONGANG" ).get() );
				matchEquipe.setResultat("V");
				matchEquipe.setMarques(5);
				matchEquipe.setEncaisses(4);
				matchEquipeRepository.save(matchEquipe);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("NDJOCK").get());
				but.setPasseur(joueurRepository.findByName("KEVIN BROWN").get());
				but.setMinute(15);
				but.setScore("0 : 1");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("ROLAND").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(25);
				but.setScore("1 : 1");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("PNJ").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(35);
				but.setScore("2 : 1");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("CLOTAIRE").get());
				but.setPasseur(joueurRepository.findByName("LEO").get());
				but.setMinute(48);
				but.setScore("3 : 1");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("MAJOR").get());
				but.setPasseur(joueurRepository.findByName("AYOCHE").get());
				but.setMinute(55);
				but.setScore("3 : 2");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("MAJOR").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(62);
				but.setScore("3 : 3");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("MAJOR").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(70);
				but.setScore("3 : 4");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("PNJ").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(78);
				but.setScore("3 : 5");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 6).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("PAUL GABY").get()); // PENALTY
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(83);
				but.setScore("4 : 5");
				butRepository.save(but);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("⚔️ Score final : 5-4 en faveur des Verts, un match plein de rebondissements, où les Verts finissent par prendre le dessus grâce à une seconde mi-temps renversante.");
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🔥 MAJOR signe une entrée en jeu tonitruante, avec un hat trick décisif en seconde période. Impact immédiat, changement de rythme, Ndole du match.");
				matchHighlight.setJoueur(joueurRepository.findByName("MAJOR").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🛡️ NEW DC s’est illustré par une prestation solide en défense centrale, rassurant dans ses interventions et solide dans les duels.");
				matchHighlight.setJoueur(joueurRepository.findByName("NEW DC").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🎼 OLIVIER MENDEZ, en pur métronome, a fluidifié les sorties de balle avec calme et lucidité. Discret, mais fondamental.");
				matchHighlight.setJoueur(joueurRepository.findByName("OLIVIER MENDEZ").get());
				matchHighlightRepository.save(matchHighlight);

				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🚀 CLOTAIRE, généreux dans l’effort et engagé dans les duels, inscrit un but somptueux de l'exteieur de la surface. Un petit manque de réussite sur d'autres phases, mais bon match globalement.");
				matchHighlight.setJoueur(joueurRepository.findByName("CLOTAIRE").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🧤 IBRAHIM signe une top performance dans les buts, révélant un véritable talent caché au poste de gardien. Parades décisives et sang-froid.");
				matchHighlight.setJoueur(joueurRepository.findByName("IBRAHIM").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🥶 ROLAND convertit son penalty avec sang-froid et assurance, ne laissant aucune chance au gardien.");
				matchHighlight.setJoueur(joueurRepository.findByName("ROLAND").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🎯 NDJOCK a su créer le danger par des passes précises, cassant les lignes et lançant ses attaquants dans le dos de la défense.");
				matchHighlight.setJoueur(joueurRepository.findByName("NDJOCK").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🥶 PAUL GABY, lui aussi, transforme son penalty avec maîtrise, ajoutant son nom à la liste des buteurs du jour.");
				matchHighlight.setJoueur(joueurRepository.findByName("PAUL GABY").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("⚡ KEVIN BROWN, percutant dès les premiers instants, ouvre le score avec un but décisif.");
				matchHighlight.setJoueur(joueurRepository.findByName("KEVIN BROWN").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🎁 LEO, tout juste entré en jeu, offre une passe décisive sur son tout premier ballon. Impact express.");
				matchHighlight.setJoueur(joueurRepository.findByName("LEO").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🎯 AZIZ s’est distingué par sa qualité de contrôle et sa protection de balle, précis et efficace dans l’enchaînement. Une vraie assurance technique.");
				matchHighlight.setJoueur(joueurRepository.findByName("AZIZ").get());
				matchHighlightRepository.save(matchHighlight);
				
		
				
		////////MCARTHUR MATCH 18 ///////////
		match = new Matchx();
		match.setSante(sante);
		match.setMotm( joueurRepository.findByName("ALBERTO").get() );
		match.setDate( 1753894800000L );
		match.setCanVoteMotm(false);
		//match.setDate( DateFormatConverter.toLocalDateTimeInMilliseconds(new Date()) );
		matchRepository.save(match);
		
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe( equipeRepository.findById((long) 5).get() );
			matchEquipe.setMatchsAsA(match);
			matchEquipe.setCapitaine( joueurRepository.findByName( "ARMEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "WELL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "FRANCK" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ULRICH C" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ARMEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "CHRIS" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ALAIN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LASSANA" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "RONI" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ARMAND" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ALBERTO" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LOGICIEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "PRINCE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LEO" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "EBELLE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "CAMAVINGA" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "SOULEY" ).get() );
			matchEquipe.setResultat("V");
			matchEquipe.setMarques(1);
			matchEquipe.setEncaisses(0);
			matchEquipeRepository.save(matchEquipe);
			
				matchEquipe = new MatchEquipe();
				matchEquipe.setEquipe( equipeRepository.findById((long) 6).get() );
				matchEquipe.setMatchsAsB(match);
				matchEquipe.setCapitaine( joueurRepository.findByName( "KEVIN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "YVAN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "AYOCHE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "KEVIN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "AZIZ" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "DIRANE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "BRUCE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "IBRAHIM" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "NATHAN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "KAMGA" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "JORDAN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "SERGE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "KENFY" ).get() );
				matchEquipe.setResultat("D");
				matchEquipe.setMarques(0);
				matchEquipe.setEncaisses(1);
				matchEquipeRepository.save(matchEquipe);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 5).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("ALBERTO").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(35);
				but.setScore("1 : 0");
				butRepository.save(but);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("Score final : 1-0 en faveur des Oranges, au terme d'un tres bon match de part et d'autre dans l'ensemble");
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("ALBERTO, L'homme du match qui claque un super but d'une frappe tendu et puissante donner l'avantage a son equipe");
				matchHighlight.setJoueur(joueurRepository.findByName("ALBERTO").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("AZIZ, qui sort une grosse performance, dans son volume de jeu et sa qualitee avec le ballon");
				matchHighlight.setJoueur(joueurRepository.findByName("AZIZ").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("ARMEL, Tres bon match de Armel qui as contribuee tant offensivement qu defensivement");
				matchHighlight.setJoueur(joueurRepository.findByName("ARMEL").get());
				matchHighlightRepository.save(matchHighlight);
				
				
				
		////////MCARTHUR MATCH 19 ///////////
		match = new Matchx();
		match.setSante(sante);
		match.setMotm( joueurRepository.findByName("PNJ").get() );
		match.setDate( 1754067600000L );
		match.setCanVoteMotm(true);
		//match.setDate( DateFormatConverter.toLocalDateTimeInMilliseconds(new Date()) );
		matchRepository.save(match);
		
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe( equipeRepository.findById((long) 5).get() );
			matchEquipe.setMatchsAsA(match);
			matchEquipe.setCapitaine( joueurRepository.findByName( "ARMEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "FRANCK" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ARMEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "EBELLE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ROLAND" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ALAIN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ANDRE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LEO" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "PAUL GABY" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ACHILLE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "ARMAND" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LOGICIEL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "CAMAVINGA" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "CEDRIC" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "PRINCE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "JOSEPH" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "SABRI" ).get() );
			matchEquipe.setResultat("N");
			matchEquipe.setMarques(0);
			matchEquipe.setEncaisses(0);
			matchEquipeRepository.save(matchEquipe);
			
				matchEquipe = new MatchEquipe();
				matchEquipe.setEquipe( equipeRepository.findById((long) 6).get() );
				matchEquipe.setMatchsAsB(match);
				matchEquipe.setCapitaine( joueurRepository.findByName( "KEVIN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "YVAN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "AYOCHE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "KEVIN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "AZIZ" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "KAMGA" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "JORDAN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "SERGE" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "LANAYAL" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "HERMAN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "HERVE FONGANG" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "MOREL" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "RUCKYO" ).get() );
				matchEquipe.setResultat("N");
				matchEquipe.setMarques(0);
				matchEquipe.setEncaisses(0);
				matchEquipeRepository.save(matchEquipe);
				
				
				
				
				
				
				
				
				
				
				
				
				
		///////////////////////////////////////////// AIFOG AIFOG AIFOG AIFOG AIFOG AIFOG AIFOG AIFOG AIFOG  //////////////////////////////	
				
				
		sante = new Sante();
		sante.setName("AIFOG");
		sante.setLogo("monndole-logo.png");
		sante.setCountry("CANADA");
		sante.setAddress("École élémentaire catholique des pins, 1487 Pr, Ridgebrook Dr, Ottawa, ON");
		sante.setManager("BAKANDJA");
		santeRepository.save(sante);
		
			joueur = new Joueur();
			joueur.setName("BAKANDJA");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("GILDAS");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("RACIMI");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("RODRIGUE");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("ALFRED");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("DJOUFACK");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("FRANCK T.");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("THIERRY");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("AUBIN");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("ALEX");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("HENRY");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("GEORGE");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("LEONEL AIFOG");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("STAM");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("HUGUES");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("MARTIAL");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
		equipe = new Equipe();
		equipe.setName("BLEUS");
		equipe.setSante(sante);
		equipeRepository.save(equipe);
					
			equipe = new Equipe();
			equipe.setName("ROUGES");
			equipe.setSante(sante);
			equipeRepository.save(equipe);
						
			equipe = new Equipe();
			equipe.setName("AIFOG");
			equipe.setSante(sante);
			equipeRepository.save(equipe);
		
		
		
		
		
		
		
		
		
		
		
		
		///////////////////////////////////////////// Club santé Gießen Club santé Gießen Club santé Gießen Club santé Gießen Club santé Gießen Club santé Gießen Club santé Gießen  //////////////////////////////	
				
				
		sante = new Sante();
		sante.setName("Club santé Gießen");
		sante.setLogo("monndole-logo.png");
		sante.setCountry("ALLEMAGNE");
		sante.setAddress("Heyerweg 43, 35394 Gießen");
		sante.setManager("EMMANUEL");
		santeRepository.save(sante);
		
			joueur = new Joueur();
			joueur.setName("EMMANUEL");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("JUNIS");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("SERAPHIN");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("YVAN A");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("ORLUS");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("BRICE");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("RODAN");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("BOULBI");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("PERICLES");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("HERMANN");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("AMI DE BOULBI");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("OKRY");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("FRANCK A");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("STEVE MOREL");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("SCANNER");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("NARCISSE");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("LE 9");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("YANN ABEL");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("THIERRY A");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("RICHARD");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("RODASSIN");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("SONNY");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("EDDY");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("MESSI");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("LE NOUVEAU");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("LATO");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("BORID");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("GILLES");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("FRED CALVIN");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("CEDRIC A");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("NEYMAR A");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("BAGNEK");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("VINICIUS");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("LIONEL A");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("HENRI");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("ULRICH A");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("T'CHOISIS");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
			joueur = new Joueur();
			joueur.setName("BORIS");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
			
		equipe = new Equipe();
		equipe.setName("EQUIPE A");
		equipe.setSante(sante);
		equipeRepository.save(equipe);
				
			equipe = new Equipe();
			equipe.setName("EQUIPE B");
			equipe.setSante(sante);
			equipeRepository.save(equipe);
					
			equipe = new Equipe();
			equipe.setName("Club santé Gießen");
			equipe.setSante(sante);
			equipeRepository.save(equipe);
			
			
			
		
		//////// MCARTHUR MATCH 1 ///////////
		match = new Matchx();
		match.setSante(sante);
		match.setMotm( joueurRepository.findByName("RODAN").get() );
		match.setDate( 1753462800000L );
		match.setCanVoteMotm(false);
		//match.setDate( DateFormatConverter.toLocalDateTimeInMilliseconds(new Date()) );
		matchRepository.save(match);
		
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe( equipeRepository.findById((long) 11).get() );
			matchEquipe.setMatchsAsA(match);
			matchEquipe.setCapitaine( joueurRepository.findByName( "BOULBI" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "JUNIS" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "YVAN A" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "BRICE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "BOULBI" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "HERMANN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "OKRY" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "STEVE MOREL" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "NARCISSE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "YANN ABEL" ).get() );
			matchEquipe.setResultat("N");
			matchEquipe.setMarques(4);
			matchEquipe.setEncaisses(4);
			matchEquipeRepository.save(matchEquipe);
			
				matchEquipe = new MatchEquipe();
				matchEquipe.setEquipe( equipeRepository.findById((long) 12).get() );
				matchEquipe.setMatchsAsB(match);
				matchEquipe.setCapitaine( joueurRepository.findByName( "SERAPHIN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "SERAPHIN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "ORLUS" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "RODAN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "PERICLES" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "AMI DE BOULBI" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "FRANCK A" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "SCANNER" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "LE 9" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "THIERRY A" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "RICHARD" ).get() );
				matchEquipe.setResultat("N");
				matchEquipe.setMarques(4);
				matchEquipe.setEncaisses(4);
				matchEquipeRepository.save(matchEquipe);
			
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 11).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("YANN ABEL").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(10);
				but.setScore("1 : 0");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 11).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("YANN ABEL").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(25);
				but.setScore("2 : 0");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 11).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("HERMANN").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(35);
				but.setScore("3 : 0");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 11).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("STEVE MOREL").get());
				but.setPasseur(joueurRepository.findByName("BRICE").get());
				but.setMinute(40);
				but.setScore("4 : 0");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 12).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("LE 9").get());
				but.setPasseur(joueurRepository.findByName("RODAN").get());
				but.setMinute(50);
				but.setScore("4 : 1");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 12).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("PERICLES").get());
				but.setPasseur(joueurRepository.findByName("SERAPHIN").get());
				but.setMinute(60);
				but.setScore("4 : 2");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 12).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("THIERRY").get());
				but.setPasseur(joueurRepository.findByName("PERICLES").get());
				but.setMinute(70);
				but.setScore("4 : 3");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 12).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("RICHARD").get());
				but.setPasseur(joueurRepository.findByName("RODAN").get());
				but.setMinute(85);
				but.setScore("4 : 4");
				butRepository.save(but);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("⚔️ Score final : 4-4, Un match au scénario renversant, où les Verts, menés au score, trouvent les ressources pour arracher un nul spectaculaire.");
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("⚽ YANN ABEL signe un doublé explosif. Un attaquant chirurgical qui punit la moindre hésitation.");
				matchHighlight.setJoueur(joueurRepository.findByName("YANN ABEL").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("💥 STEVE MOREL ajoute sa pierre à l’édifice avec un but plein de sang-froid. Efficace quand il le faut.");
				matchHighlight.setJoueur(joueurRepository.findByName("STEVE MOREL").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🔋 HERMANN, lui aussi buteur, montre qu’il sait répondre présent dans les moments clés. Une contribution qui pèse.");
				matchHighlight.setJoueur(joueurRepository.findByName("HERMANN").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🧩 PERICLES, buteur et passeur, est l’un des grands artisans de la remontée verte. Présent dans les circuits de jeu, actif dans les zones dangereuses.");
				matchHighlight.setJoueur(joueurRepository.findByName("PERICLES").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🎯 SERAPHIN délivre une passe décisive pour relancer la machine. Une intervention propre et lucide qui redonne espoir aux siens.");
				matchHighlight.setJoueur(joueurRepository.findByName("SERAPHIN").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🥶 LE 9, à la finition, inscrit son nom sur la feuille de match. Une présence décisive dans la surface.");
				matchHighlight.setJoueur(joueurRepository.findByName("LE 9").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🚀 THIERRY, buteur lors de la remontée, fait parler son sang-froid au moment clé. Une action qui remet les siens dans le match.");
				matchHighlight.setJoueur(joueurRepository.findByName("THIERRY").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🥶 RICHARD transforme son penalty avec un calme glacial, sans trembler au moment décisif. Maîtrise totale.");
				matchHighlight.setJoueur(joueurRepository.findByName("RICHARD").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🔥 RODAN signe une top performance, en semant le trouble dans la défense adverse à plusieurs reprises. Il provoque un penalty, puis offre deux passes décisives dans la foulée. Percutant, imprévisible, décisif.");
				matchHighlight.setJoueur(joueurRepository.findByName("RODAN").get());
				matchHighlightRepository.save(matchHighlight);
				
				matchHighlight = new MatchHighlight();
				matchHighlight.setMatch(match);
				matchHighlight.setDescription("🧭 OKRY livre une prestation dominante au milieu de terrain, orientant le jeu avec justesse et impact. Pilier de l’entrejeu.");
				matchHighlight.setJoueur(joueurRepository.findByName("OKRY").get());
				matchHighlightRepository.save(matchHighlight);
				
				
		
		//////// MCARTHUR MATCH 2 ///////////
		match = new Matchx();
		match.setSante(sante);
		match.setMotm( joueurRepository.findByName("PNJ").get() );
		match.setDate( 1754067600000L );
		match.setCanVoteMotm(true);
		//match.setDate( DateFormatConverter.toLocalDateTimeInMilliseconds(new Date()) );
		matchRepository.save(match);
		
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe( equipeRepository.findById((long) 11).get() );
			matchEquipe.setMatchsAsA(match);
			matchEquipe.setCapitaine( joueurRepository.findByName( "JUNIS" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "JUNIS" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "RODASSIN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "SERAPHIN" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "RICHARD" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "BRICE" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "SONNY" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "EDDY" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LE 9" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "MESSI" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LE NOUVEAU" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "LATO" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "BORIS" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "GILLES" ).get() );
			matchEquipe.getJoueurs().add( joueurRepository.findByName( "FRED CALVIN" ).get() );
			matchEquipe.setResultat("V");
			matchEquipe.setMarques(6);
			matchEquipe.setEncaisses(3);
			matchEquipeRepository.save(matchEquipe);
			
				matchEquipe = new MatchEquipe();
				matchEquipe.setEquipe( equipeRepository.findById((long) 12).get() );
				matchEquipe.setMatchsAsB(match);
				matchEquipe.setCapitaine( joueurRepository.findByName( "ULRICH A" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "RODAN" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "CEDRIC A" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "ULRICH A" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "NEYMAR A" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "ORLUS" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "BAGNEK" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "VINICIUS" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "LIONEL A" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "HENRI" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "T'CHOISIS" ).get() );
				matchEquipe.getJoueurs().add( joueurRepository.findByName( "SCANNER" ).get() );
				matchEquipe.setResultat("D");
				matchEquipe.setMarques(3);
				matchEquipe.setEncaisses(6);
				matchEquipeRepository.save(matchEquipe);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 11).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("SERAPHIN").get());
				but.setPasseur(joueurRepository.findByName("FRED CALVIN").get());
				but.setMinute(10);
				but.setScore("1 : 0");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 11).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("SERAPHIN").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(10);
				but.setScore("2 : 0");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 11).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("FRED CALVIN").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(10);
				but.setScore("3 : 0");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 11).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("MESSI").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(10);
				but.setScore("4 : 0");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 11).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("RODASSIN").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(10);
				but.setScore("5 : 0");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 11).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("PNJ").get()); //CSC RODAN
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(10);
				but.setScore("6 : 0");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 12).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("NEYMAR A").get());
				but.setPasseur(joueurRepository.findByName("RODAN").get());
				but.setMinute(10);
				but.setScore("6 : 1");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 12).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("RODAN").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(0);
				but.setScore("6 : 2");
				butRepository.save(but);
				
				but = new But();
				but.setEquipe(matchEquipeRepository.findById((long) 12).get());
				but.setMatch(match);
				but.setButeur(joueurRepository.findByName("SCANNER").get());
				but.setPasseur(joueurRepository.findByName("PNJ").get());
				but.setMinute(0);
				but.setScore("6 : 3");
				butRepository.save(but);
		
	}

}
