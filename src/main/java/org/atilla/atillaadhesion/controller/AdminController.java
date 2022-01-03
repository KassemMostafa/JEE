package org.atilla.atillaadhesion.controller;

import org.atilla.atillaadhesion.service.AdherantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin")
@Controller
public class AdminController {
	
	private AdherantService adherantService;
	
	@Autowired
	public AdminController(AdherantService adherantService) {
		this.adherantService = adherantService;
	}
	
	@GetMapping("/adherants")
    public String adherants(Model model){
        model.addAttribute("adherants",adherantService.getAdherants());
		String MLstring = adherantService.getMailingList();
        model.addAttribute("mailinglist",MLstring);
        return("admin/adherants");
    }


	@GetMapping("/cotisants")
    public String cotisants(Model model){
		model.addAttribute("cotisants",adherantService.getCotisants());
		String MLstring = adherantService.getMailingListCotisants();
        model.addAttribute("mailinglist",MLstring);
        return("admin/cotisants");
    }
	

}
