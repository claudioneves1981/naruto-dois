package com.example.narutodois.service.impl;

import com.example.narutodois.model.Ninja;
import com.example.narutodois.model.Time;
import com.example.narutodois.repository.TimeRepository;
import com.example.narutodois.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TimeServiceImpl implements TimeService {

    @Autowired
    private TimeRepository timeRepository;


    @Override
    public void criarTime(Time time) {
        timeRepository.save(time);
    }

    @Override
    public void adicionarMembros(Long id, Ninja ninja) throws Exception {

        Time time = timeRepository.findById(id).orElseThrow(()-> new Exception("time não encontrado"));
        List<Ninja> ninjas = time.getNinjas();
        ninjas.add(ninja);
        time.setNinjas(ninjas);
        timeRepository.save(time);

    }

    @Override
    public Time exibirTime(Long id) throws Exception {
        return timeRepository.findById(id).orElseThrow(()-> new Exception("time não encontrado"));
    }
}
