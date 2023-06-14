package com.bancktest.recursos;

import com.bancktest.entidades.Endereco;
import com.bancktest.entidades.entidadeBanco.Conta;
import com.bancktest.repositorios.EnderecoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {
    @Autowired
    EnderecoRepositorio enderecoRepositorio;

    public Endereco find(Integer id) {
        Optional<Endereco> obj = enderecoRepositorio.findById(id);
        return obj.orElse(null);
    }


    public List<Endereco> listar(){
        return enderecoRepositorio.findAll();
    }

    public Endereco salvar(Endereco endereco){
        return  enderecoRepositorio.save(endereco);
    }
}
