package com.joel.demo.service;

import com.joel.demo.dto.StudentDTO;
import com.joel.demo.model.Student;
import com.joel.demo.repository.StudentRepository;
import com.joel.demo.exception.StudentNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student getStudentById(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException("Student not found"));
    }

    @Override
    public Student addStudent(StudentDTO dto) {

        Student student = new Student();
        student.setName(dto.getName());
        student.setMarks(dto.getMarks());

        return repository.save(student);
    }

    @Override
    public Student updateStudent(int id, StudentDTO dto) {

        Student existing = getStudentById(id);

        existing.setName(dto.getName());
        existing.setMarks(dto.getMarks());

        return repository.save(existing);
    }

    @Override
    public List<Student> searchByName(String name) {
        return repository.findByName(name);
    }
}