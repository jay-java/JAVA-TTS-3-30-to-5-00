package com.mapping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapping.model.Course;
import com.mapping.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	public Course saveCourse(Course c) {
		return this.courseRepository.save(c);
	}
}
