package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//todo: renvoyer access denied quand une personne non administrateur essaie de se log sur une page don l'URL commence par /admin...
@Controller
public class AdminController {
    
    @GetMapping(value="/admin/dashboard")
    public String dashboard(){
        return "admin/dashboard";
    }
}
