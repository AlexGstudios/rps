package com.azeam.rps.GameBase;

import com.azeam.rps.UserInput;
import com.azeam.rps.GameLogic.Battle;
import com.azeam.rps.GameLogic.GameCheck;
import com.azeam.rps.Players.User;
import com.azeam.rps.Utils.RandomUtils;
import com.azeam.rps.Weapons.WeaponData;

public abstract class Game implements GameInterface {
    protected User player1;
    protected Battle battle;
    protected UserInput userInput;
    private RandomUtils randomUtils;
    private WeaponData weaponData = new WeaponData();
    private GameCheck gameCheck = new GameCheck(weaponData);

    public Game(UserInput userInput) {
        this.randomUtils = new RandomUtils();
        this.battle = new Battle(userInput, randomUtils, gameCheck);
    }
}