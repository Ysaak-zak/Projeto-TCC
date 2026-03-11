package com.api.Projeto_3.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.api.Projeto_3.dtos.AtletaDtos;
import com.api.Projeto_3.service.AtletaService;



@Controller
public class PublicController {


   
    @Autowired
    AtletaService service;


    @GetMapping(value = "/cadastro/atleta")
    public String getCadastroAtleta(AtletaDtos dtos) {
        return "publicPlages/cadastro";
    }

    @GetMapping("/home")
    public String getHome() {
         return "publicPlages/home";
    }
    


    

@PostMapping("/atleta/save")
    public String postAtletaInsert( AtletaDtos atletaDtos) {
        service.InsertAtleta(atletaDtos);
        return "redirect:/cadastro/atleta";
    }
    
}
