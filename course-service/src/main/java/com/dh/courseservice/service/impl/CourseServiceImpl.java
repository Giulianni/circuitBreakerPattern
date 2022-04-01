package com.dh.courseservice.service.impl;

import com.dh.courseservice.repository.CourseRepository;
import com.dh.courseservice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;

public class CourseServiceImpl  extends CourseService {
    private CourseRepository courseRepository;

    @Autowired
    private CourseServiceImpl(CourseRepository courseRepository);


}
