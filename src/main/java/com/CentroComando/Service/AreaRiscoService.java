package com.CentroComando.Service;

import com.CentroComando.Entity.AreaRisco;
import com.CentroComando.Repository.AreaRiscoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaRiscoService {

    private final AreaRiscoRepository repository;

    public AreaRiscoService(AreaRiscoRepository repository) {
        this.repository = repository;
    }

    public List<AreaRisco> listar() {
        return repository.findAll();
    }

    public AreaRisco salvar(AreaRisco areaRisco) {
        return repository.save(areaRisco);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}