package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.ui.Model;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String HomePage(/*Model model*/) {
        //boolean isAdmin = true;
        //model.addAttribute("isAdmin",isAdmin);
        return("homePage");
    }
}
