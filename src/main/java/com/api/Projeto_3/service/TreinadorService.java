package com.api.Projeto_3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.Projeto_3.dtos.interfaceCustomer.CustomerNome;
import com.api.Projeto_3.dtos.interfaceCustomer.TreinadorCustomer;
import com.api.Projeto_3.dtos.model.PerfilsDtos;
import com.api.Projeto_3.repository.PerfilRepository;
import com.api.Projeto_3.repository.RoleRepository;
import com.api.Projeto_3.repository.TreinadorRespository;

import jakarta.transaction.Transactional;


@Service
public class TreinadorService {

    @Autowired
    PerfilRepository perfilJpa;
    
    @Autowired
    TreinadorRespository jpaTreinador;

    @Autowired
    RoleRepository roles;

    public TreinadorCustomer buscarTreinadorPorId(String cpf) {
        return  jpaTreinador.listTreinador(cpf);
    }

   
    public CustomerNome buscarNomes(String cpf){
        return jpaTreinador.buscarNomes(cpf);
    }

}
