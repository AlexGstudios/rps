package com.azeam.rps.Weapons;

import com.azeam.rps.Game;
import com.azeam.rps.UserInput;
import com.azeam.rps.GameLogic.GameCheck;
import com.azeam.rps.GameLogic.Outcome;
import com.azeam.rps.GameLogic.StringResult;
import com.azeam.rps.Players.AbstractPlayer;
import com.azeam.rps.Players.Computer;
import com.azeam.rps.Players.User;
import com.azeam.rps.Utils.RandomUtils;

public class WeaponChoice {
    private GameCheck gameCheck = new GameCheck();
    private StringResult stringResult = new StringResult();
    private UserInput userInput;

    public WeaponChoice(UserInput userInput) {
        this.userInput = userInput;
    }

    public void showUserOptions(User player1, AbstractPlayer player2) {
        while (player1.getWins() < 3 && player2.getWins() < 3) {
            setWeaponChoice(player1);
            if (player2 instanceof User) {
                setWeaponChoice((User) player2);
            } else if (player2 instanceof Computer) {
                player2.setWeapon(RandomUtils.getRandomWeapon());
            }
            Outcome result = gameCheck.gameCheck(player1, player2);
            System.out.println(stringResult.getResult(player1, player2, result));
        }
        // TODO: handle with state instead of new game
        Game game = new Game(userInput);
        game.gameMode();
    }

    private void setWeaponChoice(User player) {
        System.out.println(player.getName() + " - Select weapon:\n[1] ROCK\n[2] PAPER\n[3] SCISSORS");
        userInput.setInput();

        switch (userInput.getInput()) {
            case "1" -> player.setWeapon(Weapon.ROCK);
            case "2" -> player.setWeapon(Weapon.PAPER);
            case "3" -> player.setWeapon(Weapon.SCISSORS);
            default -> throw new IllegalStateException("Invalid option");
        }
    }
}
