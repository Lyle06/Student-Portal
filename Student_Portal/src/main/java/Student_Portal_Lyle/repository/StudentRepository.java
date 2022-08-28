package Student_Portal_Lyle.repository;
import Student_Portal_Lyle.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    
    
}
