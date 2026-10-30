package com.heitor.clientes_api_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heitor.clientes_api_spring.model.Endereco;

public interface EnderecoRepository extends JpaRepository <Endereco, String> {

}
