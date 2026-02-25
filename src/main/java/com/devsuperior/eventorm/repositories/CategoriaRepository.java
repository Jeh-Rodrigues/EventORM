package com.devsuperior.eventorm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.eventorm.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}