package com.devsuperior.eventorm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.eventorm.entities.Participante;

public interface ParticipanteRepository extends JpaRepository<Participante, Integer> {
}