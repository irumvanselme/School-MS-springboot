package rw.ac.rca.sprintbootexam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rw.ac.rca.sprintbootexam.models.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
}
