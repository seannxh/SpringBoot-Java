package com.learningjava.learn_spring_framework;

import com.learningjava.learn_spring_framework.game.MarioGame;

public class GameRunner {
    MarioGame game;
    public GameRunner(MarioGame game) {
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
