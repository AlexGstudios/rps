package com.azeam.rps.GameBase;

import com.azeam.rps.UserInput;
import com.azeam.rps.Players.User;
import com.azeam.rps.Weapons.WeaponChoice;

public abstract class Game implements GameInterface {
    protected User player1;
    protected WeaponChoice weaponChoice;

    public Game(UserInput userInput) {
        this.weaponChoice = new WeaponChoice(userInput);
    }

    @Override
    public void startGame() {
    }
}