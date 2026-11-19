package com.CentroComando.Controller;

import com.CentroComando.Entity.PrevisaoChuva;
import com.CentroComando.Service.PrevisaoChuvaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/previsoes-chuva")
@CrossOrigin(origins = "*")
public class PrevisaoChuvaController {

    private final PrevisaoChuvaService service;

    public PrevisaoChuvaController(PrevisaoChuvaService service) {
        this.service = service;
    }

    @GetMapping
    public List<PrevisaoChuva> listar() {
        return service.listar();
    }

    @PostMapping
    public PrevisaoChuva salvar(
            @RequestBody PrevisaoChuva previsao) {

        return service.salvar(previsao);
    }

    @PutMapping("/{id}")
    public PrevisaoChuva atualizar(
            @PathVariable Long id,
            @RequestBody PrevisaoChuva previsao) {

        previsao.setId(id);

        return service.salvar(previsao);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
}