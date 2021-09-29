package com.azeam.rps.Weapon;

import com.azeam.rps.Game;
import com.azeam.rps.GameCheck;
import com.azeam.rps.UserInput;
import com.azeam.rps.Players.AbstractPlayer;
import com.azeam.rps.Players.User;

public class WeaponChoice {
    private GameCheck gameCheck = new GameCheck();
    private UserInput userInput;

    public WeaponChoice(UserInput userInput) {
        this.userInput = userInput;
    }

    public void showUserOptions(AbstractPlayer player1, AbstractPlayer player2) {
        while (player1.getWins() < 3 && player2.getWins() < 3) {
            setWeaponChoice(player1);
            if (player2 instanceof User) {
                setWeaponChoice(player2);
            }
            System.out.println(player1.getName() + " selected: " + player1.getWeapon() + " and " + player2.getName()
                    + " selected " + player2.getWeapon());
            String result = gameCheck.gameCheck(player1, player2);
            System.out.println(result);
        }
        Game game = new Game();
        game.gameMode();
    }

    public void setWeaponChoice(AbstractPlayer player) {
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
