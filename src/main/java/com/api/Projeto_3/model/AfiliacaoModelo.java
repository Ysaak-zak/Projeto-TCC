package com.api.Projeto_3.model;

import java.io.Serializable;

import jakarta.persistence.Column;
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
@Table(name = "AFLIACAO" )
public class AfiliacaoModelo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name = "maeNome" ,  length = 50)
    private  String maeNome;

    @Column(name = "maeTelefone" )
    private  String maeTelefone;

    @Column(name = "maeEmail" )
    private  String maeEmail;

    @Column(name = "paiName" )
    private  String paiName;


    @Column(name = "paiTelefone" )
    private  String paiTelefone;


    @Column(name = "paiEmail" )
    private  String paiEmail;

    @OneToOne(mappedBy = "pais_fk")
    private PerfisModelo perfis;

    
    public AfiliacaoModelo() {
    }

    
}
