package org.atilla.atillaadhesion.controller;

import org.atilla.atillaadhesion.dao.AdherantDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/admin")
public class AdminController {
	
	private AdherantDAO adherantDAO;
	
	@Autowired
	public AdminController(AdherantDAO adherantDAO) {
		this.adherantDAO = adherantDAO;
	}
	
	@GetMapping("/dashboard")
    public String dashboard(Model model){
        model.addAttribute("adherants",adherantDAO.getAdherants());
        return("admin/dashboard");
    }

	@GetMapping("/mailinglist")
    public String mailinglist(Model model){
		String MLstring = adherantDAO.getMailingListCotisants();
        model.addAttribute("mailinglist",MLstring);
        return("admin/mailinglist");
    }

}
