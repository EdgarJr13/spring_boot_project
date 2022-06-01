package io.github.edgarjr13.repository;

import io.github.edgarjr13.model.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public class ClientesRepository {

    public void persistir(Cliente cliente) {
        //acessa o banco de dados e salva o cliente.
    }
}
