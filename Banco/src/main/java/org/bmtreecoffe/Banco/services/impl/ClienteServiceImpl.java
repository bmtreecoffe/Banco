package org.bmtreecoffe.Banco.services.impl;

import org.bmtreecoffe.Banco.models.Cliente;
import org.bmtreecoffe.Banco.models.repository.ClienteRepository;
import org.bmtreecoffe.Banco.services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Override
    public Cliente crearCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}
