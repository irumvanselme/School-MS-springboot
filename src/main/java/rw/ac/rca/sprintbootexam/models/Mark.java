package rw.ac.rca.sprintbootexam.models;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class Mark {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @ManyToOne
    private Student student;

    @NotNull
    @ManyToOne
    private Course course;

    @NotNull
    private int score;

    @NotNull
    private int maximum;

    public Mark() {
    }

    public Mark(Student student, Course course, int score, int maximum) {
        this.student = student;
        this.course = course;
        this.score = score;
        this.maximum = maximum;
    }

    public Mark(int id, Student student, Course course, int score, int maximum) {
        this.id = id;
        this.student = student;
        this.course = course;
        this.score = score;
        this.maximum = maximum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
}
