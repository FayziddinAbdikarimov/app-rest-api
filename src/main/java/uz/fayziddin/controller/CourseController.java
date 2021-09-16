package uz.fayziddin.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.fayziddin.entity.Course;
import uz.fayziddin.repository.CourseRepository;
import uz.fayziddin.repository.DirectionRepository;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    DirectionRepository directionRepository;

    @GetMapping
    public List<Course> getCourseList(){
        return courseRepository.findAll();
    }

    @PostMapping("/save")
    public Course saveCourse(@RequestBody Course newCourse){
        directionRepository.save(newCourse.getDirectionId());
        return courseRepository.save(newCourse);
    }
}
