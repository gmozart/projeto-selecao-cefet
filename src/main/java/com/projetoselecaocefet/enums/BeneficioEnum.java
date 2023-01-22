package com.projetoselecaocefet.enums;

public enum BeneficioEnum {


    BENEFICIO(1,"20%"),
    BENEFICIO_VENDA(2,"30% sobre o valor vendido"),
    SEMBENEFICIO(3,"Não tem benefícios");

    private int cod;

    private String descricao;


    BeneficioEnum(int cod, String descricao){
        this.cod = cod;
        this.descricao = descricao;
    }

    public Integer getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public static BeneficioEnum toEnum(Integer cod) {

        if (cod == null) {

            return null;
        }
        for (BeneficioEnum x : BeneficioEnum.values()) {
            if (cod.equals(x.getCod())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Id inválido" + cod);
    }

}



