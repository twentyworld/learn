package com.learn;

import java.util.List;


public interface IStudent {
    public Student queryOneStudent(Long id);

    public void insertOneStudent(Student student);

    public void insertBatchStudent(List<Student> students);
}