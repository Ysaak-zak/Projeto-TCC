package com.api.Projeto_3.model;

import com.api.Projeto_3.model.enums.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "ATLETAS")
public class AtletaModelo extends PerfisModelo {


    public AtletaModelo(){
        super();
    }

   public AtletaModelo(Long id, String fotoImg, String name, String dataNascimento, String cpf, String rg,
                    String email, String senha, String telefoneFixo, String telefoneZap, String pesoMigrama,
                    String alturaCetimentro, EnumUf uf, EnumGenero sexo, EnumSague sangue, 
                    AfiliacaoModelo pais, MoradiaModel moradia) { 
    
    // Certifique-se de que a classe pai (super) espera esses tipos exatos:
    super(id, fotoImg, name, dataNascimento, cpf, rg, email, senha, 
          telefoneFixo, telefoneZap, pesoMigrama, alturaCetimentro, uf, sexo, sangue, pais, moradia);
}
}
