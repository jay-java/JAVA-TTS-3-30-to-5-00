package com.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapping.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,  Integer>{

}
