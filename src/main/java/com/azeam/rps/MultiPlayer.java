package com.azeam.rps;

import com.azeam.rps.Players.User;

public class MultiPlayer extends Game {
    private User player2;

    public MultiPlayer(UserInput userInput) {
        super(userInput);
        super.player1 = new User("Player 1");
        this.player2 = new User("Player 2");
    }

    @Override
    public void showUserOptions() {
        weaponChoice.showUserOptions(player1, player2);
    }
}
