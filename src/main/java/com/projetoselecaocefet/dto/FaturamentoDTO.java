package com.projetoselecaocefet.dto;

import com.projetoselecaocefet.entity.Faturamento;
import com.projetoselecaocefet.entity.Funcionario;
import lombok.Builder;
import lombok.Data;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Data
@Builder
public class FaturamentoDTO {

    private Long id;

    private Funcionario funcionario;

    private BigDecimal faturamentoMensal;

    private LocalDate dataFaturamento;

    public static FaturamentoDTO of(Faturamento faturamento){
        return FaturamentoDTO.builder()
                .id(faturamento.getId())
                .funcionario(faturamento.getFuncionario())
                .faturamentoMensal(faturamento.getFaturamentoMensal())
                .dataFaturamento(faturamento.getDataFaturamento())
                .build();
    }

    public static Faturamento of(FaturamentoDTO faturamentoDTO){
        return Faturamento.builder()
                .id(faturamentoDTO.getId())
                .funcionario(faturamentoDTO.getFuncionario())
                .faturamentoMensal(faturamentoDTO.getFaturamentoMensal())
                .dataFaturamento(faturamentoDTO.getDataFaturamento())
                .build();
    }

    public static Optional<FaturamentoDTO> of(Optional<Faturamento> faturamento){
        return faturamento.stream().map(FaturamentoDTO::of).findAny();
    }

    public static List<FaturamentoDTO> of(List<Faturamento> faturamento){
        return faturamento.stream().map(FaturamentoDTO::of).collect(Collectors.toList());
    }

}
