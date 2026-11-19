package com.CentroComando.Controller;

import com.CentroComando.Entity.Alerta;
import com.CentroComando.Service.AlertaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alertas")
@CrossOrigin(origins = "*")
public class AlertaController {

    private final AlertaService service;

    public AlertaController(AlertaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Alerta> listar() {
        return service.listar();
    }

    @PostMapping
    public Alerta salvar(@RequestBody Alerta alerta) {
        return service.salvar(alerta);
    }

    @PutMapping("/{id}")
    public Alerta atualizar(
            @PathVariable Long id,
            @RequestBody Alerta alerta) {

        alerta.setId(id);
        return service.salvar(alerta);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
}