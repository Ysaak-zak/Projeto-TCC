package com.api.Projeto_3.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
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
@Table(name = "TREINAMENTO")
@Entity
public class TreinamentoModel implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @OneToMany(mappedBy = "semana_fk" ,cascade = CascadeType.ALL)
    private List<SemanaModel> semanas = new ArrayList<>();

    @OneToMany(mappedBy = "treimanento_fk" , cascade = CascadeType.ALL)
    private List<TreinadorModel> listTreinador = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "atleta_fk")
    private AtletaModelo atleta_fk;

}
