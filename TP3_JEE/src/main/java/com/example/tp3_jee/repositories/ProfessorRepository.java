package com.example.tp3_jee.repositories;

import com.example.tp3_jee.entities.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
}
