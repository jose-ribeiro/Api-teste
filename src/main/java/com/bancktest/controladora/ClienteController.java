package com.bancktest.controladora;

import com.bancktest.entidades.Cliente;
import com.bancktest.recursos.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {

    @Autowired
    ClienteService service;

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id) {
        Cliente obj = service.find(id);
        return ResponseEntity.ok().body(obj);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Cliente> listar(){
        return service.listar();
    }



}
