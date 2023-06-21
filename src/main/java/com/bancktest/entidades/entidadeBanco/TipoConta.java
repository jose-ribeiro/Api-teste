package com.bancktest.entidades.entidadeBanco;

public enum TipoConta {
    CONTACORRENTE(1, "Conta Corrente"),
    CONTAPOUPANCA(2, "Conta poupança");

    private Integer cod;
    private String descricao;

    TipoConta(Integer cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public Integer getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public static TipoConta toEnum(Integer cod) {

        if (cod == null) {
            return null;
        }

        for (TipoConta x : TipoConta.values()) {
            if (cod.equals(x.getCod())) {
                return x;
            }
        }

        throw new IllegalArgumentException("Id inválido: " + cod);
    }
}
