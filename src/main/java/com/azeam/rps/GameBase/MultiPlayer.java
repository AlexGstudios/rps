package com.azeam.rps.GameBase;

import com.azeam.rps.App;
import com.azeam.rps.UserInput;
import com.azeam.rps.GameLogic.Outcome;
import com.azeam.rps.Players.User;
import com.azeam.rps.Utils.StringUtils;

public class MultiPlayer extends Game {
    private User player2;
    private StringUtils stringUtils = new StringUtils();

    public MultiPlayer(UserInput userInput) {
        super(userInput);
        super.player1 = new User("Player 1");
        this.player2 = new User("Player 2");
    }

    @Override
    public void startGame() {
        Outcome outcome = battle.battle(player1, player2);
        stringUtils.printFinalResult(player1, player2, outcome);
        App.newGame();
    }
}
