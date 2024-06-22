package org.bmtreecoffe.Banco.controllers;

import org.bmtreecoffe.Banco.models.Cliente;
import org.bmtreecoffe.Banco.models.dto.ClienteDto;
import org.bmtreecoffe.Banco.models.mapper.ClienteMapper;
import org.bmtreecoffe.Banco.services.impl.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/cliente")
public class ClienteController {

    @Autowired
    private ClienteServiceImpl clienteService;
    @PostMapping("/crear")
    public Cliente crearCliente(@RequestBody ClienteDto clienteDto){
        return clienteService.crearCliente(ClienteMapper.clienteDTOACliente(clienteDto));
    }
}
