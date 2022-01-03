package org.atilla.atillaadhesion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	@GetMapping("connexion")
	public String showLogin() {
		
		return "connexion";
	}
	
}
