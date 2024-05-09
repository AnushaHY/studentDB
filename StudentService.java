package com.example.demo.service;

import com.example.demo.entities.Student;

public interface StudentService {
	public String addStudent(Student s);
	public Student ViewStudent(int rollNo);
	public String deleteStudent(int rollNo);

}
