package com.exercicio1gitclassroom.exercicio1gitclassroom.repository;

import com.exercicio1gitclassroom.exercicio1gitclassroom.model.Fatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaturaRepository extends JpaRepository<Fatura, Long> {
}
