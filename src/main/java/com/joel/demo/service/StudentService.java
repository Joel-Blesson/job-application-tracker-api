package com.joel.demo.service;

import com.joel.demo.exception.StudentNotFoundException;
import com.joel.demo.model.Student;
import com.joel.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student getStudentById(int id) {
        return repository.findById(id).orElseThrow(() -> new StudentNotFoundException("Student with id " + id + " not found"));
    }

    public Student addStudent(Student student) {
        return repository.save(student);
    }

    public Student updateStudent(int id, Student student) {
        Student existing = repository.findById(id).orElse(null);

        if (existing == null) {
            throw new RuntimeException("Student not found");
        }

        existing.setName(student.getName());
        existing.setAge(student.getAge());

        return repository.save(existing);
    }
}