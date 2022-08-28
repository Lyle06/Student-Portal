package backend.Student_Portal_Lyle_CRUD.models;
import javax.persistence.*;
import javax.persistence.Entity;

@Entity
@Table(name="students")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long student_id;

    @Column(nullable=false,unique = true,length = 50)
    private String student_fname;

    @Column(nullable=false,unique = true,length = 50)
    private String student_lname;

   
    @Column(nullable=false,unique = true,length = 80)
    private String student_address;
    
    @Column(nullable = false, unique = true, length = 45) 
    private String student_email;

    @Column(nullable = false, unique = true, length = 50) 
    private String student_password;

    //getters and setters
    public long getStudent_id() {
        return student_id;
    }
    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }
    public String getStudent_fname() {
        return student_fname;
    }
    public void setStudent_fname(String student_name) {
        this.student_fname = student_name;
    }
    public String getStudent_lname() {
        return student_lname;
    }
    public void setStudent_lname(String student_lname) {
        this.student_lname = student_lname;
    }

    public String getStudent_address() {
        return student_address;
    }
    public void setStudent_address(String student_address) {
        this.student_address = student_address;
    }
    public String getStudent_email() {
        return student_email;
    }
    public void setStudent_email(String student_email) {
        this.student_email = student_email;
    }
    public String getStudent_password() {
        return student_password;
    }
    public void setStudent_password(String student_password) {
        this.student_password = student_password;
    }    
    //constructors
    public Student(){}

    public Student(long student_id, String student_fname, String student_lname, String student_address, String student_email,
            String student_password) {
        this.student_id = student_id;
        this.student_fname = student_fname;
        this.student_lname = student_lname;
        this.student_address = student_address;
        this.student_email = student_email;
        this.student_password = student_password;
    }
    

    
}
