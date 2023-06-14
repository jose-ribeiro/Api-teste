package com.bancktest.recursos;


import com.bancktest.entidades.entidadeBanco.Conta;
import com.bancktest.repositorios.ContaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContaService {
    @Autowired
    ContaRepositorio contaRepositorio;

    public Conta find(Integer id) {
        Optional<Conta> obj = contaRepositorio.findById(id);
        return obj.orElse(null);
    }


    public List<Conta> listar(){
        return contaRepositorio.findAll();
    }

    public Conta salvar(Conta contaCorrente){
        return  contaRepositorio.save(contaCorrente);
    }


}
