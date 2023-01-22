package com.projetoselecaocefet.entity;

import com.projetoselecaocefet.enums.BeneficioEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "funcoes")
public class Funcao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique=true)
    private String nomeFuncao;

    private Salario salario;

    private Double anoServico;

    private BeneficioEnum beneficio;



}
