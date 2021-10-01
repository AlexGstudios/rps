package com.azeam.rps;

import com.azeam.rps.GameBase.Game;
import com.azeam.rps.GameBase.GameBuilder;

public class App {
    private static UserInput userInput;

    public static void main(String[] args) {
        userInput = new UserInput();
        newGame();
    }

    public static void newGame() {
        GameBuilder gameBuilder = new GameBuilder(userInput);
        Game game = gameBuilder.createGame();
        if (game != null) {
            game.startGame();
        }
    }
}