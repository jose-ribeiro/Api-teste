package com.bancktest.repositorios;

import com.bancktest.entidades.entidadeBanco.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepositorio extends JpaRepository<Conta, Integer> {
}
