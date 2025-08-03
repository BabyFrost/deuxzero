package com.frost.deuxzero.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.frost.deuxzero.model.Sante;
import com.frost.deuxzero.model.Joueur;
import com.frost.deuxzero.model.Matchx;
import com.frost.deuxzero.service.JoueurService;
import com.frost.deuxzero.service.MatchService;
import com.frost.deuxzero.service.SanteService;

@Controller
public class homeController {
	
	@Autowired
	private SanteService santeService;
	
	@Autowired
	private JoueurService joueurService;
	
	@Autowired
	private MatchService matchService;

	@GetMapping("/")
    public String GetHomePage ( Model model ) {
		
		List<Sante> santes = santeService.getAllSantes();
		List<Joueur> joueurs = joueurService.getAllJoueurs();
		List<Matchx> matchs = matchService.getAllMatchs();
		
		model.addAttribute("nombreDeSantes", santes.size());
		model.addAttribute("nombreDeJoueurs", joueurs.size());
		model.addAttribute("nombreDeMatchs", matchs.size());
    	return "home";
    }
	
	@GetMapping("/about")
    public String GetAboutUs () {
    	return "about";
    }
	
	@GetMapping("/faq")
    public String GetFAQ () {
    	return "faq";
    }
	
	@GetMapping("/{path}")
    public String other (@PathVariable String path) {
		String handle = path.substring(1); // Remove the '#' character
		//String handle = path;
		System.out.println("Handle : "+handle);
		Joueur joueur = joueurService.getJoueurByHandle(handle);
		
		if (joueur != null) return "redirect:/joueurs/"+joueur.getId();
		return "redirect:/";
    }
	
}
