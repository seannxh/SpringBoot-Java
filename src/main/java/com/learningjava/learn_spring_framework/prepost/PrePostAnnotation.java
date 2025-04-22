package com.learningjava.learn_spring_framework.prepost;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
class SomeClass {

    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency){
        super();
        this.someDependency  = someDependency;
        System.out.println("All dependencies have been loaded");
    }
    @PostConstruct //Loads all the bean and component and data for example opening up the dashboard in a game.
    // it's already loaded up after initalizating for fast retrival
    //Pre loads data like message history
    public void initialize(){
        someDependency.getReady();
    }

    @PreDestroy //Before turning it off do this
    public void cleanup(){
        System.out.println("CleanUp");
    }
}

@Component
class SomeDependency {
    public void getReady(){
        System.out.println("Some Logic Using This Depedency");
    }
}


//Websocket - One object instance per WebSocket instance
@Configuration
@ComponentScan
public class PrePostAnnotation {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(PrePostAnnotation.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            }
        }
    }

