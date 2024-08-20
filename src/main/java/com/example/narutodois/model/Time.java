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
@SequenceGenerator(name = "seq_time" , sequenceName = "seq_time", allocationSize = 1)
public class Time {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_time")
    @Column(name = "ID_TIME")
    private Long id;

    private String nomeDoTime;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinTable(
            name="TB_NINJA_TIME",
            joinColumns = @JoinColumn(name = "ID_TIME", referencedColumnName = "ID_TIME"),
            inverseJoinColumns = @JoinColumn(name = "ID_PESSOA",referencedColumnName = "ID_PESSOA")
    )
    private List<Ninja> ninjas;



}
