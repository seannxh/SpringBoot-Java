package com.learningjava.learn_spring_framework.database;


import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class RealWorldSpringContext {

    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (RealWorldSpringContext.class)) {

            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            BusinessCalculationService service = context.getBean(BusinessCalculationService.class);
            int result = service.findMax();
            System.out.println("💡 Max value = " + result);


        }
    }
}