package com.example.tp3_jee.repositories;

import com.example.tp3_jee.entities.Session;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SessionRepository extends JpaRepository<Session, Integer> {
}
