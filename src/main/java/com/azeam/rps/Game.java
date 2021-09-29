package com.azeam.rps;

public class Game {
    private String userInput;

    public void gameMode() {
        System.out.println("Select game type:\n[1] Single player\n[2] Two players\n[3] Three players");
        UserInput.setInput();
        userInput = UserInput.getInput();

        switch (userInput) {
            case "1" -> new SinglePlayer();
            case "2" -> new SinglePlayer();
            case "3" -> new SinglePlayer();
        }
    }
}
