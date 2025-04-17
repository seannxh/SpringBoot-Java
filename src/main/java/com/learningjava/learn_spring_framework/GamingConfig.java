package com.learningjava.learn_spring_framework;

import com.learningjava.learn_spring_framework.game.GamingConsole;
import com.learningjava.learn_spring_framework.game.Pacman;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfig {
    @Bean
    public GamingConsole game() {
        var game = new Pacman();
        return game;
    }

    @Bean GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }

    public static void main(String[] args) {
        //var game = new MarioGame();
        var game = new Pacman();
        //var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
