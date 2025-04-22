package com.learningjava.learn_spring_framework.example;
import com.learningjava.learn_spring_framework.GamingAppLauncherApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class YourBusinessClass {
    @Autowired
    Depdency1 depdency1;
    @Autowired
    Depdency2 dependecy2;
    private String tool1 = "Udemy";
    private String tool2 = "IntelliJ";
    public String toString() {
        return "Using " + depdency1 + " & " + dependecy2 + " & " + tool1 + " & " + tool2;
    }
}
@Component
class Depdency1 {

}
@Component
class Depdency2 {

}

@Configuration
@ComponentScan
public class DepInjectionLauncher {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(DepInjectionLauncher.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(YourBusinessClass.class));

            }
        }
    }

