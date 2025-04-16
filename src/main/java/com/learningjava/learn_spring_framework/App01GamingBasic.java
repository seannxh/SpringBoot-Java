package com.learningjava.learn_spring_framework;



import com.learningjava.learn_spring_framework.game.Pacman;

public class App01GamingBasic {
    public static void main(String[] args) {
        //var game = new MarioGame();
        var game = new Pacman();
        //var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();

    }
}
