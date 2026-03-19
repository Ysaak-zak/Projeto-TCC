package com.api.Projeto_3.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Entity
@Table(name = "MORADIA")
public class MoradiaModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String cep;

    private String avenida;

    private String sn;

    private String bairro;

    private String cidade;

    @OneToOne(mappedBy = "moradia_fk")
    private PerfisModelo perfil;

   

    

    public MoradiaModel() {
    
    }



}
