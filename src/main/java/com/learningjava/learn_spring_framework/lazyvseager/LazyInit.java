package com.learningjava.learn_spring_framework.lazyvseager;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Arrays;


@Component
class ClassA {

}
@Component
@Lazy
class ClassB{
    private ClassA classA;

    public ClassB(ClassA classA){
        //Logic
        System.out.println("Initialization Logic");
        this.classA = classA;
    }
}
@Configuration
@ComponentScan
public class LazyInit {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(LazyInit.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(ClassB.class));

            }
        }
    }

