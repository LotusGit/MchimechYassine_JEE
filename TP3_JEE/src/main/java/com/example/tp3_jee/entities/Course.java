package com.example.tp3_jee.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 25, nullable = false, unique = false)
    private String title;
    private String description;
    private int timing;
    @OneToOne
    private Professor professor;
    @OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
    private Collection<Session> session;
}