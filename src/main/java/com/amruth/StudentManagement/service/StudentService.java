package com.amruth.StudentManagement.service;

import com.amruth.StudentManagement.model.Student;
import com.amruth.StudentManagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {


    @Autowired
    private StudentRepository repo;


    public Student addStudent(Student student)
    {
        return repo.save(student);
    }

    public List<Student> getAllStudents()
    {
        return repo.findAll();
    }

    public Student getStudentById(int id)
    {
        Optional<Student> optional=repo.findById(id);
        return optional.orElse(null);
    }

    public Student updateStudent(Student student)
    {
        return repo.save(student);
    }

    public void deleteStudent(int id)
    {
        repo.deleteById(id);
    }

    public List<Student> searchStudentsByName(String name) {
        return repo.findByNameContainingIgnoreCase(name);
    }

}
