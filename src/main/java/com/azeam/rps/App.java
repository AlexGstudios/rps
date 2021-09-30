package com.azeam.rps;

import com.azeam.rps.GameBase.Game;
import com.azeam.rps.GameBase.GameBuilder;

public class App {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        newGame(userInput);
    }

    public static void newGame(UserInput userInput) {
        GameBuilder gameBuilder = new GameBuilder(userInput);
        Game game = gameBuilder.createGame();
        if (game != null) {
            game.startGame();
        }
    }
}