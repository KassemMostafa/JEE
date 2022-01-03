package org.atilla.atillaadhesion.controller;

import org.atilla.atillaadhesion.entity.Adherant;
import org.atilla.atillaadhesion.service.AdherantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/form")
@Controller
public class FormController {
	
	private AdherantService adherantService;
	
	@Autowired
	public FormController(AdherantService adherantService) {
		this.adherantService = adherantService;
	}
	
	@GetMapping("")
	public String showForm(Model model) {
		Adherant adherant = new Adherant();
		model.addAttribute("adherant",adherant);
		return "form";
	}
	
	@PostMapping("/save")
	public String saveAdherant(@ModelAttribute("adherant") Adherant adherant) {
		adherantService.saveAdherant(adherant);
		return "redirect:/";
		
	}

}