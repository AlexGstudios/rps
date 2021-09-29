package com.azeam.rps;

import com.azeam.rps.Players.User;
import com.azeam.rps.Weapon.WeaponChoice;

public class MultiPlayer {
    private User player1;
    private User player2;
    private WeaponChoice weaponChoice;

    public MultiPlayer(UserInput userInput) {
        player1 = new User("Player 1");
        player2 = new User("Player 2");
        weaponChoice = new WeaponChoice(userInput);
    }

    protected void showUserOptions() {
        weaponChoice.showUserOptions(player1, player2);
    }
}
