package com.CentroComando.Controller;

import com.CentroComando.Entity.Barragem;
import com.CentroComando.Service.BarragemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/barragens")
@CrossOrigin(origins = "*")
public class BarragemController {

    private final BarragemService service;

    public BarragemController(BarragemService service) {
        this.service = service;
    }

    @GetMapping
    public List<Barragem> listar() {
        return service.listar();
    }

    @PostMapping
    public Barragem salvar(@RequestBody Barragem barragem) {
        return service.salvar(barragem);
    }

    @PutMapping("/{id}")
    public Barragem atualizar(
            @PathVariable Long id,
            @RequestBody Barragem barragem) {

        barragem.setId(id);
        return service.salvar(barragem);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
}