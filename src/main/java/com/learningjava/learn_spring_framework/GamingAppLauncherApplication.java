package com.learningjava.learn_spring_framework;

import com.learningjava.learn_spring_framework.game.GameRunner;
import com.learningjava.learn_spring_framework.game.GamingConsole;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@Configuration
@ComponentScan("com.learningjava.learn_spring_framework.game")
public class GamingAppLauncherApplication {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
            context.getBean(GameRunner.class).run();
        }
    }

}
