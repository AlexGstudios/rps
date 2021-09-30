package com.azeam.rps;

public class GameFactory {

    private UserInput userInput;
    Game game;

    public GameFactory(UserInput userInput) {
        this.userInput = userInput;
    }

    public Game createGame() {
        System.out.println("Select game type:\n[1] Single player\n[2] Twoplayers\n[3] Quit");
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