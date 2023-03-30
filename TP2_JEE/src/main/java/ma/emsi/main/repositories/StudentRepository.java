package ma.emsi.main.repositories;

import ma.emsi.main.entities.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Students,Integer> {
}
