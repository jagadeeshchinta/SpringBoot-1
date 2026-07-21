package com.jagadeesh.demo.Server.DTO;



import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateStudentRequestDTO {
    private String name;
    private int age;
    private String department;
}