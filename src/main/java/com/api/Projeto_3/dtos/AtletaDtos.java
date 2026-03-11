package com.api.Projeto_3.dtos;

import org.springframework.web.multipart.MultipartFile;

import com.api.Projeto_3.dtos.enumDtos.EnumTipoSangue;
import com.api.Projeto_3.model.AtletaModelo;
import com.api.Projeto_3.model.enums.EnumUf;
import com.api.Projeto_3.model.enums.EnumGenero;
import com.api.Projeto_3.model.enums.EnumSague;

public class AtletaDtos {
   private Long id;  

    private String name;
    private String dataNascimento;
    private String cpf;
    private String rg;
    private String email;
    private String senha;
    private String telefoneFixo;
    private String telefoneZap;
    private String pesoMigrama;
    private String alturaCetimentro;  
    private AfiliacaoDtos pais_fk;  
    private MoradiaDto moradia_fk;
    private EnumUf ufDtos;
    private EnumGenero genero;
    private EnumSague sangue;

    public AtletaDtos() {
    }


    public AtletaDtos(AtletaModelo atl) {
        this.id = atl.getId();
        this.name = atl.getName();
        this.dataNascimento = atl.getDataNascimento();
        this.cpf = atl.getCpf();
        this.rg = atl.getRg();
        this.email = atl.getEmail();
        this.senha = atl.getSenha();
        this.telefoneFixo = atl.getTelefoneFixo();
        this.telefoneZap = atl.getTelefoneZap();
        this.pesoMigrama =  atl.getPesoMigrama();
        this.alturaCetimentro = atl.getAlturaCetimentro();
        this.pais_fk = new AfiliacaoDtos(atl.getPais_fk()); 
        this.moradia_fk = new MoradiaDto(atl.getMoradia_fk());
        this.ufDtos = atl.getUf();
        this.genero = atl.getSexo();
        this.sangue = atl.getSangue();

    

    
    }



    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
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



    public String getPesoMigrama() {
        return pesoMigrama;
    }



    public void setPesoMigrama(String pesoMigrama) {
        this.pesoMigrama = pesoMigrama;
    }



    public String getAlturaCetimentro() {
        return alturaCetimentro;
    }



    public void setAlturaCetimentro(String alturaCetimentro) {
        this.alturaCetimentro = alturaCetimentro;
    }



    public AfiliacaoDtos getPais_fk() {
        return pais_fk;
    }



    public void setPais_fk(AfiliacaoDtos pais_fk) {
        this.pais_fk = pais_fk;
    }



    public MoradiaDto getMoradia_fk() {
        return moradia_fk;
    }



    public void setMoradia_fk(MoradiaDto moradia_fk) {
        this.moradia_fk = moradia_fk;
    }


    public EnumUf getUfDtos() {
        return ufDtos;
    }


    public void setUfDtos(EnumUf ufDtos) {
        this.ufDtos = ufDtos;
    }


    public EnumGenero getGenero() {
        return genero;
    }


    public void setGenero(EnumGenero genero) {
        this.genero = genero;
    }


    public EnumSague getSangue() {
        return sangue;
    }


    public void setSangue(EnumSague sangue) {
        this.sangue = sangue;
    }


    
    

}
