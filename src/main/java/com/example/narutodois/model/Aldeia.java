package com.example.narutodois.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@SequenceGenerator(name = "seq_aldeia" , sequenceName = "seq_aldeia", allocationSize = 1)
public class Aldeia {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_aldeia")
    @Column(name = "ID_ALDEIA")
    private Long id;

    private String nome;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinTable(
            name="TB_PESSOAS_ALDEIA",
            joinColumns = @JoinColumn(name = "ID_ALDEIA", referencedColumnName = "ID_ALDEIA"),
            inverseJoinColumns = @JoinColumn(name = "ID_PESSOA",referencedColumnName = "ID_PESSOA")
    )
    private List<Pessoa> pessoas;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinTable(
            name="TB_NINJAS_ALDEIA",
            joinColumns = @JoinColumn(name = "ID_ALDEIA", referencedColumnName = "ID_ALDEIA"),
            inverseJoinColumns = @JoinColumn(name = "ID_PESSOA",referencedColumnName = "ID_PESSOA")
    )
    private List<Ninja> ninjas;
}
