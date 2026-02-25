# Event ORM - Sistema Evento

Projeto desenvolvido com Spring Boot para gerenciamento de atividades de um evento acadêmico.

O foco principal deste projeto é a modelagem de domínio e o mapeamento ORM utilizando JPA/Hibernate, incluindo relacionamentos OneToMany, ManyToOne e ManyToMany.

---

## 📚 Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- Banco de dados H2
- Maven

---

## 🏗 Modelo de Domínio

O sistema é composto pelas seguintes entidades:

- **Categoria** → Classificação das atividades (Curso, Oficina, etc.)
- **Atividade** → Atividades do evento (nome, descrição, preço)
- **Bloco** → Blocos de horários de uma atividade
- **Participante** → Pessoas inscritas nas atividades

### Relacionamentos implementados:

- Categoria 1:N Atividade
- Atividade 1:N Bloco
- Atividade N:N Participante

---

## 🌱 Seeding da Base de Dados

Ao iniciar a aplicação, os dados são automaticamente inseridos no banco H2 conforme o diagrama de objetos especificado no desafio.

---