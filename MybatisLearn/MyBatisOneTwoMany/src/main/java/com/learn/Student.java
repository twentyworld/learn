package com.learn;

public class Student {
    private Long id;
    private String name;
    private Boolean sex;
    private Long teacherId;// 学生对应的老师的id
    private Teacher teacher;//学生端定义一个所属老师的对象


    public Student() {
    }

    public Student(Long id, String name, Boolean sex, Long teacherId, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.teacherId = teacherId;
        this.teacher = teacher;
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

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "com.learn.Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", teacherId=" + teacherId +
                ", teacher=" + teacher +
                '}';
    }
}
