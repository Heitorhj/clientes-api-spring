package com.heitor.clientes_api_spring.cliente;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// FeignClient => Cria um cliente HTTP para consumir a API do ViaCep

@FeignClient (name = "viacep", url = "${viacep.url}")
public interface ViaCepCliente {

    @GetMapping ("/{cep}/json/")
    ViaCepResponse consultarCep(@PathVariable ("cep") String cep);
}
