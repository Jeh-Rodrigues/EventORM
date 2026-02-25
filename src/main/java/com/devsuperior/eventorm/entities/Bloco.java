package com.devsuperior.eventorm.entities;

import java.io.Serializable;
import java.time.Instant;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_bloco")
public class Bloco implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Instant inicio;
    private Instant fim;

    @ManyToOne
    @JoinColumn(name = "atividade_id")
    private Atividade atividade;

    public Bloco() {
    }

    public Bloco(Integer id, Instant inicio, Instant fim, Atividade atividade) {
        this.id = id;
        this.inicio = inicio;
        this.fim = fim;
        this.atividade = atividade;
    }

    public Integer getId() {
        return id;
    }

    public Instant getInicio() {
        return inicio;
    }

    public Instant getFim() {
        return fim;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setInicio(Instant inicio) {
        this.inicio = inicio;
    }

    public void setFim(Instant fim) {
        this.fim = fim;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

    @Override
    public int hashCode() {
        return (id == null) ? 0 : id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Bloco)) return false;
        Bloco other = (Bloco) obj;
        return id != null && id.equals(other.id);
    }
}