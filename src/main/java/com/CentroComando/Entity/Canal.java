package com.CentroComando.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Canal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String local;
    private Double nivelAgua;
    private Double capacidade;
    private Double entradaAgua;
    private Double saidaAgua;
    private String status;

    public Canal() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Double getNivelAgua() {
        return nivelAgua;
    }

    public void setNivelAgua(Double nivelAgua) {
        this.nivelAgua = nivelAgua;
    }

    public Double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Double capacidade) {
        this.capacidade = capacidade;
    }

    public Double getEntradaAgua() {
        return entradaAgua;
    }

    public void setEntradaAgua(Double entradaAgua) {
        this.entradaAgua = entradaAgua;
    }

    public Double getSaidaAgua() {
        return saidaAgua;
    }

    public void setSaidaAgua(Double saidaAgua) {
        this.saidaAgua = saidaAgua;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}