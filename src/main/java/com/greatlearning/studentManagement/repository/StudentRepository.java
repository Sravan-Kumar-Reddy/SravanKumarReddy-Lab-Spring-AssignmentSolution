package com.greatlearning.studentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.studentManagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
