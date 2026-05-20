package com.api.Projeto_3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.Projeto_3.repository.AtletaRespository;

import jakarta.transaction.Transactional;

@Service 
public class AtletaService {
    @Autowired
    AtletaRespository jpa;


    @Transactional
    public void insertFkATreinador(Long atletaid , Long treinaid){
        jpa.vincularTreinador(atletaid, treinaid);
    }

    @Transactional 
    public  int quntAtletaVinculadosTreinador(Long idTreinador){
        return jpa.atletaVinculados(idTreinador);
    }

     @Transactional 
    public  int quntAtletaSemVinculadosTreinador(){
        return jpa.atletaSemVinculados();
    }

}
