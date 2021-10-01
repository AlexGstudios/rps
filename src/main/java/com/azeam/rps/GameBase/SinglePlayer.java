package com.azeam.rps.GameBase;

import com.azeam.rps.App;
import com.azeam.rps.UserInput;
import com.azeam.rps.GameLogic.Outcome;
import com.azeam.rps.Players.Computer;
import com.azeam.rps.Players.User;
import com.azeam.rps.Utils.StringUtils;

public class SinglePlayer extends Game {
    private Computer computer;
    private StringUtils stringUtils = new StringUtils();

    public SinglePlayer(UserInput userInput) {
        super(userInput);
        super.player1 = new User("Player");
        this.computer = new Computer("Computer");
    }

    public void startGame() {
        Outcome outcome = battle.battle(player1, computer);
        stringUtils.printFinalResult(player1, computer, outcome);
        App.newGame();
    }
}
