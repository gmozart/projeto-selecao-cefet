package com.projetoselecaocefet.dto;

import com.projetoselecaocefet.entity.Funcionario;
import com.projetoselecaocefet.entity.RegistroVendas;
import lombok.Builder;
import lombok.Data;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Data
@Builder
public class RegistroVendasDTO {

    private Long id;

    private LocalDateTime mesVenda;

    private Double valorVendas;

    public static RegistroVendasDTO of(RegistroVendas registroVendas){
        return RegistroVendasDTO.builder()
                .id(registroVendas.getId())
                .mesVenda(registroVendas.getMesVenda())
                .valorVendas(registroVendas.getValorVendas())
                .build();
    }

    public static RegistroVendas of(RegistroVendasDTO registroVendasDTO){
        return RegistroVendas.builder()
                .id(registroVendasDTO.getId())
                .mesVenda(registroVendasDTO.getMesVenda())
                .valorVendas(registroVendasDTO.getValorVendas())
                .build();
    }

    public static Optional<RegistroVendasDTO> of(Optional<RegistroVendas> registroVendas){
        return registroVendas.stream().map(RegistroVendasDTO::of).findAny();
    }

    public static List<RegistroVendasDTO> of(List<RegistroVendas> registroVendas){
        return registroVendas.stream().map(RegistroVendasDTO::of).collect(Collectors.toList());
    }

}
