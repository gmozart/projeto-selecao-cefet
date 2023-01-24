package com.projetoselecaocefet.service;


import com.projetoselecaocefet.entity.Funcao;
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



    }

    @Test
    void consultaId() {
    }

    @Test
    void update() {
    }
}