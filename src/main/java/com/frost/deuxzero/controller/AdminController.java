package com.frost.deuxzero.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@GetMapping()
    public String showAccessCodeForm() {
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

}
