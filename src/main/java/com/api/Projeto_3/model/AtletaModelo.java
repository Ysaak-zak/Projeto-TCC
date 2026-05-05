package com.api.Projeto_3.model;

import java.time.LocalDate;


import com.api.Projeto_3.model.enums.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ATLETAS")
public class AtletaModelo extends PerfisModelo {

     @OneToOne(mappedBy = "atleta_fk" , cascade = CascadeType.ALL)
    private  TreinamentoModel atleta;
    @ManyToOne
    @JoinColumn(name = "atletaTrenador_fk")
    private TreinadorModel treinador_fk; 


    public AtletaModelo(){
        super();
    }

  public AtletaModelo(Long id, String fotoImg, String name, LocalDate dataNascimento, String cpf, String rg,
                 String email, String senha, String telefoneFixo, String telefoneZap, String pesoMigrama,
                 String alturaCetimentro, EnumUf uf, EnumGenero sexo, EnumSague sangue, 
                 AfiliacaoModelo pais, MoradiaModel moradia, RolesModel role) { 

    super(id, fotoImg, name, dataNascimento, cpf, rg, email, senha, 
          telefoneFixo, telefoneZap, pesoMigrama, alturaCetimentro, uf, sexo, sangue, pais, moradia, role);
}


   

}
