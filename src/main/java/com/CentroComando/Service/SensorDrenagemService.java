package com.CentroComando.Service;

import com.CentroComando.Entity.SensorDrenagem;
import com.CentroComando.Repository.SensorDrenagemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorDrenagemService {

    private final SensorDrenagemRepository repository;

    public SensorDrenagemService(SensorDrenagemRepository repository) {
        this.repository = repository;
    }

    public List<SensorDrenagem> listar() {
        return repository.findAll();
    }

    public SensorDrenagem salvar(SensorDrenagem sensor) {
        return repository.save(sensor);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}