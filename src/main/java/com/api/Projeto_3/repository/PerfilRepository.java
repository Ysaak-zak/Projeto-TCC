package com.api.Projeto_3.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.Projeto_3.model.PerfisModelo;


public interface PerfilRepository extends JpaRepository <PerfisModelo , Long> {
       Optional<PerfisModelo> findByCpf(String cpf);

}
