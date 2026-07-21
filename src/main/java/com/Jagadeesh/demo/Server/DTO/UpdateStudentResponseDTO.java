package com.jagadeesh.demo.Server.DTO;

import com.jagadeesh.demo.Server.entity.Student;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateStudentResponseDTO {
    private String name;
    private int age;

    public UpdateStudentResponseDTO(Student student) {
        this.name = student.getName();
        this.age = student.getAge();
    }
}
