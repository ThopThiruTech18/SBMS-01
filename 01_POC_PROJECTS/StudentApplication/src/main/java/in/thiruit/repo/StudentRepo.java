package in.thiruit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.thiruit.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{

}
