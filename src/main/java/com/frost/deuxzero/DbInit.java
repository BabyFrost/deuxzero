package com.frost.deuxzero;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.frost.deuxzero.model.Joueur;
import com.frost.deuxzero.model.Sante;
import com.frost.deuxzero.repository.JoueurRepository;
import com.frost.deuxzero.repository.SanteRepository;

@Component
public class DbInit {
	
	@Autowired
	SanteRepository santeRepository;
	
	@Autowired
	JoueurRepository joueurRepository;
	
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
		joueur.setName("PRESI");
		joueur.setSante(sante);
		joueurRepository.save(joueur);
		
	}

}
