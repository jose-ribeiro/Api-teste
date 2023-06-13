package com.bancktest;

import com.bancktest.entidades.Cliente;
import com.bancktest.repositorios.ClienteRepositorio;
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
	@Override
	public void run(String... args) throws Exception {
		Cliente cli1 = new Cliente(null,"jose", 25);

		clienteRepositorio.saveAll(Arrays.asList(cli1));
	}
}
