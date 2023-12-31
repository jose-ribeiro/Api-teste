package com.bancktest.controladora;

import com.bancktest.entidades.Cliente;
import com.bancktest.entidades.entidadeBanco.Conta;
import com.bancktest.recursos.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/conta")
public class ContaController {

    @Autowired
    ContaService contaService;

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id) {
        Conta obj = contaService.find(id);
        return ResponseEntity.ok().body(obj);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Conta> listar(){
        return contaService.listar();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Conta adicionar (@Validated @RequestBody Conta conta){
        return contaService.salvar(conta);
    }

}
