package com.azeam.rps.Weapons;

import com.azeam.rps.UserInput;
import com.azeam.rps.GameLogic.GameCheck;
import com.azeam.rps.GameLogic.Outcome;
import com.azeam.rps.Players.AbstractPlayer;
import com.azeam.rps.Players.Computer;
import com.azeam.rps.Players.User;
import com.azeam.rps.Utils.RandomUtils;
import com.azeam.rps.Utils.StringUtils;

public class WeaponChoice {
    private WeaponData weaponData = new WeaponData();
    private GameCheck gameCheck = new GameCheck(weaponData);
    private StringUtils stringUtils = new StringUtils();
    private UserInput userInput;
    private RandomUtils randomUtils;

    public WeaponChoice(UserInput userInput, RandomUtils randomUtils) {
        this.randomUtils = randomUtils;
        this.userInput = userInput;
    }

    public void showWeaponChoices(User player1, AbstractPlayer player2) {
        while (player1.getWins() < 3 && player2.getWins() < 3) {
            setWeaponChoice(player1);
            if (player2 instanceof User) {
                setWeaponChoice((User) player2);
            } else if (player2 instanceof Computer) {
                player2.setWeapon(randomUtils.getRandomWeapon());
            }
            Outcome result = gameCheck.gameCheck(player1, player2);
            stringUtils.printResult(player1, player2, result);
        }
    }

    private void setWeaponChoice(User player) {
        stringUtils.printSelectWeapon(player);
        userInput.setInput();

        switch (userInput.getInput()) {
            case "1" -> player.setWeapon(Weapon.ROCK);
            case "2" -> player.setWeapon(Weapon.PAPER);
            case "3" -> player.setWeapon(Weapon.SCISSORS);
            default -> throw new IllegalStateException("Invalid option");
        }
    }
}
