package rw.ac.rca.sprintbootexam.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rw.ac.rca.sprintbootexam.dto.CreateMarksDTO;
import rw.ac.rca.sprintbootexam.models.Course;
import rw.ac.rca.sprintbootexam.models.Mark;
import rw.ac.rca.sprintbootexam.models.Student;
import rw.ac.rca.sprintbootexam.repositories.CourseRepository;
import rw.ac.rca.sprintbootexam.repositories.MarksRepository;
import rw.ac.rca.sprintbootexam.repositories.StudentRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/marks")
public class MarksController {

    @Autowired
    private MarksRepository repository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping
    public List<Mark> getAllMarks() {
        return repository.findAll();
    }

    @PostMapping
    public Mark create(@RequestBody CreateMarksDTO marksData) {
        Optional<Student> student = studentRepository.findById(marksData.getStudentId());
        Optional<Course> course = courseRepository.findById(marksData.getCourseId());

        if (student.isPresent() && course.isPresent()) {
            return repository.save(new Mark(student.get(), course.get(), marksData.getScored(), marksData.getMaximum()));
        } else {
            return null;
        }
    }

    @GetMapping(value = "/{id}")
    public Optional<Mark> getBook(@PathVariable("id") int id) {
        return repository.findById(id);
    }

    @PutMapping
    public Mark update(@RequestBody Mark mark) {
        return repository.save(mark);
    }

    @DeleteMapping(value = "/{id}")
    public boolean delete(@PathVariable("id") int id) {
        repository.deleteById(id);
        return true;
    }
}
