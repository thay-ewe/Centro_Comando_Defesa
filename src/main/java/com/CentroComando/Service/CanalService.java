package com.CentroComando.Service;

import com.CentroComando.Entity.Canal;
import com.CentroComando.Repository.CanalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CanalService {

    private final CanalRepository repository;

    public CanalService(CanalRepository repository) {
        this.repository = repository;
    }

    public List<Canal> listar() {
        return repository.findAll();
    }

    public Canal salvar(Canal canal) {
        return repository.save(canal);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}