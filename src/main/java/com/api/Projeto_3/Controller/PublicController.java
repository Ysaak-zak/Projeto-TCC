package com.api.Projeto_3.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.api.Projeto_3.dtos.PerfilsDtos;
import com.api.Projeto_3.dtos.RoleDtos;
import com.api.Projeto_3.dtos.enumDtos.EnumDtos;
import com.api.Projeto_3.dtos.enumDtos.EnumGenero;
import com.api.Projeto_3.model.enums.EnumSague;
import com.api.Projeto_3.service.PerfilService;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class PublicController {
   
    @Autowired
    PerfilService service;


    @GetMapping("/cadastro/atleta/{id}")
    public String getCadastroAtleta(@PathVariable("id") Long id, PerfilsDtos atletaDtos, Model model) {
        // Adicionando os enums para os selects não quebrarem
        model.addAttribute("listaUfs", EnumDtos.values());
        model.addAttribute("listSague", EnumSague.values());
        model.addAttribute("listEnumGenero", EnumGenero.values());
        var role = service.infoRoles(id);
        model.addAttribute("roleId", role);
        model.addAttribute("atletaDtos", atletaDtos);
        return "publicPlages/cadastroAtleta";
    }

    @GetMapping("/cadastro/medico/{id}")
    public String getCadastroMedico(@PathVariable("id") Long id, PerfilsDtos medicosDtos, Model model) {
        // Adicionando os enums para os selects não quebrarem
        model.addAttribute("listaUfs", EnumDtos.values());
        model.addAttribute("listSague", EnumSague.values());
        model.addAttribute("listEnumGenero", EnumGenero.values());
        
        var role = service.infoRoles(id);

        model.addAttribute("roleId", role);
        model.addAttribute("medicosDtos", medicosDtos);
        return "publicPlages/cadastroMedico.html";
    }



    @GetMapping("/cadastro/treinador/{id}")
    public String getCadastroTreinador(@PathVariable("id") Long id, PerfilsDtos treinadorDtos, Model model) {
        // Adicionando os enums para os selects não quebrarem
        model.addAttribute("listaUfs", EnumDtos.values());
        model.addAttribute("listSague", EnumSague.values());
        model.addAttribute("listEnumGenero", EnumGenero.values());
        var role = service.infoRoles(id);
        model.addAttribute("roleId", role);
        model.addAttribute("treinadorDtos", treinadorDtos);
        return "publicPlages/cadastroTreinador.html";
    }


    @GetMapping("/home")
    public String getHome() {
         return "publicPlages/home";
    }


       @GetMapping("/test")
    public String getTest() {
         return "publicPlages/CadastroTest.html";
    }

    @GetMapping("/login")
    public String getMethodName() {
        return "publicPlages/Login.html";
    }
 //SALVANDO ATLETA 
@PostMapping("/atleta/save/{id}")
public String postAtletaInsert(@PathVariable("id") Long id, PerfilsDtos atletaDtos) {
    if (atletaDtos.getRoles() == null) {
        atletaDtos.setRoles(new RoleDtos());
    }
    atletaDtos.getRoles().setId(id);
    service.InsertAtleta(atletaDtos);
    return "redirect:/home"; 
}
    
//SALVANDO MEDICOS
@PostMapping("/medico/save/{id}")
public String postMedicoInsert(@PathVariable("id")  Long id , PerfilsDtos medicosDtos ) {
    
    if(medicosDtos.getRoles() == null){
        medicosDtos.setRoles(new RoleDtos());
    }
     medicosDtos.getRoles().setId(id);
    service.insertMeidco(medicosDtos);

    return "redirect:/home";
}

//SALVANDSO TREIANDOR
@PostMapping("/treinador/save/{id}")
public String postTreinadorInsert(@PathVariable("id")  Long id , PerfilsDtos treinadorDtos ) {
    
    if(treinadorDtos.getRoles() == null){
        treinadorDtos.setRoles(new RoleDtos());
    }
     treinadorDtos.getRoles().setId(id);
     service.insertTreinador(treinadorDtos);

    return "redirect:/home";
}




}
