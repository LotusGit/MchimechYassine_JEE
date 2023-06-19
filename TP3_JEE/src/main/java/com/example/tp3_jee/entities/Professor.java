package com.example.tp3_jee.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 30, nullable = false)
    private String fullname;
    @Temporal(TemporalType.DATE) @CreationTimestamp
    private Date assignementDate;
    @OneToOne
    private Course course;
}
