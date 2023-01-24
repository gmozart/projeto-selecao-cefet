package com.projetoselecaocefet.service;

import com.projetoselecaocefet.dto.FaturamentoDTO;
import com.projetoselecaocefet.repository.FaturamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FaturamentoService {

    private final FaturamentoRepository faturamentoRepository;

    public void salvar(FaturamentoDTO faturamentoDTO){
        faturamentoRepository.save(FaturamentoDTO.of(faturamentoDTO));
    }

    public Optional<FaturamentoDTO> consultaId(Long id){
        return FaturamentoDTO.of(faturamentoRepository.findById(id));
    }

    public Optional<List<FaturamentoDTO>> listarTodos(){
        return Optional.of(FaturamentoDTO.of(faturamentoRepository.findAll()));
    }

    public Optional<FaturamentoDTO> atualizar(Long id, FaturamentoDTO faturamentoDTO){
        return Optional.of(FaturamentoDTO.of(faturamentoRepository.save(FaturamentoDTO.of(faturamentoDTO))));
    }

    public void delete(Long id){
        faturamentoRepository.deleteById(id);
    }





}
