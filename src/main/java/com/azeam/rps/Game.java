package com.azeam.rps;

public class Game {

    private boolean isTrue = true;

    public boolean gameMode() {

        // TODO: output show user game choices
        String userInput = UserInput.getInput();

        while (isTrue) {
            switch (userInput) {
                case "one":
                    // todo singelplayer
                    return true;
                case "two":
                    // todo twoplayer
                    return false;
                case "three":
                    // todo change names of the wpn's
                    return false;
                default:
                    // exception user typed wrong input
                    return false;
            }
        }
        return false;
    }
}
