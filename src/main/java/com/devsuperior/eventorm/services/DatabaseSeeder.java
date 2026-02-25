package com.devsuperior.eventorm.services;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.devsuperior.eventorm.entities.Atividade;
import com.devsuperior.eventorm.entities.Bloco;
import com.devsuperior.eventorm.entities.Categoria;
import com.devsuperior.eventorm.entities.Participante;
import com.devsuperior.eventorm.repositories.AtividadeRepository;
import com.devsuperior.eventorm.repositories.BlocoRepository;
import com.devsuperior.eventorm.repositories.CategoriaRepository;
import com.devsuperior.eventorm.repositories.ParticipanteRepository;

@Component
public class DatabaseSeeder implements CommandLineRunner {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private AtividadeRepository atividadeRepository;

    @Autowired
    private ParticipanteRepository participanteRepository;

    @Autowired
    private BlocoRepository blocoRepository;

    @Override
    public void run(String... args) throws Exception {

        Categoria c1 = new Categoria(null, "Curso");
        Categoria c2 = new Categoria(null, "Oficina");
        categoriaRepository.saveAll(Arrays.asList(c1, c2));

        Atividade a1 = new Atividade(
                null,
                "Curso de HTML",
                "Aprenda HTML de forma prática",
                80.00,
                c1
        );

        Atividade a2 = new Atividade(
                null,
                "Oficina de Github",
                "Controle versões de seus projetos",
                50.00,
                c2
        );

        atividadeRepository.saveAll(Arrays.asList(a1, a2));

        Participante p1 = new Participante(null, "José Silva", "jose@gmail.com");
        Participante p2 = new Participante(null, "Tiago Faria", "tiago@gmail.com");
        Participante p3 = new Participante(null, "Maria do Rosário", "maria@gmail.com");
        Participante p4 = new Participante(null, "Teresa Silva", "teresa@gmail.com");

        participanteRepository.saveAll(Arrays.asList(p1, p2, p3, p4));

        a1.getParticipantes().add(p1);
        a1.getParticipantes().add(p2);

        a2.getParticipantes().add(p2);
        a2.getParticipantes().add(p3);
        a2.getParticipantes().add(p4);

        atividadeRepository.saveAll(Arrays.asList(a1, a2));

        Bloco b1 = new Bloco(
                null,
                Instant.parse("2017-09-25T08:00:00Z"),
                Instant.parse("2017-09-25T11:00:00Z"),
                a1
        );

        Bloco b2 = new Bloco(
                null,
                Instant.parse("2017-09-25T14:00:00Z"),
                Instant.parse("2017-09-25T18:00:00Z"),
                a2
        );

        Bloco b3 = new Bloco(
                null,
                Instant.parse("2017-09-26T08:00:00Z"),
                Instant.parse("2017-09-26T11:00:00Z"),
                a2
        );

        blocoRepository.saveAll(Arrays.asList(b1, b2, b3));
    }
}