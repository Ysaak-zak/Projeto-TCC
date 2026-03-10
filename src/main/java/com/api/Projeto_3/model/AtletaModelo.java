package com.api.Projeto_3.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "ATLETAS")
public class AtletaModelo extends PerfisModelo {


public AtletaModelo() {
        super();
    }

    public AtletaModelo(Long id, String fotoImg, String name, String dataNascimento, String cpf, String rg, String email,
            String senha, String telefoneFixo, String telefoneZap, String pesoMigrama, String alturaCetimentro,
            AfiliacaoModelo pais, MoradiaModel moradia_fk) {
        
        super(id, fotoImg, name, dataNascimento, cpf, rg, email, senha, telefoneFixo, telefoneZap, 
              pesoMigrama, alturaCetimentro, pais, moradia_fk);
    }


    
}
