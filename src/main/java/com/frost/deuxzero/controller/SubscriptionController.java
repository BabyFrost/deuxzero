package com.frost.deuxzero.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.frost.deuxzero.model.Subscription;
import com.frost.deuxzero.service.SubscriptionService;

@Controller
public class SubscriptionController {
	
	@Autowired
	SubscriptionService subscriptionService;
	
	@PostMapping("/subscribe")
    public String subscribe(@RequestParam("email") String email, RedirectAttributes redirectAttrs) {
        Subscription subscription = new Subscription();
        subscription.setEmail(email);
        subscriptionService.saveSubscription(subscription);
        redirectAttrs.addFlashAttribute("successMessage", "Merci pour ton inscription !");
        return "redirect:/";
    }
	
//	@PostMapping("/subscribe")
//    public String subscribe(@RequestParam("email") String email, RedirectAttributes redirectAttrs) {
//        try (FileWriter fw = new FileWriter("subscriptions.txt", true);
//             PrintWriter pw = new PrintWriter(fw)) {
//            pw.println(email);
//        } catch (IOException e) {
//            e.printStackTrace();
//            redirectAttrs.addFlashAttribute("message", "Erreur lors de l'inscription, réessaye plus tard.");
//            return "redirect:/"; // Or your CTA page URL
//        }
//        redirectAttrs.addFlashAttribute("message", "Merci pour ton inscription !");
//        return "redirect:/"; // Redirect back to homepage or wherever
//    }

}
