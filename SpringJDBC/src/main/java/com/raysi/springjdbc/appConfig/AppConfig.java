package com.raysi.springjdbc.appConfig;

import com.raysi.springjdbc.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

@Repository
@Configuration
public class AppConfig {

    @Bean
    public DriverManagerDataSource driverManger(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/springDB");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("Raysi@2002");

        return driverManagerDataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(driverManger());
        return jdbcTemplate;
    }

}
