package com.example.demo.controller;
import com.example.demo.model.Student;

import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
//import org.springframework.security.access.prepost.PreAuthorize;
import com.example.demo.service.StudentService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/student")

@Service
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }



    @GetMapping
    @ApiOperation(value = "", authorizations = { @Authorization(value="Bearer") })
    public List<Student> getAllStudents(){
        //System.out.println(((Jwt)authn.getPrincipal()).getClaims());
        //System.out.println(((Jwt)authn.getPrincipal()).getClaims());
        return studentService.getAllStudent();
    }

    //@PreAuthorize("hasAuthority('SCOPE_profile')")
    @PostMapping
    @ApiOperation(value = "", authorizations = { @Authorization(value="Bearer") })
    public String addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return "added student";
    }

    @PutMapping
    @ApiOperation(value = "", authorizations = { @Authorization(value="Bearer") })
    public String updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
        return "updateded student";
    }
    @DeleteMapping(path = "{id}")
    @ApiOperation(value = "", authorizations = { @Authorization(value="Bearer") })
    public String deleteStudent(@PathVariable("id") UUID id) {
    studentService.deleteStudent(id);
    return "deleted student";

    }

}
