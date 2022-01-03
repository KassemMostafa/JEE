package org.atilla.atillaadhesion.controller;

import org.atilla.atillaadhesion.service.AdherantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	
	/*@DeleteMapping*/
	@RequestMapping(value = "validate/{id}", method = RequestMethod.GET)
	public String validate(@PathVariable int id){
		adherantService.deleteAdherant(id);
		return("reroot/rerootV");
		/*return"Redirect(tresorie/valide)";*/
	}

	/*@DeleteMapping*/
	@RequestMapping(value = "unvalidate/{id}", method = RequestMethod.GET)
	public String unvalidate(@PathVariable int id){
		adherantService.deleteAdherant(id);
		return("reroot/rerootV");
		/*return"Redirect(tresorie/valide)";*/
	}
}
