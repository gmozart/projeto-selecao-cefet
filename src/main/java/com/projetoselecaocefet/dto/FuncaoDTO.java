package com.projetoselecaocefet.dto;

import com.projetoselecaocefet.entity.Funcao;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Data
@Builder
public class FuncaoDTO {

    private Long id;

    private String cargo;

    private BigDecimal salario;

    private BigDecimal adicionalAnual;

    private int beneficio;

    public static FuncaoDTO of(Funcao funcao){
        return FuncaoDTO.builder()
                .id(funcao.getId())
                .cargo(funcao.getCargo())
                .salario(funcao.getSalario())
                .adicionalAnual(funcao.getAdicionalAnual())
                .beneficio(funcao.getBeneficio())
                .build();
    }

    public static  Funcao of(FuncaoDTO funcaoDTO){
        return Funcao.builder()
                .id(funcaoDTO.getId())
                .cargo(funcaoDTO.getCargo())
                .salario(funcaoDTO.getSalario())
                .adicionalAnual(funcaoDTO.getAdicionalAnual())
                .beneficio(funcaoDTO.getBeneficio())
                .build();
    }

    public static Optional<FuncaoDTO> of(Optional<Funcao> funcao){
        return funcao.stream().map(FuncaoDTO::of).findAny();
    }

    public static List<FuncaoDTO> of(List<Funcao> funcao){
        return funcao.stream().map(FuncaoDTO::of).collect(Collectors.toList());
    }

}
