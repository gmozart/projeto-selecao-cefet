package com.projetoselecaocefet.service;

import com.projetoselecaocefet.dto.FuncaoDTO;
import com.projetoselecaocefet.dto.FuncionarioDTO;
import com.projetoselecaocefet.repository.FuncionarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;


    public void salvar(FuncionarioDTO funcionarioDTO){
        funcionarioRepository.save(FuncionarioDTO.of(funcionarioDTO));
    }

    public Optional<FuncionarioDTO> buscarPorId(Long id){
        return FuncionarioDTO.of(funcionarioRepository.findById(id));
   }

   public Optional<List<FuncionarioDTO>> listarTodos(){
        return Optional.of(FuncionarioDTO.of(funcionarioRepository.findAll()));
   }

   public Optional<FuncionarioDTO> atualizar(Long id, FuncionarioDTO funcionarioDTO){
        funcionarioDTO.setId(id);
        return Optional.of(FuncionarioDTO.of(funcionarioRepository.save(FuncionarioDTO.of(funcionarioDTO))));
   }

   public void delete(Long id){
        funcionarioRepository.deleteById(id);
   }


}
