package org.atilla.atillaadhesion.controller;

import java.util.List;

import org.atilla.atillaadhesion.entity.Adherant;
import org.atilla.atillaadhesion.service.AdherantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
		List<Adherant> adherants = adherantService.getAdherants();
        model.addAttribute("adherants",adherants);
		String MLstring = adherantService.getMailingList();
        model.addAttribute("mailinglist",MLstring);
        return("admin/adherants");
    }


	/*@DeleteMapping*/
	@RequestMapping(value = "deleteA/{id}", method = RequestMethod.GET)
	public String supprimer(@PathVariable int id){
		adherantService.deleteAdherant(id);
		return("reroot/rerootDA");
		/*return"Redirect(admin/adherants)";*/
	}


	@GetMapping("/cotisants")
    public String cotisants(Model model){
		model.addAttribute("cotisants",adherantService.getCotisants());
		String MLstring = adherantService.getMailingListCotisants();
        model.addAttribute("mailinglist",MLstring);
        return("admin/cotisants");
    }

}
