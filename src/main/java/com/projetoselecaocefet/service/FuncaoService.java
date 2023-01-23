package com.projetoselecaocefet.service;

import com.projetoselecaocefet.dto.FuncaoDTO;
import com.projetoselecaocefet.repository.FuncaoRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FuncaoService {

    private final FuncaoRepository funcaoRepository;


    public void save(FuncaoDTO funcaoDTO){
        funcaoRepository.save(FuncaoDTO.of(funcaoDTO));
    }


    public Optional<FuncaoDTO> consultaId(Long id){
        return FuncaoDTO.of(funcaoRepository.findById(id));
    }

    public Optional<FuncaoDTO> update(Long id, FuncaoDTO funcaoDTO){
        funcaoDTO.setId(id);
        return Optional.of(FuncaoDTO.of(funcaoRepository.save(FuncaoDTO.of(funcaoDTO))));
    }

    public void delete(Long id){
        funcaoRepository.deleteById(id);
    }


}
