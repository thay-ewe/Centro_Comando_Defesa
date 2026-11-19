package com.CentroComando.Service;

import com.CentroComando.Entity.Alerta;
import com.CentroComando.Repository.AlertaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertaService {

    private final AlertaRepository repository;

    public AlertaService(AlertaRepository repository) {
        this.repository = repository;
    }

    public List<Alerta> listar() {
        return repository.findAll();
    }

    public Alerta salvar(Alerta alerta) {
        return repository.save(alerta);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}