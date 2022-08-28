package backend.Student_Portal_Lyle_CRUD.controllers;
import backend.Student_Portal_Lyle_CRUD.models.Admin;
import backend.Student_Portal_Lyle_CRUD.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

// api endpoints which calls services from student service
@RestController


public class AdminController {
    
    @Autowired
    private AdminService adminService;

    // End point to get all admins
    @GetMapping(value = "/allAdmin")
    public List<Admin> findAllAdmins(){
        return adminService.getAllAdmin();
    }
    // End point to get  Admin by id
    @GetMapping(value = "/findAdmin/{id}")
    public Optional<Admin> findAdminId(@PathVariable(value = "id") Long Id){
        return  adminService.getAdminId(Id);
    }

       // End point to add new admin
    @PostMapping(value = "/addAdmin")
    public void addNewAdmin(@RequestBody Admin Obj){
        adminService.addNewAdmin(Obj);
    }

    // End point for updating admin
    @PutMapping(value = "/updateAdmin")
    public void updateNewAdmin(@RequestBody Admin Obj){
        adminService.updateAdminId(Obj);
    }

    // End point deleting admin
    @DeleteMapping(value = "/deleteAdmin")
    public void deleteNewEmployee(@RequestBody  Admin Obj){
        adminService.deleteAdminId(Obj);
    }
}
