package com.projetoselecaocefet.controller;

import com.projetoselecaocefet.dto.FuncaoDTO;
import com.projetoselecaocefet.service.FuncaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/funcao")
public class FuncaoController {

    private final FuncaoService funcaoService;


    @PostMapping
    public ResponseEntity<FuncaoDTO> salvar(@RequestBody FuncaoDTO funcaoDTO){
        funcaoService.salvar(funcaoDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<FuncaoDTO> atualizar(@RequestBody FuncaoDTO funcaoDTO,@PathVariable Long id){
        return ResponseEntity.ok(funcaoService.atualizar(id,funcaoDTO).orElseThrow());
    }

    @DeleteMapping("/id")
    public ResponseEntity<Void> deletar(Long id){
        funcaoService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<FuncaoDTO> consultaId(@PathVariable Long id){
      return ResponseEntity.ok(funcaoService.consultaId(id).orElseThrow());
    }



    @GetMapping("/listar")
    public ResponseEntity<List<FuncaoDTO>> listarTodos(){
        return  ResponseEntity.ok(funcaoService.listarTodos().orElseThrow());
    }


}
