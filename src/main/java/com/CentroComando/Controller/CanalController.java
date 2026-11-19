package com.CentroComando.Controller;

import com.CentroComando.Entity.Canal;
import com.CentroComando.Service.CanalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/canais")
@CrossOrigin(origins = "*")
public class CanalController {

    private final CanalService service;

    public CanalController(CanalService service) {
        this.service = service;
    }

    @GetMapping
    public List<Canal> listar() {
        return service.listar();
    }

    @PostMapping
    public Canal salvar(@RequestBody Canal canal) {
        return service.salvar(canal);
    }

    @PutMapping("/{id}")
    public Canal atualizar(
            @PathVariable Long id,
            @RequestBody Canal canal) {

        canal.setId(id);

        return service.salvar(canal);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
}