package com.azeam.rps;

public class Game {
    private UserInput userInput = new UserInput();

    public void gameMode() {
        System.out.println("Select game type:\n[1] Single player\n[2] Two players\n[3] Three players");
        userInput.setInput();

        switch (userInput.getInput()) {
            case "1" -> new SinglePlayer(userInput).showUserOptions();
            case "2" -> new SinglePlayer(userInput).showUserOptions();
            case "3" -> new SinglePlayer(userInput).showUserOptions();
        }
    }
}
