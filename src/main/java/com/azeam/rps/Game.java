package com.azeam.rps;

public class Game {

    private boolean isTrue = true;

    public boolean gameMode() {

        String userInput = UserInput.getInput();

        while (isTrue) {
            switch (userInput) {
                case "one":
                    // todo singelplayer
                    return true;
                case "two":
                    // todo twoplayer
                    return true;
                case "three":
                    // todo change names of the wpn's
                    return true;
                default:
                    // exception user typed wrong input
                    return true;
            }
        }
        return false;
    }
}
