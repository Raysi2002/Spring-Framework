package com.raysi.diusingconstructor.appConfig;

import com.raysi.diusingconstructor.beans.Address;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan (basePackages = "com.raysi.diusingconstructor.beans")
public class AppConfig {
    @Bean
    public Address address(){
        return new Address(116, "Laukahi", "Koshi");
    }
}
