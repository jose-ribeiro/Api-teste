package com.bancktest;

import com.bancktest.entidades.Cliente;
import com.bancktest.entidades.Endereco;
import com.bancktest.entidades.entidadeBanco.Conta;
import com.bancktest.entidades.entidadeBanco.TipoConta;
import com.bancktest.repositorios.ClienteRepositorio;
import com.bancktest.repositorios.ContaRepositorio;
import com.bancktest.repositorios.EnderecoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ApiTesteApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApiTesteApplication.class, args);
	}


	@Autowired
	ClienteRepositorio clienteRepositorio;
	@Autowired
	ContaRepositorio corrRepositorio;

	@Autowired
	EnderecoRepositorio enderecoRepositorio;
	@Override
	public void run(String... args) throws Exception {
		Cliente cli1 = new Cliente(null,"jose","01372137270" ,25);

		clienteRepositorio.saveAll(Arrays.asList(cli1));

		Conta conta01 = new Conta(null, 1010,1,0, TipoConta.toEnum(1));
		corrRepositorio.saveAll(Arrays.asList(conta01));

		Endereco end01 = new Endereco(null,"Rua 10", 10, "B", "Centro", "Curitiba","PR");

		enderecoRepositorio.saveAll(Arrays.asList(end01));

	}



}
