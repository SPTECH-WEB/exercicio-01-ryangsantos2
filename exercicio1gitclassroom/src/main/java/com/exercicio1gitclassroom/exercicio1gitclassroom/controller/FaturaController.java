package com.exercicio1gitclassroom.exercicio1gitclassroom.controller;

import jakarta.validation.Valid;
import com.exercicio1gitclassroom.exercicio1gitclassroom.model.Fatura;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.exercicio1gitclassroom.exercicio1gitclassroom.service.FaturaService;

import java.util.List;

@RestController
@RequestMapping("/faturas")
public class FaturaController {
    private final FaturaService faturaService;

    public FaturaController(FaturaService faturaService) {
        this.faturaService = faturaService;
    }

    @GetMapping
    public List<Fatura>listarTodos(){
        return faturaService.listar();
    }

    @PostMapping
    public ResponseEntity<Fatura> adicionarFatura(@Valid @RequestBody Fatura fatura){
       Fatura novaFatura = faturaService.salvar(fatura);
        return ResponseEntity.ok(novaFatura);
    }
}
