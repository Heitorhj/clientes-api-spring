package com.heitor.clientes_api_spring.cliente;

// Recod => Cria uma classe só para guardar dados, sem precisar criar uma classe com construtor, getters e setters
public record ViaCepResponse(
    String cep,
    String logradouro,
    String bairro,
    String localidade,
    String uf,
    Boolean erro) {

}

