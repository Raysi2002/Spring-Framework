package com.raysi.springjdbc;

import com.raysi.springjdbc.appConfig.AppConfig;
import com.raysi.springjdbc.beans.Student;
import com.raysi.springjdbc.rowMapper.StudentRowMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringJdbcApplication {

    public static void main(String[] args) {
//        -------INSERT OPERATION--------
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter sid: ");
//        int sid = scanner.nextInt();
//        System.out.print("Enter name: ");
//        String name = scanner.next();
//        System.out.print("Enter marks: ");
//        double marks = scanner.nextDouble();
//
//        var context = SpringApplication.run(SpringJdbcApplication.class, args);
//        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
//        String query = "Insert into student values (?, ?, ?)";
//
//        int count = jdbcTemplate.update(query, sid, name, marks);
//        if (count > 0)
//            System.out.println("Insertion successful");
//        else
//            System.out.println("Insertion not successful");


//        --------RETERIVE OPERATION-------


        var context = SpringApplication.run(SpringJdbcApplication.class);
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

        String query = "select * from student";

        List<Student> list = jdbcTemplate.query(query, new StudentRowMapper());
        for(Student std : list){
            System.out.println("SID: " + std.getId());
            System.out.println("NAME: " + std.getName());
            System.out.println("MARKS: " + std.getMarks());
            System.out.println("_______________________________");
        }


    }

}
