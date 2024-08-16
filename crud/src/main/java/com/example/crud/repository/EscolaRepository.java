package com.example.crud.repository;

import com.example.crud.model.Escola;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EscolaRepository extends JpaRepository <Escola, Long> {
}
