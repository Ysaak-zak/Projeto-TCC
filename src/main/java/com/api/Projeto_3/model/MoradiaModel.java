package com.api.Projeto_3.model;

import java.io.Serializable;

import com.api.Projeto_3.model.enums.EnumEstados;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MORADIAS")
public class MoradiaModel implements Serializable{
    
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false , length = 50)
    private String cep;
   
    @Column(nullable = false , length = 250)
    private String avenida;
   
    @Column(nullable = false , length = 5)
    private int sn;
   
    @Column(nullable = false , length = 10)
    private String bairro;
   
    @Column(nullable = false , length = 50)
    private String nomeCidade;


    @Enumerated(EnumType.STRING)
    private EnumEstados estados;


    


}