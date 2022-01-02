package org.atilla.atillaadhesion.rest;

import java.util.List;

import org.atilla.atillaadhesion.entity.Adherant;
import org.atilla.atillaadhesion.service.AdherantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AdherantRestController {
	
	private AdherantService	 adherantService;
	
	@Autowired
	public AdherantRestController(AdherantService adherantService) {
		this.adherantService = adherantService;
	}
	
	@GetMapping("/adherants")
	public List	<Adherant> getAdherants() {
		return adherantService.getAdherants();
	}
	
	
	
	
	
	

}
