package backend.Student_Portal_Lyle_CRUD.Service;
import backend.Student_Portal_Lyle_CRUD.models.Student;
import backend.Student_Portal_Lyle_CRUD.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service

public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    //get all data
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

     // get student by id
     public Optional<Student> getStudentId(Long stuId){
        return studentRepository.findById(stuId);
    }

    // Add new student
    public void addNewStudent(Student Obj){
        studentRepository.save(Obj);
    }

    // Deleting student  by id
    public void deleteStudentId(Student Obj){
        studentRepository.deleteById(Obj.getStudent_id());
    }

    // Updating student by id
    public void updateStudentId(Student Obj){
        studentRepository.save(Obj);
    }

    
}
