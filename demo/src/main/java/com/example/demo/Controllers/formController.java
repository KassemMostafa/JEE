package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class formController {

    @GetMapping(value="/form")
    public String form() {
        return "form" ;
    }
    
    
}
