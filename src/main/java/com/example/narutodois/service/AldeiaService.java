package com.example.narutodois.service;

import com.example.narutodois.model.Aldeia;
import com.example.narutodois.model.Ninja;
import com.example.narutodois.model.Pessoa;

public interface AldeiaService {

    void criarAldeia(Aldeia aldeia);
    void adicionarPessoas(Long id, Pessoa pessoa) throws Exception;
    void adicionarNinjas(Long id, Ninja ninja) throws Exception;
    Aldeia exibirAldeia(Long id) throws Exception;
}
