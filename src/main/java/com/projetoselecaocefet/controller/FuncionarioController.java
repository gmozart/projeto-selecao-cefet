package com.projetoselecaocefet.controller;

import com.projetoselecaocefet.dto.FuncionarioDTO;
import com.projetoselecaocefet.service.FuncionarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/funcionarios")
public class FuncionarioController {

    private final FuncionarioService funcionarioService;

    @PostMapping
    public ResponseEntity<FuncionarioDTO> salvar(@RequestBody FuncionarioDTO funcionarioDTO){
        funcionarioService.salvar(funcionarioDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<FuncionarioDTO> consultaId(@PathVariable Long id){
        return ResponseEntity.ok(funcionarioService.consultaId(id).orElseThrow());
    }

    @PutMapping("/{id}")
    public ResponseEntity<FuncionarioDTO> atualizar(@PathVariable Long id, @RequestBody FuncionarioDTO funcionarioDTO){
        return ResponseEntity.ok(funcionarioService.atualizar(id, funcionarioDTO).orElseThrow());
    }

    @GetMapping("/listar")
    public ResponseEntity<List<FuncionarioDTO>> listarTodos(){
        return ResponseEntity.ok(funcionarioService.listarTodos().orElseThrow());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        funcionarioService.delete(id);
        return ResponseEntity.noContent().build();
    }






}
