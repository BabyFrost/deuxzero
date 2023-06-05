package com.frost.deuxzero.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.frost.deuxzero.dto.JoueurDTO;
import com.frost.deuxzero.model.Joueur;
import com.frost.deuxzero.model.MatchEquipe;
import com.frost.deuxzero.model.Sante;
import com.frost.deuxzero.service.SanteService;

@Controller
@RequestMapping("/santes")
public class SanteController {

	@Autowired
	private SanteService santeService;
	
	@GetMapping("/{id}")
    public String getSante ( Model model, @PathVariable Long id ) {
		
		Sante sante = santeService.getSanteById(id);
		
		List<Joueur> joueurs = sante.getJoueurs();
		List<JoueurDTO> joueursDTO = new ArrayList<>();
		for (int i=0; i<joueurs.size(); i++) {
			Joueur joueur = joueurs.get(i);
			JoueurDTO joueurDTO = new JoueurDTO( joueur );
			
			int victoires = 0;
			int nuls = 0;
			int defaites = 0;
			int points = 0;
			int butsME = 0;
			int butsEE = 0;
			for ( int j=0; j<joueur.getMatchs().size(); j++) {
				MatchEquipe matchEquipe = joueur.getMatchs().get(j);
				butsME += matchEquipe.getMarques();
				butsEE += matchEquipe.getEncaisses();
				if ( matchEquipe.getResultat().equals("V") ) {
					victoires++;
					points+=3;
				} else if ( matchEquipe.getResultat().equals("N") ) {
					nuls++;
					points+=1;
				} else if ( matchEquipe.getResultat().equals("D") ) {
					defaites++;
				}		
			}
			joueurDTO.setMatchsJ( joueurDTO.getMatchs().size() );
			joueurDTO.setPoints(points);
			joueurDTO.setVictoires(victoires);
			joueurDTO.setNuls(nuls);
			joueurDTO.setDefaites(defaites);
			joueurDTO.setButsM( joueurDTO.getButs().size() );
			joueurDTO.setPassesD( joueurDTO.getPasses().size() );
			joueurDTO.setButsME( butsME );
			joueurDTO.setButsEE( butsEE );
			
			joueursDTO.add( joueurDTO );
		}
		
		model.addAttribute("joueurs", joueursDTO);
    	return "sante";
    }
	
}
