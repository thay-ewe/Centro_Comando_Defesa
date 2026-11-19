package com.CentroComando.Controller;

import com.CentroComando.Entity.SensorDrenagem;
import com.CentroComando.Service.SensorDrenagemService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sensores")
@CrossOrigin(origins = "*")
public class SensorDrenagemController {

    private final SensorDrenagemService service;

    public SensorDrenagemController(SensorDrenagemService service) {
        this.service = service;
    }

    @GetMapping
    public List<SensorDrenagem> listar() {
        return service.listar();
    }

    @PostMapping
    public SensorDrenagem salvar(@Valid @RequestBody SensorDrenagem sensor) {
        return service.salvar(sensor);
    }

    @PutMapping("/{id}")
    public SensorDrenagem atualizar(
            @PathVariable Long id,
            @Valid @RequestBody SensorDrenagem sensor) {

        sensor.setId(id);

        return service.salvar(sensor);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
}