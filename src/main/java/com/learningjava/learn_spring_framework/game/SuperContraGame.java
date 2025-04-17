package com.learningjava.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SP_GAME")
public class SuperContraGame implements GamingConsole{
    public void up() {
        System.out.println("SP Up");
    }
    public void down(){
        System.out.println("SP Down");
    }
    public void left(){
        System.out.println("SP Left");
    }
    public void right(){
        System.out.println("SP Right");
    }
}
