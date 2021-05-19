package rw.ac.rca.sprintbootexam.models;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String names;

    @NotNull
    private String email;

    @NotNull
    private String gender;

    @NotNull
    private int age;

    public Student() {
    }

    public Student(int id, String names, String email, String gender, int age) {
        this.id = id;
        this.names = names;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
