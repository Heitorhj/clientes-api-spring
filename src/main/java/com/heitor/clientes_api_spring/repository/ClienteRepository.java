package com.heitor.clientes_api_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heitor.clientes_api_spring.model.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente, Long> {

}
