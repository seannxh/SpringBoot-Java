package com.learningjava.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.awt.*;

@Component
@Qualifier("MarioGame")
public class MarioGame implements GamingConsole {
    public void up() {
        System.out.println("Mario Jump");
    }
    public void down(){
        System.out.println("Mario Down");
    }
    public void left(){
        System.out.println("Mario Left");
    }
    public void right(){
        System.out.println("Mario Right");
    }


}
