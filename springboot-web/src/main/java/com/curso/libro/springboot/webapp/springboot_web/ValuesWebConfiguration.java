package com.curso.libro.springboot.webapp.springboot_web;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value="classpath:datos.properties",encoding = "UTF-8")
public class ValuesWebConfiguration {
    
}
