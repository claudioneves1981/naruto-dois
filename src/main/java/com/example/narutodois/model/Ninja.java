package com.example.narutodois.model;


import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Ninja extends Pessoa {

    private String nomeCla;
    private String nomeVila;
    private int nivel;

    @ManyToOne
    @JoinColumn(name = "ID_TIME")
    private Time time;

    @ManyToOne
    @JoinColumn(name = "ID_ALDEIA")
    private Aldeia aldeia;

}
