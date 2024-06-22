package org.bmtreecoffe.Banco.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class ClienteDto {

    private String nombre;
    private String direccion;
    private String telefono;
}
