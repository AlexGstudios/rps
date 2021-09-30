package com.azeam.rps;

import com.azeam.rps.Players.Computer;
import com.azeam.rps.Players.User;

public class SinglePlayer extends Game {
    private Computer computer;

    public SinglePlayer(UserInput userInput) {
        super(userInput);
        super.player1 = new User("Player");
        this.computer = new Computer("Computer");
    }

    public void showUserOptions() {
        weaponChoice.showUserOptions(player1, computer);
    }
}
