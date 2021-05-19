package rw.ac.rca.sprintbootexam.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rw.ac.rca.sprintbootexam.models.Course;
import rw.ac.rca.sprintbootexam.repositories.CourseRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private CourseRepository repository;

    @GetMapping
    public List<Course> getAllCourses(){
        return repository.findAll();
    }

    @PostMapping
    public Course create(@RequestBody Course course){
        return repository.save(course);
    }

    @GetMapping(value = "/{id}")
    public Optional<Course> getBook(@PathVariable("id") int id) {
        return repository.findById(id);
    }

    @PutMapping
    public Course update(@RequestBody Course course) {
        return repository.save(course);
    }

    @DeleteMapping(value = "/{id}")
    public boolean delete(@PathVariable("id") int id) {
        repository.deleteById(id);
        return true;
    }
}
