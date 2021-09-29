package com.azeam.rps;

import com.azeam.rps.Players.Computer;
import com.azeam.rps.Players.User;
import com.azeam.rps.Weapons.WeaponChoice;

public class SinglePlayer {
    private User player;
    private Computer computer;
    private WeaponChoice weaponChoice;

    public SinglePlayer(UserInput userInput) {
        player = new User("Player");
        computer = new Computer("Computer");
        weaponChoice = new WeaponChoice(userInput);
    }

    protected void showUserOptions() {
        weaponChoice.showUserOptions(player, computer);
    }
}
