package com.amruth.StudentManagement.repository;

import com.amruth.StudentManagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    List<Student> findByNameContainingIgnoreCase(String name);

}
