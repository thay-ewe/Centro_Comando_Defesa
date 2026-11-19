package com.CentroComando.Controller;

import com.CentroComando.Entity.Bueiro;
import com.CentroComando.Service.BueiroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bueiros")
@CrossOrigin(origins = "*")
public class BueiroController {

    private final BueiroService service;

    public BueiroController(BueiroService service) {
        this.service = service;
    }

    @GetMapping
    public List<Bueiro> listar() {
        return service.listar();
    }

    @PostMapping
    public Bueiro salvar(@RequestBody Bueiro bueiro) {
        return service.salvar(bueiro);
    }

    @PutMapping("/{id}")
    public Bueiro atualizar(
            @PathVariable Long id,
            @RequestBody Bueiro bueiro) {

        bueiro.setId(id);

        return service.salvar(bueiro);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
}