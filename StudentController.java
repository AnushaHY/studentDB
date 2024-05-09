package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {
	StudentService ser;

	public StudentController(StudentService ser) {
		super();
		this.ser = ser;
	}
	
	@PostMapping
	public String addStudent(@RequestBody Student s)
	{
		String msg=ser.addStudent(s);
		return msg;
	}
	
	@GetMapping
	public Student ViewStudent(int rollNo)
	{
		Student  m=ser.ViewStudent(rollNo);
		return m;
	}
	
	@DeleteMapping
	public String DeleteStudent(int rollNo)
	{
		String ms=ser.deleteStudent(rollNo);
		return ms;
	}
	

}
