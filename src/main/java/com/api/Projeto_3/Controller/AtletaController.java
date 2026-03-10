package com.api.Projeto_3.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.api.Projeto_3.dtos.AtletaDtos;
import com.api.Projeto_3.service.AtletaService;



@Controller
@RequestMapping("/atleta")
public class AtletaController {


   
    @Autowired
    AtletaService service;


    @GetMapping(value = "/cadastro")
    public String getCadastroAtleta(AtletaDtos dtos) {
        return "cadastro";
    }


    

 @PostMapping("/save")
public String postAtletaInsert(AtletaDtos atletaDtos, @RequestParam("file") MultipartFile arquivo) {
    service.InsertAtleta(atletaDtos, arquivo );
    return "redirect:/atleta/cadastro";
}
    
}
