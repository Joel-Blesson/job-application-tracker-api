package com.joel.demo.dto;

import jakarta.validation.constraints.*;

public class StudentDTO {

    @NotNull(message = "Name cannot be null")
    private String name;

    @Min(value = 0, message = "Marks must be >= 0")
    @Max(value = 100, message = "Marks must be <= 100")
    private int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}