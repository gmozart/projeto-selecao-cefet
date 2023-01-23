package com.projetoselecaocefet.controller;

import com.projetoselecaocefet.dto.FuncaoDTO;
import com.projetoselecaocefet.service.FuncaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequiredArgsConstructor
@RequestMapping("/funcao")
public class FuncaoController {

    private final FuncaoService funcaoService;


    @PostMapping
    public ResponseEntity<FuncaoDTO> save(@RequestBody FuncaoDTO funcaoDTO){
        funcaoService.salvar(funcaoDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<FuncaoDTO> findById(@PathVariable Long id){
      return ResponseEntity.ok(funcaoService.consultaId(id).orElseThrow());
    }

    @PutMapping("/{id}")
    public ResponseEntity<FuncaoDTO> update(@RequestBody FuncaoDTO funcaoDTO,@PathVariable Long id){
        return ResponseEntity.ok(funcaoService.atualizar(id,funcaoDTO).orElseThrow());
    }

}
