package com.api.Projeto_3.dtos.enumDtos;

public enum EnumGenero {
    M("M", "Masculino"),
    F("F", "Feminino"),
    O("O", "Outro");
    

private final String sigla;
private final String name;


 EnumGenero(String sigla, String name) {
    this.sigla = sigla;
    this.name = name;
}


public String getSigla() {
    return sigla;
}


public String getName() {
    return name;
}

   
}
