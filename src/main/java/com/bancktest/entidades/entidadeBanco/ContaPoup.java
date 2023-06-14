package com.bancktest.entidades.entidadeBanco;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_ContaPoup")
public class ContaPoup extends Conta{



    public ContaPoup(Integer id, Integer ag, Integer conta, double saldo) {
        super(id, ag, conta, saldo);
    }
    public ContaPoup() {
        super();
    }
}
