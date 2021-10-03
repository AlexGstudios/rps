package com.azeam.rps.GameLogic;

import com.azeam.rps.UserInput;
import com.azeam.rps.Players.AbstractPlayer;
import com.azeam.rps.Players.Computer;
import com.azeam.rps.Players.User;
import com.azeam.rps.Utils.RandomUtils;
import com.azeam.rps.Utils.StringUtils;
import com.azeam.rps.Weapons.Weapon;

public class Battle {
    private StringUtils stringUtils = new StringUtils();
    private GameCheck gameCheck;
    private UserInput userInput;
    private RandomUtils randomUtils;

    public Battle(UserInput userInput, RandomUtils randomUtils, GameCheck gameCheck) {
        this.randomUtils = randomUtils;
        this.userInput = userInput;
        this.gameCheck = gameCheck;
    }

    public Outcome startBattle(User player1, AbstractPlayer player2) {
        while (player1.getWins() < 3 && player2.getWins() < 3) {
            setWeaponChoice(player1);
            if (player2 instanceof User) {
                setWeaponChoice((User) player2);
            } else if (player2 instanceof Computer) {
                player2.setWeapon(randomUtils.getRandomWeapon());
            }
            Outcome outcome = gameCheck.getRoundResult(player1, player2);
            setScore(outcome, player1, player2);
            stringUtils.printResult(player1, player2, outcome);
        }
        return player1.getWins() == 3 ? Outcome.WIN : Outcome.LOSS;
    }

    private void setScore(Outcome outcome, User player1, AbstractPlayer player2) {
        if (outcome == Outcome.WIN) {
            player1.setWins(player1.getWins() + 1);
            player2.setLosses(player2.getLosses() + 1);
        }
        if (outcome == Outcome.LOSS) {
            player2.setWins(player2.getWins() + 1);
            player1.setLosses(player1.getLosses() + 1);
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
