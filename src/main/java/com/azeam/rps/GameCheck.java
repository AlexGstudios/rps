package com.azeam.rps;

import com.azeam.rps.Players.AbstractPlayer;
import com.azeam.rps.Weapon.WeaponData;
import com.azeam.rps.Weapon.WeaponValues;

public class GameCheck {
    private WeaponData weaponData = new WeaponData();
    private WeaponValues computerWeapon;
    private WeaponValues userWeapon;
    private String result;

    public String gameCheck(AbstractPlayer player1, AbstractPlayer player2) {
        userWeapon = weaponData.getWeaponData(player1.getWeapon());
        computerWeapon = weaponData.getWeaponData(player2.getWeapon());

        if (userWeapon.getBeats() == computerWeapon.getType()) {
            player1.setWins(player1.getWins() + 1);
            player2.setLosses(player2.getLosses() + 1);
            result = player1.getName() + " beats " + player2.getName() + ".\n";
        } else if (computerWeapon.getBeats() == userWeapon.getType()) {
            player2.setWins(player2.getWins() + 1);
            player1.setLosses(player1.getLosses() + 1);
            result = player2.getName() + " beats " + player1.getName() + ".\n";
        } else {
            result = "Draw\n";
        }
        return result + setScore(player1, player2);
    }

    private String setScore(AbstractPlayer player1, AbstractPlayer player2) {

        return player1.getName() + " wins: " + player1.getWins() + ", losses: " + player1.getLosses() + "\n"
                + player2.getName() + " wins: " + player2.getWins() + ", losses: " + player2.getLosses() + "\n";
    }
}
