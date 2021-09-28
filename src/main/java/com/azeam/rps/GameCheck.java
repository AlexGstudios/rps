package com.azeam.rps;

public class GameCheck {

    private int wins = 3;

    public void gameCheck(UserValues user, UserValues multiComp, int singleMulti) {
        String[] choices = Setup.weaponds();

        String[] compOrPlayerTwo = { "The Computer", "Player two" };

        if (user.name.equals(multiComp.name)) {

        } else if (user.beats.equals(multiComp.name)) {

        } else {

        }
    }

    public int getWins() {
        return wins;
    }

}
