package backend.Student_Portal_Lyle_CRUD.Service;
import backend.Student_Portal_Lyle_CRUD.models.Admin;
import backend.Student_Portal_Lyle_CRUD.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service

public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    //get all admin data
    public List<Admin> getAllAdmin(){
        return adminRepository.findAll();
    }

     // get admin by id
     public Optional<Admin> getAdminId(Long Id){
        return adminRepository.findById(Id);
    }

    // Add new admin
    public void addNewAdmin(Admin Obj){
        adminRepository.save(Obj);
    }

    // Deleting admin by id
    public void deleteAdminId(Admin Obj){
        adminRepository.deleteById(Obj.getAdmin_id());
    }

    // Updating admin 
    public void updateAdminId(Admin Obj){
        adminRepository.save(Obj);
    }

    
}

    

