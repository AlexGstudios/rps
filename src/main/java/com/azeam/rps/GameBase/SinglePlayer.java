package com.azeam.rps.GameBase;

import com.azeam.rps.App;
import com.azeam.rps.UserInput;
import com.azeam.rps.Players.Computer;
import com.azeam.rps.Players.User;

public class SinglePlayer extends Game {
    private Computer computer;

    public SinglePlayer(UserInput userInput) {
        super(userInput);
        super.player1 = new User("Player");
        this.computer = new Computer("Computer");
    }

    public void startGame() {
        weaponChoice.showWeaponChoices(player1, computer);
        App.newGame();
    }
}
