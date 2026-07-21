package com.sandeep.demo.Server.DTO;

import com.sandeep.demo.Server.entity.Student;
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
