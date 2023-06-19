package com.example.tp3_jee.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "EMSI_Students")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="NAME", length = 30, nullable = false)
    private String fullname;
    @Temporal(TemporalType.DATE)
    private Date birthday;

    private Boolean stillActive;

    @Temporal(TemporalType.TIMESTAMP) @CreationTimestamp
    private Date lastConnection;
    @ManyToMany
    private Collection<Session> session;
}
