package com.api.Projeto_3.model.enums;

public enum EnumGenero {

    M("M", "Masculino"),
    F("F", "Feminino"),
    O("O", "Outro");
    

private final String sigla;
private final String nome;


EnumGenero(String sigla, String nome) {
    this.sigla = sigla;
    this.nome = nome;
}


public String getSigla() {
    return sigla;
}


public String getNome() {
    return nome;
}


}
