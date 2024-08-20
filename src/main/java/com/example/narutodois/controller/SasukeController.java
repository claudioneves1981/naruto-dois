package com.example.narutodois.controller;

import com.example.narutodois.dto.TecnicaDTO;
import com.example.narutodois.service.impl.NarutoServiceImpl;
import com.example.narutodois.service.impl.SasukeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SasukeController {

    @Autowired
    private SasukeServiceImpl sasukeService;

    @GetMapping(value = "sasuke/tecnica")
    public ResponseEntity<TecnicaDTO> tecnica(){
        return new ResponseEntity<>(sasukeService.tecnica(), HttpStatus.OK);
    }

    @GetMapping(value = "sasuke/tecnica/{tecnica}")
    public ResponseEntity<TecnicaDTO> tecnica(@PathVariable("tecnica") String tecnica){
        return new ResponseEntity<>(sasukeService.tecnica(tecnica), HttpStatus.OK);
    }
}
