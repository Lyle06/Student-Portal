package backend.Student_Portal_Lyle_CRUD.controllers;
import backend.Student_Portal_Lyle_CRUD.models.Student;
import backend.Student_Portal_Lyle_CRUD.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
// api endpoints which calls services from student service
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    // End point to get all students
    @GetMapping(value = "/allStudents")
    public List<Student> findAllStudents(){
        return studentService.getAllStudents();
    }
    // End point to get  student by id
    @GetMapping(value = "/findStudent/{id}")
    public Optional<Student> findStudentId(@PathVariable(value = "id") Long Id){
        return  studentService.getStudentId(Id);
    }

       // End point to add new students
    @PostMapping(value = "/addStudent")
    public void addNewEmployee(@RequestBody Student Obj){
        studentService.addNewStudent(Obj);
    }

    // End point update student
    @PutMapping(value = "/updateStudent")
    public void updateNewStudent(@RequestBody Student Obj){
        studentService.updateStudentId(Obj);
    }

    // End point to delete student
    @DeleteMapping(value = "/deleteStudent")
    public void deleteNewStudent(@RequestBody  Student Obj){
        studentService.deleteStudentId(Obj);
    }
}