package com.joel.demo.controller;

import com.joel.demo.dto.StudentDTO;
import jakarta.validation.Valid;

import com.joel.demo.model.Student;
import com.joel.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/search")
    public List<Student> searchByName(@RequestParam String name) {
        return studentService.searchByName(name);
    }

    @PostMapping
    public Student addStudent(@Valid @RequestBody StudentDTO dto) {
        return studentService.addStudent(dto);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable int id,
                                 @Valid @RequestBody StudentDTO dto) {
        return studentService.updateStudent(id, dto);
    }
}