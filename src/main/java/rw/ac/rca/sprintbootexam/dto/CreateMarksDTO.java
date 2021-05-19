package rw.ac.rca.sprintbootexam.dto;

import com.sun.istack.NotNull;

public class CreateMarksDTO {

    @NotNull
    public int studentId;

    @NotNull
    public int courseId;

    @NotNull
    public int scored;

    @NotNull
    public int maximum;

    public CreateMarksDTO() {
    }

    public CreateMarksDTO(int studentId, int courseId, int scored, int maximum) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.scored = scored;
        this.maximum = maximum;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getScored() {
        return scored;
    }

    public void setScored(int scored) {
        this.scored = scored;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
}
