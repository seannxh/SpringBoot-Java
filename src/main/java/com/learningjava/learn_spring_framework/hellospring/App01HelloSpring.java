package com.learningjava.learn_spring_framework.hellospring;
import com.learningjava.learn_spring_framework.hellospring.Address;
import com.learningjava.learn_spring_framework.hellospring.Person;
import com.learningjava.learn_spring_framework.hellospring.HelloWorldConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App01HelloSpring {
    public static void main(String[] args) {
        //Launch a spring context
        //configure the things that we want spring to manage - @configuration class
        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);){
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            //System.out.println(context.getBean("person"));
            System.out.println(context.getBean(Address.class));
            //System.out.println(context.getBean("person2newCall"));
            System.out.println(context.getBean(Person.class));
            System.out.println(context.getBean("Person4Param"));
            System.out.println(context.getBean("Person5Param"));
            //
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            context.getBeanDefinitionNames();
        }
    }
}
