package com.projetoselecaocefet.service;

import com.projetoselecaocefet.dto.FuncaoDTO;
import com.projetoselecaocefet.repository.FuncaoRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FuncaoService {

    private final FuncaoRepository funcaoRepository;


    public void salvar(FuncaoDTO funcaoDTO){
        funcaoRepository.save(FuncaoDTO.of(funcaoDTO));
    }


    public Optional<FuncaoDTO> consultaId(Long id){
        return FuncaoDTO.of(funcaoRepository.findById(id));
    }

    public Optional<FuncaoDTO> atualizar(Long id, FuncaoDTO funcaoDTO){
        funcaoDTO.setId(id);
        return Optional.of(FuncaoDTO.of(funcaoRepository.save(FuncaoDTO.of(funcaoDTO))));
    }

    public Optional<List<FuncaoDTO>> listarTodos(){
        return  Optional.of(FuncaoDTO.of(funcaoRepository.findAll()));
    }

    public void delete(Long id){
        funcaoRepository.deleteById(id);
    }


}
