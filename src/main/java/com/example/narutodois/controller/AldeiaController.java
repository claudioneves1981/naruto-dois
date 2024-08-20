package com.example.narutodois.controller;

import com.example.narutodois.model.Aldeia;
import com.example.narutodois.model.Ninja;
import com.example.narutodois.model.Pessoa;
import com.example.narutodois.service.impl.AldeiaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AldeiaController {

    @Autowired
    private AldeiaServiceImpl aldeiaService;

    @PostMapping(value = "aldeia/criar")
    public void criarAldeia(@RequestBody Aldeia aldeia){
        aldeiaService.criarAldeia(aldeia);
    }

    @PostMapping(value = "aldeia/{id}/adicionarpessoa")
    public void adicionarPessoas(@PathVariable("id") Long id, @RequestBody Pessoa pessoa) throws Exception {
        aldeiaService.adicionarPessoas(id,pessoa);
    }

    @PostMapping(value = "aldeia/{id}/adicionarninja")
    public void adicionarNinjas(@PathVariable("id") Long id, @RequestBody Ninja ninja) throws Exception {
        aldeiaService.adicionarNinjas(id,ninja);
    }

    @GetMapping("aldeia/{id}")
    public ResponseEntity<Aldeia> exibirAldeia(@PathVariable("id") Long id) throws Exception {
       return new ResponseEntity<>(aldeiaService.exibirAldeia(id), HttpStatus.OK);
    }
}
