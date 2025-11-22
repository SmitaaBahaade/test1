package com.javaexpress;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// alternative to xml file
@Configuration
@ComponentScan(basePackages = "com.javaexpress")
public class AppConfig {

}
