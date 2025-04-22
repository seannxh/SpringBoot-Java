package com.learningjava.learn_spring_framework.scopebean;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
class NormalClass {

}
@Scope("prototype")
@Component
class PrototypeClass {

}
//@Scope
//singleton	🧍‍♂️ Default — one bean per Spring container
//prototype	🧑‍🤝‍🧑 A new bean is created every time you request it

// @Scope but for only web application
//request	🌐 One bean per HTTP request (used in web apps)
//session	👤 One bean per HTTP session (used in web apps)
//application One object instance per web application run tie
//Websocket - One object instance per WebSocket instance
@Configuration
@ComponentScan
public class BeanScope {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(BeanScope.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean(NormalClass.class)); // Normal Class gets printed same
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(PrototypeClass.class)); //Prototype hash code is different each call
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));


            }
        }
    }

