package com.projetoselecaocefet.service;

import com.projetoselecaocefet.dto.FuncaoDTO;
import com.projetoselecaocefet.entity.Funcao;
import com.projetoselecaocefet.entity.Salario;
import com.projetoselecaocefet.enums.BeneficioEnum;
import com.projetoselecaocefet.repository.FuncaoRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class FuncaoServiceTest {

    @InjectMocks
    private FuncaoService funcaoService;

    @Mock
    private FuncaoRepository funcaoRepository;

    @Test
    void whenSaveFuncaoTest() {

          when(funcaoRepository.save(any())).thenReturn(Funcao.builder().salario
           (Salario.builder().salario(10l).valorPorAnoServico(10l).build()).beneficio
           (BeneficioEnum.toEnum(1)).build());


    }

    @Test
    void consultaId() {
    }

    @Test
    void update() {
    }
}