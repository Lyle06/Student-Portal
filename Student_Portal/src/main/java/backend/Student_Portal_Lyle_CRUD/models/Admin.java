package backend.Student_Portal_Lyle_CRUD.models;
import javax.persistence.*;
import javax.persistence.Entity;

@Entity
@Table(name="admins")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long admin_id;

    @Column(nullable=false,unique = true,length = 50)
    private String admin_fname;

    @Column(nullable=false,unique = true,length = 50)
    private String admin_lname;

    @Column(nullable = false, unique = true, length = 50) 
    private String admin_password;

    @Column(nullable = false, unique = true, length = 45) 
    private String admin_contact;


    public long getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(long admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_fname() {
        return admin_fname;
    }

    public void setAdmin_fname(String admin_fname) {
        this.admin_fname = admin_fname;
    }

    public String getAdmin_lname() {
        return admin_lname;
    }

    public void setAdmin_lname(String admin_lname) {
        this.admin_lname = admin_lname;
    }

    public String getAdmin_password() {
        return admin_password;
    }

    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password;
    }

    public String getAdmin_contact() {
        return admin_contact;
    }

    public void setAdmin_contact(String admin_contact) {
        this.admin_contact = admin_contact;
    }
//constructors
    public Admin() {
    }

    public Admin(long admin_id, String admin_fname, String admin_lname, String admin_password, String admin_contact) {
        this.admin_id = admin_id;
        this.admin_fname = admin_fname;
        this.admin_lname = admin_lname;
        this.admin_password = admin_password;
        this.admin_contact = admin_contact;
    }
    

    
}
