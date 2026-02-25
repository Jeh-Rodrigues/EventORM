package com.devsuperior.eventorm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.eventorm.entities.Bloco;

public interface BlocoRepository extends JpaRepository<Bloco, Integer> {
}