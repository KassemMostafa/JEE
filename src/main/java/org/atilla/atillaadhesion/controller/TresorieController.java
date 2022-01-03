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

@RequestMapping("/tresorie")
@Controller
public class TresorieController {
	
	private AdherantService adherantService;
	
	@Autowired
	public TresorieController(AdherantService adherantService) {
		this.adherantService = adherantService;
	}
	
	@GetMapping("/validate")
    public String adherants(Model model){
        model.addAttribute("adherants",adherantService.getCotisantsNonValides());
        return("tresorie/validate");
    }

}
