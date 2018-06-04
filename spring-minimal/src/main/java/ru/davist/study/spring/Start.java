package ru.davist.study.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Start {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringJavaConfig.class);

        StringBuilder bean = context.getBean("stringBean", StringBuilder.class);

        System.out.println(bean.toString());

    }
}
