package com.example.narutodois.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SequenceGenerator(name = "seq_pessoa" , sequenceName = "seq_pessoa", allocationSize = 1)
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pessoa")
    @Column(name = "ID_PESSOA")
    private Long id_pessoa;

    private String nome;
    private double peso;
    private double altura;
    private String funcao;

    @ManyToOne
    @JoinColumn(name = "ID_ALDEIA")
    private Aldeia aldeia;

}
