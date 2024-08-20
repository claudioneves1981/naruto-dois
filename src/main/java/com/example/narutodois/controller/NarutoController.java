package com.example.narutodois.controller;

import com.example.narutodois.dto.TecnicaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.narutodois.service.impl.NarutoServiceImpl;

@RestController
public class NarutoController {

    @Autowired
    private NarutoServiceImpl narutoService;

    @GetMapping(value = "naruto/tecnica")
    public ResponseEntity<TecnicaDTO> tecnica(){
        return new ResponseEntity<>(narutoService.tecnica(), HttpStatus.OK);
    }

    @GetMapping(value = "naruto/tecnica/{tecnica}")
    public ResponseEntity<TecnicaDTO> tecnica(@PathVariable("tecnica") String tecnica){
        return new ResponseEntity<>(narutoService.tecnica(tecnica),HttpStatus.OK);
    }

}
