package com.example.narutodois.service;

import com.example.narutodois.model.Ninja;
import com.example.narutodois.model.Time;

public interface TimeService {

    void criarTime(Time time);
    void adicionarMembros(Long id, Ninja ninja) throws Exception;
    Time exibirTime(Long id) throws Exception;
}
