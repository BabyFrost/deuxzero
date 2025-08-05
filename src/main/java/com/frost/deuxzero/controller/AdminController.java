package com.frost.deuxzero.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.frost.deuxzero.dto.JoueurDTO;
import com.frost.deuxzero.model.Joueur;
import com.frost.deuxzero.service.JoueurService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private JoueurService joueurService;
	
	@GetMapping()
    public String showAccessCodeForm() {
		//return "admin/dashboard";
		return "admin/access-code";
    }
	
	@PostMapping("/validate-code")
    public String validateAccessCode(@RequestParam String code, Model model ) {
		if ("MONNDOLE2025".equalsIgnoreCase(code)) {
	        return "redirect:/dashboard";
	    } else {
	        model.addAttribute("error", "Code invalide. Réessayez.");
	        return "admin/access-code";
	    }
    }
	
	@GetMapping("/joueurs")
    public String GetJoueursAdminPage(Model model) {
		
		List<Joueur> joueurs = joueurService.getAllJoueurs();
		
		List<JoueurDTO> joueursDTO = new ArrayList<>();
		for (Joueur joueur : joueurs) {
			
			if (joueur.getName().equals("PNJ") ) continue;
			
			JoueurDTO joueurDTO = new JoueurDTO( joueur );
			joueursDTO.add( joueurDTO );
			
		}
		
	    model.addAttribute("joueurs", joueurs);
		//return "admin/joueurs-admin";
		return "admin/matchs-admin";
    }
	
	@GetMapping("/matchs")
    public String GetMatchsAdminPage() {
		return "admin/matchs-admin";
    }
	
	@GetMapping("/equipe")
    public String GetEquipeAdminPage() {
		return "admin/equipe-admin";
    }

}
