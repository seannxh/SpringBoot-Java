package com.learningjava.learn_spring_framework;


import com.learningjava.learn_spring_framework.game.MarioGame;

public class AppGamingBasic {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();

    }
}
