package com.bancktest.repositorios;

import com.bancktest.entidades.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepositorio extends JpaRepository <Endereco, Integer> {
}
