package com.gl.vm.studentsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.vm.studentsecurity.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
