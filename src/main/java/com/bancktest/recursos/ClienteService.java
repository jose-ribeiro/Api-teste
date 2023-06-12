package com.bancktest.recursos;

import com.bancktest.entidades.Cliente;
import com.bancktest.repositorios.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepositorio clienteRepositorio;


    public Cliente find(Integer id) {
        Optional<Cliente> obj = clienteRepositorio.findById(id);
        return obj.orElse(null);
    }


    public List<Cliente> listar(){
        return clienteRepositorio.findAll();
    }
}
