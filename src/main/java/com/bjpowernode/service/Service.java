package com.bjpowernode.service;

import com.bjpowernode.domain.Student;

import java.util.List;

public interface Service {
    int insertStudent(Student student);
    List<Student> selectStudent(String id);
}
