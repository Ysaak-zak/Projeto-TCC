package com.api.Projeto_3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.Projeto_3.model.AtletaModelo;




@Repository
public interface AtletaRespository extends  JpaRepository<AtletaModelo,Long>  {

    List<AtletaModelo> findByCpf(String cpf);
}
