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
			joueursDTO.add( new JoueurDTO( joueurs.get(i) ) );
		}
		
		model.addAttribute("joueurs", joueursDTO);
    	return "sante";
    }
	
}
