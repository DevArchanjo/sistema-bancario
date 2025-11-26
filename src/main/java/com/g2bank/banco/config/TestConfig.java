package com.g2bank.banco.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.g2bank.banco.entities.Cliente;
import com.g2bank.banco.repositories.ClienteRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Cliente c1 = new Cliente(null, "Miguel", "19993467756", "miguel@gmail.com", "Rua tabajara do sul, 1301");
		Cliente c2 = new Cliente(null, "Maria", "19994346577", "maria@gmail.com", "Rua sao paulo, 84");
		
		clienteRepository.saveAll(Arrays.asList(c1, c2));
	}
}
