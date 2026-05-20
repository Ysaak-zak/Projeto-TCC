package com.api.Projeto_3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.Projeto_3.dtos.interfaceCustomer.CustomerNome;
import com.api.Projeto_3.dtos.interfaceCustomer.ListDasAtleta;
import com.api.Projeto_3.dtos.interfaceCustomer.TreinadorCustomer;
import com.api.Projeto_3.dtos.model.PerfilsDtos;
import com.api.Projeto_3.repository.AtletaRespository;
import com.api.Projeto_3.repository.PerfilRepository;
import com.api.Projeto_3.repository.RoleRepository;
import com.api.Projeto_3.repository.TreinadorRespository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;


@Service
public class TreinadorService {

      private static final Logger logger = LoggerFactory.getLogger(PerfilService.class);

    @Autowired
    PerfilRepository perfilJpa;
    
    @Autowired
    TreinadorRespository jpaTreinador;

    @Autowired
    AtletaRespository jpaAtleta;

    @Autowired
    RoleRepository roles;

    @Transactional(readOnly = true)
    public TreinadorCustomer buscarTreinadorPorId(String cpf) {
        logger.info("buscando dados do Treinador atreves do " + cpf );
        return  jpaTreinador.listTreinador(cpf);
    }

    @Transactional(readOnly = true)
    public CustomerNome buscarNomes(String cpf){
          logger.info("buscando tudos os atletas ");
        return jpaTreinador.buscarNomes(cpf);
    }

     @Transactional(readOnly = true)
    public List<ListDasAtleta> listTab() {
        logger.info("Listando todos os atletas");
        List<ListDasAtleta> list = jpaAtleta.atletListCus();
        if (list == null || list.isEmpty()) {
            logger.warn("Nenhum atleta encontrado");
        } else {
            logger.info("Total de atletas: {}", list.size());
        }
        return list;
    }

}
