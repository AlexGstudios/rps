package com.azeam.rps;

public class App {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();

        App.newGame(userInput);
    }

    public static void newGame(UserInput userInput) {
        GameFactory gameFactory = new GameFactory(userInput);
        Game game = gameFactory.createGame();
        if (game != null) {
            game.showUserOptions();
        }
    }
}