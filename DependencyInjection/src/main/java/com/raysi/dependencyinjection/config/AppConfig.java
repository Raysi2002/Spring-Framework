package com.raysi.dependencyinjection.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.raysi.beans") // Scans the specified package
public class AppConfig {

}