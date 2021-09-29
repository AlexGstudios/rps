package com.azeam.rps.GameLogic;

import com.azeam.rps.Players.AbstractPlayer;
import com.azeam.rps.Players.User;
import com.azeam.rps.Weapons.WeaponData;
import com.azeam.rps.Weapons.WeaponValues;

public class GameCheck {
    private WeaponData weaponData = new WeaponData();
    private WeaponValues player2Weapon;
    private WeaponValues player1Weapon;

    public Outcome gameCheck(User player1, AbstractPlayer player2) {
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
}
