package com.example.demo.Controllers;

import java.util.Map;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeControler{
    
    @GetMapping("/")
    @ResponseBody
    public Map<String, Object> index() {
        return Map.of("status", true , "message", "ok");
    }

}