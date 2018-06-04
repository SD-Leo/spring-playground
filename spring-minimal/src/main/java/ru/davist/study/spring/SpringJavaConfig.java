package ru.davist.study.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringJavaConfig {

    @Bean
    public StringBuilder stringBean() {
        StringBuilder sb = new StringBuilder();
        sb.append("I am spring bean");
        return sb;
    }
}
