package com.api.Projeto_3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.Projeto_3.dtos.PerfilsDtos;
import com.api.Projeto_3.repository.PerfilRepository;
import com.api.Projeto_3.repository.RoleRepository;
import com.api.Projeto_3.repository.TreinadorRespository;


@Service
public class TreinadorService {

    @Autowired
    PerfilRepository perfilJpa;
    
    @Autowired
    TreinadorRespository jpaTreinador;

    @Autowired
    RoleRepository roles;


    public PerfilsDtos buscarTreinadorPorId(String cpf) {
        return jpaTreinador.findByCpf(cpf);
    }
}
