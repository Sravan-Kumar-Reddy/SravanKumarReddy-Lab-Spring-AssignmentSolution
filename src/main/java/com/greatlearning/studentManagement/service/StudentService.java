package com.greatlearning.studentManagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.greatlearning.studentManagement.entity.Student;

@Service
public interface StudentService {
	
	List<Student> findAll();

	Student findById(int id);

	void save(Student student);

	void deleteById(int id);

}
