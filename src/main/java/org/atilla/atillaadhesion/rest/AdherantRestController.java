package org.atilla.atillaadhesion.rest;

import java.util.List;

import org.atilla.atillaadhesion.dao.AdherantDAO;
import org.atilla.atillaadhesion.entity.Adherant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AdherantRestController {
	
	private AdherantDAO adherantDAO;
	
	@Autowired
	public AdherantRestController(AdherantDAO adherantDAO) {
		this.adherantDAO = adherantDAO;
	}
	
	@GetMapping("/adherants")
	public List	<Adherant> getAdherants() {
		return adherantDAO.getAdherants();
	}
	
	
	
	
	

}
