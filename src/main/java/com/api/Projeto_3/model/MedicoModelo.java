package com.api.Projeto_3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import com.api.Projeto_3.model.enums.*;

@Entity
@Table(name = "MEDICOS")
public class MedicoModelo extends PerfisModelo {
        
    
    public MedicoModelo(){
        super();
    }

   public MedicoModelo(Long id, String fotoImg, String name, String dataNascimento, String cpf, String rg,
                    String email, String senha, String telefoneFixo, String telefoneZap, String pesoMigrama,
                    String alturaCetimentro, EnumUf uf, EnumGenero sexo, EnumSague sangue, 
                    AfiliacaoModelo pais, MoradiaModel moradia , RolesModel role) { 
                        
    super(id, fotoImg, name, dataNascimento, cpf, rg, email, senha, 
          telefoneFixo, telefoneZap, pesoMigrama, alturaCetimentro, uf, sexo, sangue, pais, moradia , role);
}
}
