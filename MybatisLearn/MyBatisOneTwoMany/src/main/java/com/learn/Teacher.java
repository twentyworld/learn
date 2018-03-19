package com.learn;

import com.learn.Student;

import java.util.List;

public class Teacher {

    private Long id;//主键
    private String name;
    private String course;
    private List<Student> students;//老师端定义一个学生列表集合


    public Teacher() {
    }

    public Teacher(Long id, String name, String course, List<Student> students) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.students = students;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "com.learn.Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", students=" + students +
                '}';
    }
}
