package com.raysi.main;

import com.raysi.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String path = "com/raysi/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(path);

        Employee employee = (Employee) context.getBean("emp");
        employee.display();
    }
}
