package com.amruth.StudentManagement.controller;

import com.amruth.StudentManagement.model.Student;
import com.amruth.StudentManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping
    public Student addStudent(@RequestBody Student student)
    {
        return service.addStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudents()
    {
        return service.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id)
    {
        return service.getStudentById(id);
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student)
    {
        return service.updateStudent(student);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id)
    {
        service.deleteStudent(id);
        return "Student with ID" +id+ "deleted";
    }


}
