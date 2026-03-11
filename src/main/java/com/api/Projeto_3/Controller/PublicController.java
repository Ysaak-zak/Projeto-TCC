package com.api.Projeto_3.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.api.Projeto_3.dtos.AtletaDtos;
import com.api.Projeto_3.dtos.enumDtos.EnumGenero;
import com.api.Projeto_3.model.enums.EnumSague;
import com.api.Projeto_3.model.enums.EnumUf;
import com.api.Projeto_3.service.AtletaService;




@Controller
public class PublicController {


   
    @Autowired
    AtletaService service;


    @GetMapping(value = "/cadastro/atleta")
    public String getCadastroAtleta(AtletaDtos dtos , Model model) {
        model.addAttribute("listaUfs", EnumUf.values());
        model.addAttribute("listSague", EnumSague.values());
        model.addAttribute("listEnumGenero", EnumGenero.values());
        
        return "publicPlages/cadastro";
    }

    @GetMapping("/home")
    public String getHome() {
         return "publicPlages/home";
    }
    

    @GetMapping("/login")
    public String getMethodName() {
        return "publicPlages/Login.html";
    }
    


    

@PostMapping("/atleta/save")
    public String postAtletaInsert( AtletaDtos atletaDtos) {
        service.InsertAtleta(atletaDtos);
        return "redirect:/cadastro/atleta";
    }
    
}
