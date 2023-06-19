package com.example.tp3_jee.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Temporal(TemporalType.DATE)
    private Date date;
    @Temporal(TemporalType.DATE)
    private Date start_time;
    @Temporal(TemporalType.DATE)
    private Date end_time;
    @ManyToOne
    private Course course;
    @ManyToMany(mappedBy = "session", fetch = FetchType.LAZY)
    private Collection<Student> student;
}
