package com.frost.deuxzero.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.frost.deuxzero.dto.JoueurDTO;
import com.frost.deuxzero.dto.MatchDTO;
import com.frost.deuxzero.model.Joueur;
import com.frost.deuxzero.model.Matchx;
import com.frost.deuxzero.model.MatchEquipe;
import com.frost.deuxzero.model.Sante;
import com.frost.deuxzero.service.MatchService;
import com.frost.deuxzero.service.SanteService;
import com.frost.deuxzero.utils.MatchComparator;

@Controller
@RequestMapping("/santes")
public class SanteController {

	@Autowired
	private SanteService santeService;
	
	@Autowired
	private MatchService matchService;
	
	@GetMapping("/{id}")
    public String getSante ( Model model, @PathVariable Long id ) {
		
		Sante sante = santeService.getSanteById(id);
		
		//List<Matchx> matchs = sante.getMatchs();
		List<Matchx> matchs = matchService.getAllMatchsBySanteOrderByDateAsc(sante);
		List<MatchDTO> matchsDTO = new ArrayList<>();
		for (int i=0; i<matchs.size(); i++) {
			Matchx match = matchs.get(i);
			MatchDTO matchDTO = new MatchDTO( match );
			
			matchsDTO.add( matchDTO );
		}

		List<Joueur> joueurs = sante.getJoueurs();
		List<JoueurDTO> joueursDTO = new ArrayList<>();
		for (int i=0; i<joueurs.size(); i++) {
			Joueur joueur = joueurs.get(i);
			JoueurDTO joueurDTO = new JoueurDTO( joueur );
			
			int victoires = 0;
			int nuls = 0;
			int defaites = 0;
			int CapitanatsJ = 0;
			int victoiresCapitanat = 0;
			int nulsCapitanat = 0;
			int defaitesCapitanat = 0;
			int points = 0;
			int butsME = 0;
			int butsEE = 0;
			int cleanSheets = 0;
			String formeR = "";
			List<String> forme = new ArrayList<>();
			
			List<MatchEquipe> matchsJoueur = joueur.getMatchs();
			Collections.sort(matchsJoueur, new MatchComparator() );
			System.out.println(joueur.getName());
			for ( int j=0; j<matchsJoueur.size(); j++) {
				MatchEquipe matchEquipe = matchsJoueur.get(j);
				System.out.print(matchEquipe.getId());
				butsME += matchEquipe.getMarques();
				butsEE += matchEquipe.getEncaisses();
				
				if ( matchEquipe.getEncaisses() == 0 ) {
					cleanSheets++;
				}
				
				if ( matchEquipe.getResultat().equals("V") ) {
					victoires++;
					points+=3;
					forme.add("V");
					System.out.println(" V");
				} else if ( matchEquipe.getResultat().equals("N") ) {
					nuls++;
					points+=1;
					forme.add("N");
					System.out.println(" N");
				} else if ( matchEquipe.getResultat().equals("D") ) {
					defaites++;
					forme.add("D");
					System.out.println(" D");
				}		
			}
			
			int size = forme.size()-1;
			int start = size-4;
			if (start < 0 ) {
				start = 0;
			}
			for ( int j=0; j<=size; j++ ) {
				
				if ( j>size || j > 4  ) {
					System.out.println(" Breaking");
					break;
				}
				
				if ( j==0 ) {
					formeR += forme.get( start+j );
					//formeR += forme.get( size-j );
				} else {
					formeR += "-"+ forme.get( start+j );
					//formeR += "-"+ forme.get( size-j );
				}
			}
			
			for ( int j=0; j<joueur.getCapitanats().size(); j++) {
				MatchEquipe matchEquipe = joueur.getCapitanats().get(j);
				if ( matchEquipe.getResultat().equals("V") ) {
					victoiresCapitanat++;
				} else if ( matchEquipe.getResultat().equals("N") ) {
					nulsCapitanat++;
				} else if ( matchEquipe.getResultat().equals("D") ) {
					defaitesCapitanat++;
				}		
			}
			
			//joueurDTO.setMatchsJ( joueurDTO.getMatchs().size() );
			joueurDTO.setPoints(points);
			joueurDTO.setVictoires(victoires);
			joueurDTO.setNuls(nuls);
			joueurDTO.setDefaites(defaites);
			joueurDTO.setCapitanatsJ(CapitanatsJ);
			joueurDTO.setVictoiresCapitanat(victoiresCapitanat);
			joueurDTO.setNulsCapitanat(nulsCapitanat);
			joueurDTO.setDefaitesCapitanat(defaitesCapitanat);
			//joueurDTO.setButsM( joueurDTO.getButs().size() );
			//joueurDTO.setPassesD( joueurDTO.getPasses().size() );
			joueurDTO.setButsME( butsME );
			joueurDTO.setButsEE( butsEE );
			joueurDTO.setCleanSheets( cleanSheets );
			joueurDTO.calculateValeurM();
			joueurDTO.setFormeR(formeR);
			
			joueursDTO.add( joueurDTO );
		}
		
		model.addAttribute("joueurs", joueursDTO);
		model.addAttribute("matchs", matchsDTO);
    	return "sante";
    }
	
	
}


