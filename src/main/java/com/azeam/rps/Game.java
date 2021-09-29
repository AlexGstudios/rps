package com.azeam.rps;

public class Game {
    private String input;
    private UserInput userInput;

    public void gameMode() {
        System.out.println("Select game type:\n[1] Single player\n[2] Two players\n[3] Three players");
        userInput = new UserInput();
        userInput.setInput();
        input = userInput.getInput();

        switch (input) {
            case "1" -> new SinglePlayer(userInput).showUserOptions();
            case "2" -> new SinglePlayer(userInput).showUserOptions();
            case "3" -> new SinglePlayer(userInput).showUserOptions();
        }
    }
}
