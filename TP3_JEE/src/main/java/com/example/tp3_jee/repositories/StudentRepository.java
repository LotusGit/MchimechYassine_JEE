package com.example.tp3_jee.repositories;

import com.example.tp3_jee.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
