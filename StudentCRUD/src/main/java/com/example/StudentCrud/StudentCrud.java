package com.example.StudentCrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.StudentCrud.controller", "com.example.StudentCrud.domain","com.example.StudentCrud.repository","com.example.StudentCrud.service"})
public class StudentCrud {

	public static void main(String[] args) {
		SpringApplication.run(StudentCrud.class, args);
	}

}
