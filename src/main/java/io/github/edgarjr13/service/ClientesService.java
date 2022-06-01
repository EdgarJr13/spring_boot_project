package io.github.edgarjr13.service;

import io.github.edgarjr13.model.Cliente;
import io.github.edgarjr13.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    //instanciando o repository
    private ClientesRepository repository;

    //realizando injeção da dependência repository via construtor
    public ClientesService(ClientesRepository repository) {
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente) {
        validarCliente(cliente);
        repository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente) {
        //aplica validações
    }
}
