package com.frost.deuxzero.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.frost.deuxzero.dto.SanteDTO;
import com.frost.deuxzero.model.Sante;
import com.frost.deuxzero.service.SanteService;

@Controller
public class homeController {
	
	@Autowired
	private SanteService santeService;

	@GetMapping("/")
    public String index ( Model model ) {
		
		List<Sante> santes = santeService.getAllSantes();
		List<SanteDTO> santesDTO = new ArrayList<>();
		for (int i=0; i<santes.size(); i++) {
			santesDTO.add( new SanteDTO( santes.get(i) ) );
		}
		
		model.addAttribute("santes", santesDTO);
    	return "home";
    }
	
}
