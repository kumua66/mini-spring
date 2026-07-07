package com.southwind.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        /*  ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println(context.getBean("config"));*/
        ApplicationContext context = new AnnotationConfigApplicationContext("com.southwind.ioc");
        System.out.println(context.getBean(GlobalConfig.class));


    }

}
