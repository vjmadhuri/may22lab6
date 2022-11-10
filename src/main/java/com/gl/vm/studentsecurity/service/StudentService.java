package com.gl.vm.studentsecurity.service;

import java.util.List;

import com.gl.vm.studentsecurity.entity.Student;


public interface StudentService {
	
	public List<Student> findAll();

	public Student findById(int theId);

	public void save(Student thestudent);

	public void deleteById(int theId);

}