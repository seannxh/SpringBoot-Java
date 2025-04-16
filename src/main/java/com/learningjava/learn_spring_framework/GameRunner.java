package com.learningjava.learn_spring_framework;

import com.learningjava.learn_spring_framework.game.GamingConsole;
import com.learningjava.learn_spring_framework.game.MarioGame;
import com.learningjava.learn_spring_framework.game.SuperContraGame;

public class GameRunner {
    //MarioGame game;
    private GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("System is starting up" + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
