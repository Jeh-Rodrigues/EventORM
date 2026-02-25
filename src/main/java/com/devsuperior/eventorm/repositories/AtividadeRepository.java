package com.devsuperior.eventorm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.eventorm.entities.Atividade;

public interface AtividadeRepository extends JpaRepository<Atividade, Integer> {
}