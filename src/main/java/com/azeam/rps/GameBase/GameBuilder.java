package com.azeam.rps.GameBase;

import com.azeam.rps.UserInput;
import com.azeam.rps.Utils.StringUtils;

public class GameBuilder {
    private UserInput userInput;
    private StringUtils stringUtils = new StringUtils();
    Game game;

    public GameBuilder(UserInput userInput) {
        this.userInput = userInput;
    }

    public Game createGame() {
        stringUtils.printSelectGameType();
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