package com.raysi.diusingconstructor;

import com.raysi.diusingconstructor.beans.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiUsingConstructorApplication {

    public static void main(String[] args) {

        var context = SpringApplication.run(DiUsingConstructorApplication.class, args);
        Student student = context.getBean(Student.class);
        student.display();
    }

}
