package com.learningjava.learn_spring_framework.game;

public class GameRunner {
    static MarioGame game;
    public GameRunner(MarioGame game) {
        GameRunner.game = game;
    }
    public static void run() {
        System.out.println("Running Game:" + game);
    }
}
