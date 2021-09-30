package com.azeam.rps.GameBase;

import com.azeam.rps.UserInput;

public class GameBuilder {

    private UserInput userInput;
    Game game;

    public GameBuilder(UserInput userInput) {
        this.userInput = userInput;
    }

    public Game createGame() {
        System.out.println("Select game type:\n[1] Single player\n[2] Two players\n[3] Quit");
        userInput.setInput();

        switch (userInput.getInput()) {
            case "1" -> game = new SinglePlayer(userInput);
            case "2" -> game = new MultiPlayer(userInput);
            case "3" -> userInput.closeScanner();
            default -> throw new IllegalStateException("Invalid option");
        }
        return game;
    }
}