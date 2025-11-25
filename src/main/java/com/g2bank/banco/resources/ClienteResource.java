package com.g2bank.banco.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.g2bank.banco.entities.Cliente;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteResource {

	@GetMapping
	public ResponseEntity<Cliente> findAll() {
		Cliente c1 = new Cliente(1L, "Luciana", "19999999999", "luciana@gmail.com", "Rua das laranjeiras, 12");
		return ResponseEntity.ok().body(c1);
	}
}
