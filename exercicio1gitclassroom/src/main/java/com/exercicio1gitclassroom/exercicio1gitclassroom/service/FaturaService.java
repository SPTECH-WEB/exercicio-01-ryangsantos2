package com.exercicio1gitclassroom.exercicio1gitclassroom.service;

import com.exercicio1gitclassroom.exercicio1gitclassroom.model.Fatura;
import org.springframework.stereotype.Service;
import com.exercicio1gitclassroom.exercicio1gitclassroom.repository.FaturaRepository;
import java.util.List;

@Service
public class FaturaService {
    private final FaturaRepository faturaRepository;

    public FaturaService(FaturaRepository faturaRepository) {
        this.faturaRepository = faturaRepository;
    }

    public Fatura salvar(Fatura fatura) {
        return faturaRepository.save(fatura);
    }

    public List<Fatura> listar() {
        return faturaRepository.findAll();
    }
}
