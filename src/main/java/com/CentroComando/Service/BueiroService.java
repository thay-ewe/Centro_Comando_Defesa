package com.CentroComando.Service;

import com.CentroComando.Entity.Bueiro;
import com.CentroComando.Repository.BueiroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BueiroService {

    private final BueiroRepository repository;

    public BueiroService(BueiroRepository repository) {
        this.repository = repository;
    }

    public List<Bueiro> listar() {
        return repository.findAll();
    }

    public Bueiro salvar(Bueiro bueiro) {
        return repository.save(bueiro);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}