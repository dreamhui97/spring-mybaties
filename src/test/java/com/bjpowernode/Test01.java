package com.bjpowernode;

import com.bjpowernode.domain.Student;
import com.bjpowernode.service.ServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test01 {
    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new  ClassPathXmlApplicationContext(config);
        ServiceImpl service = (ServiceImpl) ac.getBean("myStudentService");
        List<Student> studentList = service.selectStudent("007");
        System.out.println(studentList);
        int count = service.insertStudent(new Student("014","wangwu",30));
    }
}
