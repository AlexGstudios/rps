package com.azeam.rps.GameBase;

import com.azeam.rps.UserInput;
import com.azeam.rps.Players.User;
import com.azeam.rps.Utils.RandomUtils;
import com.azeam.rps.Weapons.WeaponChoice;

public abstract class Game implements GameInterface {
    protected User player1;
    protected WeaponChoice weaponChoice;
    protected UserInput userInput;
    private RandomUtils randomUtils;

    public Game(UserInput userInput) {
        this.randomUtils = new RandomUtils();
        this.weaponChoice = new WeaponChoice(userInput, randomUtils);
    }

    @Override
    public void startGame() {
    }
}