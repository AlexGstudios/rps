package com.azeam.rps.GameLogic;

import com.azeam.rps.Players.AbstractPlayer;
import com.azeam.rps.Players.User;

public class StringResult {
    private String result;

    public String getResult(User player1, AbstractPlayer player2, Outcome outcome) {
        switch (outcome) {
            case WIN -> result = player1.getName() + " beats " + player2.getName() + ".\n";
            case LOSS -> result = player2.getName() + " beats " + player1.getName() + ".\n";
            case DRAW -> result = "Draw\n";
        }
        return getSelection(player1, player2) + result + getScore(player1, player2);
    }

    private String getSelection(User player1, AbstractPlayer player2) {
        return player1.getName() + " selected " + player1.getWeapon() + " and " + player2.getName() + " selected "
                + player2.getWeapon() + "\n";
    }

    private String getScore(User player1, AbstractPlayer player2) {
        return player1.getName() + " wins: " + player1.getWins() + ", losses: " + player1.getLosses() + "\n"
                + player2.getName() + " wins: " + player2.getWins() + ", losses: " + player2.getLosses() + "\n";
    }
}
