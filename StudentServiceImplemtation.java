package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImplemtation implements StudentService
{
	StudentRepository repo;

	public StudentServiceImplemtation(StudentRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public String addStudent(Student s) {
	   repo.save(s);
		return "student object is created";
	}

	@Override
	public Student ViewStudent(int rollNo) {
		Student s=repo.findByrollNo(rollNo);
		return s;
	}

	@Override
	public String deleteStudent(int rollNo) {
		repo.deleteById(rollNo);
		return "objects are deleted";
	}
	

}
