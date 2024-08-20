package com.example.narutodois.service.impl;

import com.example.narutodois.dto.TecnicaDTO;
import com.example.narutodois.service.TecnicaService;
import org.springframework.stereotype.Service;

@Service
public class SasukeServiceImpl implements TecnicaService {

    @Override
    public TecnicaDTO tecnica() {

        TecnicaDTO tecnicaDTO = new TecnicaDTO();
        tecnicaDTO.setTecnica("Shidori");
        return tecnicaDTO;

    }

    public TecnicaDTO tecnica(String nome){

        TecnicaDTO tecnicaDTO = new TecnicaDTO();
        tecnicaDTO.setTecnica(nome);
        return tecnicaDTO;

    }
}
