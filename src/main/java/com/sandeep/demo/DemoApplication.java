package com.sandeep.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Student student = new Student();
		student.setName("sandeep");
		student.setAge(21);
		student.display();
	}

}
