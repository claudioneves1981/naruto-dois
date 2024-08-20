package com.example.narutodois.controller;

import com.example.narutodois.model.Ninja;
import com.example.narutodois.model.Time;
import com.example.narutodois.service.impl.TimeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TimeController {

    @Autowired
    private TimeServiceImpl timeService;

    @PostMapping(value = "time/criartime")
    public void criarTime(@RequestBody Time time){
        timeService.criarTime(time);
    }

    @PostMapping(value = "time/{id}/adicionarmembros")
    public void adicionarMembros(@PathVariable("id") Long id, @RequestBody Ninja ninja) throws Exception {
        timeService.adicionarMembros(id, ninja);
    }

    @GetMapping(value = "time/{id}")
    public ResponseEntity<Time> exibirTime(@PathVariable("id") Long id) throws Exception {
        return new ResponseEntity<>(timeService.exibirTime(id), HttpStatus.OK);
    }

}
