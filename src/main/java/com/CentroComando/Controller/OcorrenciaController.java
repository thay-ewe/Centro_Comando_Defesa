package com.CentroComando.Controller;

import com.CentroComando.Entity.Ocorrencia;
import com.CentroComando.Service.OcorrenciaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ocorrencias")
@CrossOrigin(origins = "*")
public class OcorrenciaController {

    private final OcorrenciaService service;

    public OcorrenciaController(OcorrenciaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Ocorrencia> listar() {
        return service.listar();
    }

    @PostMapping
    public Ocorrencia salvar(@RequestBody Ocorrencia ocorrencia) {
        return service.salvar(ocorrencia);
    }

    @PutMapping("/{id}")
    public Ocorrencia atualizar(
            @PathVariable Long id,
            @RequestBody Ocorrencia ocorrencia) {

        ocorrencia.setId(id);
        return service.salvar(ocorrencia);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
}