package com.azeam.rps;

public class Game {
    private UserInput userInput;

    public Game(UserInput userInput) {
        this.userInput = userInput;
    }

    public void gameMode() {
        System.out.println("Select game type:\n[1] Single player\n[2] Two players\n[3] Quit");
        userInput.setInput();

        switch (userInput.getInput()) {
            case "1" -> new SinglePlayer(userInput).showUserOptions();
            case "2" -> new MultiPlayer(userInput).showUserOptions();
            case "3" -> userInput.closeScanner();
            default -> throw new IllegalStateException("Invalid option");
        }
    }
}
