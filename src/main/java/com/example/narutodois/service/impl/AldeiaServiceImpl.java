package com.example.narutodois.service.impl;

import com.example.narutodois.model.Aldeia;
import com.example.narutodois.model.Ninja;
import com.example.narutodois.model.Pessoa;
import com.example.narutodois.repository.AldeiaRepository;
import com.example.narutodois.service.AldeiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AldeiaServiceImpl implements AldeiaService {


    @Autowired
    private AldeiaRepository aldeiaRepository;

    @Override
    public void criarAldeia(Aldeia aldeia) {
        aldeiaRepository.save(aldeia);
    }

    @Override
    public void adicionarPessoas(Long id, Pessoa pessoa) throws Exception {

        Aldeia aldeia = aldeiaRepository.findById(id).orElseThrow(()-> new Exception("aldeia não encontrado"));
        List<Pessoa> pessoas = aldeia.getPessoas();
        pessoas.add(pessoa);
        aldeia.setPessoas(pessoas);
        aldeiaRepository.save(aldeia);
    }

    @Override
    public void adicionarNinjas(Long id, Ninja ninja) throws Exception {

        Aldeia aldeia = aldeiaRepository.findById(id).orElseThrow(()-> new Exception("aldeia não encontrado"));
        List<Ninja> ninjas = aldeia.getNinjas();
        ninjas.add(ninja);
        aldeia.setNinjas(ninjas);
        aldeiaRepository.save(aldeia);

    }

    @Override
    public Aldeia exibirAldeia(Long id) throws Exception {
        return aldeiaRepository.findById(id).orElseThrow(()-> new Exception("aldeia não encontrado"));
    }




}
