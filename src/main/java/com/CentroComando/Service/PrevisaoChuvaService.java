package com.CentroComando.Service;

import com.CentroComando.Entity.PrevisaoChuva;
import com.CentroComando.Repository.PrevisaoChuvaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrevisaoChuvaService {

    private final PrevisaoChuvaRepository repository;

    public PrevisaoChuvaService(PrevisaoChuvaRepository repository) {
        this.repository = repository;
    }

    public List<PrevisaoChuva> listar() {
        return repository.findAll();
    }

    public PrevisaoChuva salvar(PrevisaoChuva previsao) {
        return repository.save(previsao);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}