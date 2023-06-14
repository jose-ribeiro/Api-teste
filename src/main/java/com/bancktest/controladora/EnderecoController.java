package com.bancktest.controladora;

import com.bancktest.entidades.Endereco;
import com.bancktest.entidades.entidadeBanco.Conta;
import com.bancktest.recursos.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/endereco")
public class EnderecoController {
    @Autowired
    EnderecoService enderecoService;

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id) {
        Endereco obj = enderecoService.find(id);
        return ResponseEntity.ok().body(obj);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Endereco> listar(){
        return enderecoService.listar();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Endereco adicionar (@Validated @RequestBody Endereco endereco){
        return enderecoService.salvar(endereco);
    }
}
