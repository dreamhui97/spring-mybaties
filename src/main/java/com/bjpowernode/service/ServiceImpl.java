package com.bjpowernode.service;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;

import java.util.List;

public class ServiceImpl implements Service {
    StudentDao studentDao = null;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int insertStudent(Student student) {
        int count = studentDao.insertStudent(student);
        return count;
    }

    @Override
    public List<Student> selectStudent(String id) {
        List<Student> studentList = studentDao.selectStudent(id);
        return studentList;
    }


}
