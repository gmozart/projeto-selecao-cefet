package com.projetoselecaocefet.dto;

import com.projetoselecaocefet.entity.Funcao;
import com.projetoselecaocefet.entity.Salario;
import com.projetoselecaocefet.enums.BeneficioEnum;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Data
@Builder
public class FuncaoDTO {

    private Long id;

    private String nomeFuncao;

    private Salario salario;

    private BeneficioEnum beneficio;

    public static FuncaoDTO of(Funcao funcao){
        return FuncaoDTO.builder()
                .id(funcao.getId())
                .nomeFuncao(funcao.getNomeFuncao())
                .salario(funcao.getSalario())
                .beneficio(funcao.getBeneficio())
                .build();
    }

    public static  Funcao of(FuncaoDTO funcaoDTO){
        return Funcao.builder()
                .id(funcaoDTO.getId())
                .nomeFuncao(funcaoDTO.getNomeFuncao())
                .salario(funcaoDTO.getSalario())
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
