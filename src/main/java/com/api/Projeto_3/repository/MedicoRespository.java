package com.api.Projeto_3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.Projeto_3.model.MedicoModelo;

@Repository
public interface MedicoRespository extends JpaRepository<MedicoModelo , Long> {
    
}
