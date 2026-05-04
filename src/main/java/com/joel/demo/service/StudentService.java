package com.joel.demo.service;

import com.joel.demo.model.Student;
import com.joel.demo.dto.StudentDTO;
import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    List<Student> searchByName(String name);

    Student getStudentById(int id);

    Student addStudent(StudentDTO dto);

    Student updateStudent(int id, StudentDTO dto);


}