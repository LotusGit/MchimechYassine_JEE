package ma.emsi.main.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity @Table(name = "EMSI_STUDENTS")
@Data @AllArgsConstructor @NoArgsConstructor
public class Students {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "REGISTRATION_N",unique = true)
    private String registrationNumber;

    @Column(name = "NAME", length = 30, nullable = false)
    private String fullname;

    @Temporal(TemporalType.DATE)
    private Date birthday;

    private Boolean stillActive;

    @Temporal(TemporalType.TIMESTAMP) @CreationTimestamp
    private Date lastConnection;
}
