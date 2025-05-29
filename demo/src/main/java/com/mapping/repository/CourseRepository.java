package com.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapping.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

}
