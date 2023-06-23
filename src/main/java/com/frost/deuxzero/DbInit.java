package com.frost.deuxzero;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.frost.deuxzero.model.But;
import com.frost.deuxzero.model.Equipe;
import com.frost.deuxzero.model.Joueur;
import com.frost.deuxzero.model.Match;
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
		joueur.setName("HAROLD");
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
			joueur.setName("GILBERT");
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
			joueur.setName("INVITE");
			joueur.setSante(sante);
			joueurRepository.save(joueur);
		
		Equipe equipe = new Equipe();
		equipe.setName("Bleues");
		equipe.setSante(sante);
		equipeRepository.save(equipe);
		
			equipe = new Equipe();
			equipe.setName("Verts");
			equipe.setSante(sante);
			equipeRepository.save(equipe);
		
		Match match = new Match();
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
			
		match = new Match();
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
			but.setEquipe( matchEquipeRepository.findById((long) 1).get() );
			but.setMatch(match);
			but.setButeur( joueurRepository.findByName( "BASSOGOG" ).get() );
			but.setPasseur( null );
			but.setMinute(31);
			butRepository.save(but);
		
				
				
		//TROISIEME MATCH
				
		match = new Match();
		match.setSante(sante);
		match.setMotm( joueurRepository.findByName( "BLAISO" ).get() );
		match.setDate( 1687071600000L );
		//match.setDate( DateFormatConverter.toLocalDateTimeInMilliseconds(new Date()) );
		matchRepository.save(match);
				
		matchEquipe = new MatchEquipe();
		matchEquipe.setEquipe( equipeRepository.findById((long) 1).get() );
		matchEquipe.setMatchsAsA(match);
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "BOREL" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "DUPLEX" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "NDELE" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "CHRISTIAN" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "BLAISO" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "ANCIEN" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "HAROLD" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "AHSAN" ).get() );
		matchEquipe.getJoueurs().add( joueurRepository.findByName( "RUDY" ).get() );
		matchEquipe.setCapitaine( joueurRepository.findByName( "BOREL" ).get() );
		matchEquipe.setResultat("V");
		matchEquipe.setMarques(2);
		matchEquipe.setEncaisses(1);
		matchEquipeRepository.save(matchEquipe);
				
			matchEquipe = new MatchEquipe();
			matchEquipe.setEquipe( equipeRepository.findById((long) 2).get() );
			matchEquipe.setMatchsAsB(match);
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
			matchEquipe.setCapitaine( joueurRepository.findByName( "LIONEL" ).get() );
			matchEquipe.setResultat("D");
			matchEquipe.setMarques(1);
			matchEquipe.setEncaisses(2);
			matchEquipeRepository.save(matchEquipe);
					
			but = new But();
			but.setEquipe( matchEquipeRepository.findById((long) 1).get() );
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
		
	}

}
