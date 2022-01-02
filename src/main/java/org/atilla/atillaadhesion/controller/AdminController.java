package org.atilla.atillaadhesion.controller;

import org.atilla.atillaadhesion.entity.Adherant;
import org.atilla.atillaadhesion.service.AdherantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {
	
	private AdherantService adherantService;
	
	@Autowired
	public AdminController(AdherantService adherantService) {
		this.adherantService = adherantService;
	}
	
	@GetMapping("/admin/dashboard")
    public String dashboard(Model model){
        model.addAttribute("adherants",adherantService.getAdherants());
        return("admin/dashboard");
    }

	@GetMapping("/admin/mailinglist")
    public String mailinglist(Model model){
		String MLstring = adherantService.getMailingListCotisants();
        model.addAttribute("mailinglist",MLstring);
        return("admin/mailinglist");
    }
	
	@GetMapping("/form")
	public String showForm(Model model) {
		Adherant adherant = new Adherant();
		model.addAttribute("adherant",adherant);
		return "form";
	}
	
	@PostMapping("/form/save")
	public String saveAdherant(@ModelAttribute("adherant") Adherant adherant) {
		adherantService.saveAdherant(adherant);
		return "redirect:/";
		
	}

}
