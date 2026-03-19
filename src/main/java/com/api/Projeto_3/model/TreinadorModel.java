package com.api.Projeto_3.model;
import java.time.LocalDate;

import com.api.Projeto_3.model.enums.EnumGenero;
import com.api.Projeto_3.model.enums.EnumSague;
import com.api.Projeto_3.model.enums.EnumUf;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "TREINADORES")
public class TreinadorModel  extends PerfisModelo{

    public TreinadorModel() {
        super();
    }
public TreinadorModel(Long id, String fotoImg, String name, LocalDate dataNascimento, String cpf, String rg,
                 String email, String senha, String telefoneFixo, String telefoneZap, String pesoMigrama,
                 String alturaCetimentro, EnumUf uf, EnumGenero sexo, EnumSague sangue, 
                 AfiliacaoModelo pais, MoradiaModel moradia, RolesModel role) { 

    super(id, fotoImg, name, dataNascimento, cpf, rg, email, senha, 
          telefoneFixo, telefoneZap, pesoMigrama, alturaCetimentro, uf, sexo, sangue, pais, moradia, role);
}
    
    
}
