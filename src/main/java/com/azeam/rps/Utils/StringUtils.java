package com.azeam.rps.Utils;

import com.azeam.rps.GameLogic.Outcome;
import com.azeam.rps.Players.AbstractPlayer;
import com.azeam.rps.Players.User;

public class StringUtils {
    public void printResult(User player1, AbstractPlayer player2, Outcome outcome) {
        System.out.println(getResult(player1, player2, outcome));
    }

    public void printSelectGameType() {
        System.out.println("Select game type:\n[1] Single player\n[2] Two players\n[3] Quit");
    }

    public void printSelectWeapon(User player) {
        System.out.println(player.getName() + " - Select weapon:\n[1] ROCK\n[2] PAPER\n[3] SCISSORS");
    }

    private String getResult(User player1, AbstractPlayer player2, Outcome outcome) {
        String result = "";
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
