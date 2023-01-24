package com.projetoselecaocefet.dto;

import com.projetoselecaocefet.entity.Funcao;
import com.projetoselecaocefet.entity.Funcionario;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Data
@Builder
public class FuncionarioDTO {

    private long id;

    private Funcao funcao;

    private String nome;

    private LocalDate dataContratacao;


    public static FuncionarioDTO of(Funcionario funcionario){
        return FuncionarioDTO.builder()
                .id(funcionario.getId())
                .funcao(funcionario.getFuncao())
                .nome(funcionario.getNome())
                .dataContratacao(funcionario.getDataContratacao())
                .build();
    }

    public static Funcionario of(FuncionarioDTO funcionarioDTO){
        return Funcionario.builder()
                .id(funcionarioDTO.getId())
                .funcao(funcionarioDTO.getFuncao())
                .nome(funcionarioDTO.getNome())
                .dataContratacao(funcionarioDTO.getDataContratacao())
                .build();
    }

    public static Optional<FuncionarioDTO> of(Optional<Funcionario> funcionario){
        return funcionario.stream().map(FuncionarioDTO::of).findAny();
    }

    public static List<FuncionarioDTO> of(List<Funcionario> funcionario){
        return funcionario.stream().map(FuncionarioDTO::of).collect(Collectors.toList());
    }


}
