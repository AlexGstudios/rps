package com.azeam.rps;

import com.azeam.rps.Weapon.WeaponData;
import com.azeam.rps.Weapon.WeaponValues;

public class GameCheck {
    private WeaponData weaponData = new WeaponData();
    private WeaponValues computerWeapon;
    private WeaponValues userWeapon;

    public String gameCheck(User user, Computer computer) {
        userWeapon = weaponData.getWeaponData(user.getWeapon());
        computerWeapon = weaponData.getWeaponData(computer.getWeapon());

        if (userWeapon.getBeats() == computerWeapon.getName()) {
            user.setWins(user.getWins() + 1);
            computer.setLosses(computer.getLosses() + 1);
            return "Player beats computer, wins: " + user.getWins() + ", losses: " + user.getLosses();
        } else if (computerWeapon.getBeats() == userWeapon.getName()) {
            computer.setWins(computer.getWins() + 1);
            user.setLosses(user.getLosses() + 1);
            return "Computer beats player, wins: " + computer.getWins() + ", losses: " + computer.getLosses();
        }
        return "Draw";
    }
}
