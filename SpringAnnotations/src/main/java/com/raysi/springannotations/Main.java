package com.raysi.springannotations;

import com.raysi.springannotations.beans.ServiceAnnotation;
import com.raysi.springannotations.beans.Student;
import com.raysi.springannotations.beans.StudentWithValue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        //For Default values: @Component Annotation
//        var context =  SpringApplication.run(Main.class, args);
//        Student student = context.getBean(Student.class);
//        student.display();

//        //For Explicit values: @Value Annotation
//        var context = SpringApplication.run(Main.class, args);
//        StudentWithValue student = context.getBean(StudentWithValue.class);
//        student.display();

        //Use of @Service Annotation
        var context = SpringApplication.run(Main.class, args);
        ServiceAnnotation student = context.getBean(ServiceAnnotation.class);
        student.display();
    }


}
