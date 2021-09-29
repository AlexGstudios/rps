package com.azeam.rps.GameLogic;

import com.azeam.rps.Players.AbstractPlayer;
import com.azeam.rps.Weapons.WeaponData;
import com.azeam.rps.Weapons.WeaponValues;

public class GameCheck {
    private WeaponData weaponData = new WeaponData();
    private WeaponValues player2Weapon;
    private WeaponValues player1Weapon;
    private String result;

    public Outcome gameCheck(AbstractPlayer player1, AbstractPlayer player2) {
        player1Weapon = weaponData.getWeaponData(player1.getWeapon());
        player2Weapon = weaponData.getWeaponData(player2.getWeapon());

        if (player1Weapon.getBeats() == player2Weapon.getType()) {
            player1.setWins(player1.getWins() + 1);
            player2.setLosses(player2.getLosses() + 1);
            return Outcome.WIN;
        } else if (player2Weapon.getBeats() == player1Weapon.getType()) {
            player2.setWins(player2.getWins() + 1);
            player1.setLosses(player1.getLosses() + 1);
            return Outcome.LOSS;
        }
        return Outcome.DRAW;
    }

    public String getBeats(AbstractPlayer player1, AbstractPlayer player2, Outcome outcome) {
        switch (outcome) {
            case WIN -> result = player1.getName() + " beats " + player2.getName() + ".\n";
            case LOSS -> result = player2.getName() + " beats " + player1.getName() + ".\n";
            case DRAW -> result = "Draw\n";
        }
        return getSelection(player1, player2) + result + getScore(player1, player2);
    }

    private String getSelection(AbstractPlayer player1, AbstractPlayer player2) {
        return player1.getName() + " selected: " + player1.getWeapon() + " and " + player2.getName() + " selected "
                + player2.getWeapon() + "\n";
    }

    private String getScore(AbstractPlayer player1, AbstractPlayer player2) {
        return player1.getName() + " wins: " + player1.getWins() + ", losses: " + player1.getLosses() + "\n"
                + player2.getName() + " wins: " + player2.getWins() + ", losses: " + player2.getLosses() + "\n";
    }
}
