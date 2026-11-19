package com.CentroComando.Service;

import com.CentroComando.Entity.Barragem;
import com.CentroComando.Repository.BarragemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarragemService {

    private final BarragemRepository repository;

    public BarragemService(BarragemRepository repository) {
        this.repository = repository;
    }

    public List<Barragem> listar() {
        return repository.findAll();
    }

    public Barragem salvar(Barragem barragem) {
        return repository.save(barragem);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}