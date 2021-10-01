package com.azeam.rps.GameLogic;

import com.azeam.rps.Players.AbstractPlayer;
import com.azeam.rps.Players.User;
import com.azeam.rps.Weapons.WeaponData;
import com.azeam.rps.Weapons.WeaponValues;

public class GameCheck {
    private WeaponData weaponData;
    private WeaponValues player2Weapon;
    private WeaponValues player1Weapon;

    public GameCheck(WeaponData weaponData) {
        this.weaponData = weaponData;
    }

    public Outcome gameCheck(User player1, AbstractPlayer player2) {
        player1Weapon = weaponData.getWeaponData(player1.getWeapon());
        player2Weapon = weaponData.getWeaponData(player2.getWeapon());

        if (player1Weapon.getBeats() == player2Weapon.getType())
            return Outcome.WIN;
        if (player2Weapon.getBeats() == player1Weapon.getType())
            return Outcome.LOSS;
        return Outcome.DRAW;
    }
}
