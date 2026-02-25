package com.devsuperior.eventorm.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_categoria")
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String descricao;

    @JsonIgnore
    @OneToMany(mappedBy = "categoria")
    private Set<Atividade> atividades = new HashSet<>();

    public Categoria() {
    }

    public Categoria(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Set<Atividade> getAtividades() {
        return atividades;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}