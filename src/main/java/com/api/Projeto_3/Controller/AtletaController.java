package com.api.Projeto_3.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/atleta")
public class AtletaController {


    @GetMapping(value = "/cadastro")
    public String getCadastroAtleta() {
        return "cadastro";
    }
    
}
