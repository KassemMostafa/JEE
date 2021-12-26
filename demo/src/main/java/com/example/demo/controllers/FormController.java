package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.Personne;

import com.example.demo.repositories.*;



@RestController
public class FormController {

    private PersonneRepository listeAdherents;

    public PersonneRepository getListeAdherents() {
        return this.listeAdherents;
    }

    public void setListeAdherents(PersonneRepository listeAdherents) {
        this.listeAdherents = listeAdherents;
    }

    public void personneController(PersonneRepository listeAdherents){
        this.listeAdherents = listeAdherents;
    }

    @GetMapping(value="/form")
   
    
    @PostMapping(value = "/form")
    public void createPersonne(@RequestBody Personne newPersonne){
        listeAdherents.save(newPersonne);
        
    }
}
