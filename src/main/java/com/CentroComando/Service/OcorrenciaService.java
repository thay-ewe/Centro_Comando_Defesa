package com.CentroComando.Service;

import com.CentroComando.Entity.Ocorrencia;
import com.CentroComando.Repository.OcorrenciaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OcorrenciaService {

    private final OcorrenciaRepository repository;

    public OcorrenciaService(OcorrenciaRepository repository) {
        this.repository = repository;
    }

    public List<Ocorrencia> listar() {
        return repository.findAll();
    }

    public Ocorrencia salvar(Ocorrencia ocorrencia) {
        return repository.save(ocorrencia);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}