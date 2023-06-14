package com.bancktest.entidades.entidadeBanco;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;



@Entity
@Table(name = "tb_Corrente")
public class ContaCorrente extends Conta{

    public ContaCorrente(Integer id, Integer ag, Integer conta, double saldo) {
        super(id, ag, conta, saldo);
    }

    public ContaCorrente() {
        super();
    }
}
