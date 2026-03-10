package com.api.Projeto_3.model;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class PerfisModelo implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id; 

   @Column(name = "foto_url")
    private String fotoImg;

    @Column(name = "per_nome" , nullable = false  , length =50)
    private String name;

  
    @Column(name = "data_nascimento")
    private String dataNascimento;

    private String cpf;

    private String rg;
    
    private String email;

    private String senha;


    private String telefoneFixo;

    private String telefoneZap;

    private String pesoMigrama;

    private String  alturaCetimentro;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fal_fk" , unique = true )
    private AfiliacaoModelo pais_fk;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mord")
    private MoradiaModel moradia_fk;


    public PerfisModelo() {
    }



    public PerfisModelo(Long id, String fotoImg, String name, 
        String dataNascimento, String cpf, String rg, String email,
            String senha, String telefoneFixo, String telefoneZap, String pesoMigrama, String  alturaCetimentro,
            AfiliacaoModelo pais_fk, MoradiaModel moradia_fk) {
        this.id = id;
        this.fotoImg = fotoImg;
        this.name = name;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.rg = rg;
        this.email = email;
        this.senha = senha;
        this.telefoneFixo = telefoneFixo;
        this.telefoneZap = telefoneZap;
        this.pesoMigrama = pesoMigrama;
        this.alturaCetimentro = alturaCetimentro;
        this.pais_fk = pais_fk;
        this.moradia_fk = moradia_fk;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFotoImg() {
        return fotoImg;
    }

    public void setFotoImg(String fotoImg) {
        this.fotoImg = fotoImg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    public String getTelefoneZap() {
        return telefoneZap;
    }

    public void setTelefoneZap(String telefoneZap) {
        this.telefoneZap = telefoneZap;
    }

    public String  getPesoMigrama() {
        return pesoMigrama;
    }

    public void setPesoMigrama(String  pesoMigrama) {
        this.pesoMigrama = pesoMigrama;
    }

    public String  getAlturaCetimentro() {
        return alturaCetimentro;
    }

    public void setAlturaCetimentro(String  alturaCetimentro) {
        this.alturaCetimentro = alturaCetimentro;
    }

    public AfiliacaoModelo getPais_fk() {
        return pais_fk;
    }

    public void setPais(AfiliacaoModelo pais_fk) {
        this.pais_fk = pais_fk;
    }

    public MoradiaModel getMoradia_fk() {
        return moradia_fk;
    }

    public void setMoradia_fk(MoradiaModel moradia_fk) {
        this.moradia_fk = moradia_fk;
    } 


    


    

}    


