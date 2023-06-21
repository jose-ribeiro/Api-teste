package com.bancktest.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_Cliente")
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String cpf;
    private String datanascimeto;


    private Set<String> telefones = new HashSet<>();

    @OneToMany(mappedBy = "cliente")
    private List<Endereco> enderecos = new ArrayList<>();




    public Cliente(Integer id, String nome, String cpf, String datanascimeto) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.datanascimeto = datanascimeto;
    }
}
