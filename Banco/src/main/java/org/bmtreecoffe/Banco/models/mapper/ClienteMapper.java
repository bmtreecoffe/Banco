package org.bmtreecoffe.Banco.models.mapper;

import org.bmtreecoffe.Banco.models.Cliente;
import org.bmtreecoffe.Banco.models.dto.ClienteDto;


public class ClienteMapper {

    public static Cliente clienteDTOACliente(ClienteDto clienteDto){
        return Cliente.builder()
                .nombre(clienteDto.getNombre())
                .direccion(clienteDto.getDireccion())
                .telefono(clienteDto.getTelefono())
                .build();
    }

}
