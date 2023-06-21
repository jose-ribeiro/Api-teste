package com.bancktest.entidades.entidadeBanco;


import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@NoArgsConstructor
@Entity
@Table(name = "tb_conta")
public class Conta implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer ag;
    private Integer conta;
    private double saldo = 0;
    private Integer tipoConta;

    public Conta(Integer id, Integer ag, Integer conta, double saldo, TipoConta tipoConta) {
        super();
        this.id = id;
        this.ag = ag;
        this.conta = conta;
        this.saldo = saldo;
        this.tipoConta = tipoConta.getCod();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAg() {
        return ag;
    }

    public void setAg(Integer ag) {
        this.ag = ag;
    }

    public Integer getConta() {
        return conta;
    }

    public void setConta(Integer conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public TipoConta getTipoConta() {
        return TipoConta.toEnum(tipoConta);
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta.getCod();
    }
}
