package com.projetoselecaocefet.controller;


import com.projetoselecaocefet.dto.FaturamentoDTO;
import com.projetoselecaocefet.service.FaturamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/faturamentos")
public class FaturamentoController {

    private final FaturamentoService faturamentoService;

    @PostMapping
    public ResponseEntity<FaturamentoDTO> salvar(FaturamentoDTO faturamentoDTO){
        faturamentoService.salvar(faturamentoDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/id")
    public ResponseEntity<FaturamentoDTO> consultaId(@PathVariable Long id){
        return ResponseEntity.ok(faturamentoService.consultaId(id).orElseThrow());
    }

    @GetMapping("/listar")
    public ResponseEntity<List<FaturamentoDTO>> buscarTodos(){
        return ResponseEntity.ok(faturamentoService.listarTodos().orElseThrow());
    }

    @PutMapping("/{id}")
    public ResponseEntity<FaturamentoDTO> atualizar(@PathVariable Long id, @RequestBody FaturamentoDTO faturamentoDTO){
        return ResponseEntity.ok(faturamentoService.atualizar(id, faturamentoDTO).orElseThrow());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        faturamentoService.delete(id);
        return ResponseEntity.noContent().build();
    }



}
