package com.api.Projeto_3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.Projeto_3.model.TreinadorModel;

@Repository
public interface TreinadorRespository  extends JpaRepository<TreinadorModel,Long> {

    
}
