package com.mySchool;

import org.apache.ibatis.annotations.*;
import org.mybatis.spring.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchoolApplication {
	public static void main(String[] args) {
		SpringApplication.run(SchoolApplication.class, args);
	}

}