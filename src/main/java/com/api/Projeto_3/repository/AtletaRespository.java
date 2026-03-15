package com.api.Projeto_3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.api.Projeto_3.model.AtletaModelo;



@Repository
public interface AtletaRespository extends  JpaRepository<AtletaModelo,Long>  {

}
