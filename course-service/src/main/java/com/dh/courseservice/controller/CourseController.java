package com.dh.courseservice.controller;

import com.dh.courseservice.model.Course;
import com.dh.courseservice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController {
    private CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    public Course getCourseById(@PathVariable Integer id) {
        return courseService.findCourseById(id);
    }
}
