package com.example.tp3_jee.repositories;

import com.example.tp3_jee.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
