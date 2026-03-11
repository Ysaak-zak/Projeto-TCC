package com.api.Projeto_3.dtos.enumDtos;

public enum EnumTipoSangue {
     A_POS("A+", "A Positivo"),
    A_NEG("A-", "A Negativo"),
    B_POS("B+", "B Positivo"),
    B_NEG("B-", "B Negativo"),
    AB_POS("AB+", "AB Positivo"),
    AB_NEG("AB-", "AB Negativo"),
    O_POS("O+", "O Positivo"),
    O_NEG("O-", "O Negativo");

    private final String rotulo;
    private final String descricao;

    private EnumTipoSangue(String rotulo, String descricao) {
        this.rotulo = rotulo;
        this.descricao = descricao;
    }

    public String getRotulo() {
        return rotulo;
    }

    public String getDescricao() {
        return descricao;
    }   
}
