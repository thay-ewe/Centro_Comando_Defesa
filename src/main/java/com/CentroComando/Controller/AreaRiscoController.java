package com.CentroComando.Controller;

import com.CentroComando.Entity.AreaRisco;
import com.CentroComando.Service.AreaRiscoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/areas-risco")
@CrossOrigin(origins = "*")
public class AreaRiscoController {

    private final AreaRiscoService service;

    public AreaRiscoController(AreaRiscoService service) {
        this.service = service;
    }

    @GetMapping
    public List<AreaRisco> listar() {
        return service.listar();
    }

    @PostMapping
    public AreaRisco salvar(@RequestBody AreaRisco areaRisco) {
        return service.salvar(areaRisco);
    }

    @PutMapping("/{id}")
    public AreaRisco atualizar(
            @PathVariable Long id,
            @RequestBody AreaRisco areaRisco) {

        areaRisco.setId(id);
        return service.salvar(areaRisco);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
}