package com.api.Projeto_3.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.api.Projeto_3.dtos.PerfilsDtos;
import com.api.Projeto_3.dtos.RoleDtos;
import com.api.Projeto_3.dtos.enumDtos.EnumDtos;
import com.api.Projeto_3.dtos.enumDtos.EnumGenero;
import com.api.Projeto_3.model.enums.EnumSague;
import com.api.Projeto_3.model.enums.EnumUf;
import com.api.Projeto_3.service.PerfilService;

import jakarta.validation.Valid;


@Controller
public class MedicoController {

      @Autowired
    PerfilService service;

       @GetMapping("/cadastro/medico/{id}")
        public String getCadastroMedico(@PathVariable("id") Long id, PerfilsDtos medicosDtos, Model model) {
        model.addAttribute("listaUfs", EnumDtos.values());
        model.addAttribute("listSague", EnumSague.values());
        model.addAttribute("listEnumGenero", EnumGenero.values());
        
        var role = service.infoRoles(id);

        model.addAttribute("roleId", role);
        model.addAttribute("medicosDtos", medicosDtos);
        return "publicPlages/cadastroMedico";
    }


    @PostMapping("cadastro/medico/save/{id}")
public String postMedicoInsert(@PathVariable("id")  Long id ,@ModelAttribute("medicosDtos") @Valid PerfilsDtos medicosDtos , BindingResult result,  Model model) {

     if (result.hasErrors()) { 
        model.addAttribute("listSague", EnumSague.values());
        model.addAttribute("listEnumGenero", EnumGenero.values());
        model.addAttribute("listaUfs", EnumUf.values());
        model.addAttribute("id", id); 

        model.addAttribute("roleId", service.buscarNomeRoles(id));   
        return "publicPlages/cadastroMedico"; 
    }
    if(medicosDtos.getRoles() == null){
        medicosDtos.setRoles(new RoleDtos());
    }
      medicosDtos.getRoles().setId(id);
      service.insertMeidco(medicosDtos);

    return "redirect:/home";
}
}
