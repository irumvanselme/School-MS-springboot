package rw.ac.rca.sprintbootexam.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rw.ac.rca.sprintbootexam.models.Student;
import rw.ac.rca.sprintbootexam.repositories.StudentRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @GetMapping
    public List<Student> getAllStudents(){
        return repository.findAll();
    }

    @PostMapping
    public Student create(@RequestBody Student student){
        return repository.save(student);
    }

    @GetMapping(value = "/{id}")
    public Optional<Student> getBook(@PathVariable("id") int id) {
        return repository.findById(id);
    }

    @PutMapping
    public Student update(@RequestBody Student student) {
        return repository.save(student);
    }

    @DeleteMapping(value = "/{id}")
    public boolean delete(@PathVariable("id") int id) {
        repository.deleteById(id);
        return true;
    }
}
