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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@ToString
@Table(name = "SEMANA")
@Entity
public class SemanaModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;

 
    @ManyToOne
    @JoinColumn(name = "semana_fk")
    private TreinamentoModel semana_fk;

    @OneToMany(mappedBy = "exercicio_fk" , cascade=CascadeType.ALL)
    private List<ExercicioModel> exercicio_fk = new ArrayList<>();

}
