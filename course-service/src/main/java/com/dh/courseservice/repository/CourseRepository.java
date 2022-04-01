package com.dh.courseservice.repository;

import com.dh.courseservice.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Integer> {
    List<Course> findCourseById(Integer id);
}
