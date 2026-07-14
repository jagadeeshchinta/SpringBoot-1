package com.sandeep.demo;

import com.sandeep.demo.DI.OrderService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
//		Student student = new Student();
//		student.setName("sandeep");
//		student.setAge(21);
//		student.display();
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//		Student student = (Student) context.getBean(Student.class);
//		student.setName("Sandeep");
//		student.setAge(21);
//		student.display();

//		OrderService orderService = context.getBean(OrderService.class);
//		orderService.plceorder();
	}

}
