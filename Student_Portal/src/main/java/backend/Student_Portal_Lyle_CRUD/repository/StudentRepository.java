package backend.Student_Portal_Lyle_CRUD.repository;
import backend.Student_Portal_Lyle_CRUD.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// JPA repo handle Crud dunction direclty with database
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    
    
}
