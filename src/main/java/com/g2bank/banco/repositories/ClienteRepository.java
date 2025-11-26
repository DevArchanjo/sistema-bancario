package com.g2bank.banco.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.g2bank.banco.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
