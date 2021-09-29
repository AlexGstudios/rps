package com.azeam.rps;

import com.azeam.rps.Weapon.Weapon;

public class SinglePlayer {

    private User user;
    private Computer computer;
    private GameCheck gameCheck = new GameCheck();
    private UserInput userInput;

    public SinglePlayer(UserInput userInput) {
        user = new User();
        computer = new Computer();
        this.userInput = userInput;
    }

    void showUserOptions() {
        while (user.getWins() < 3 && computer.getWins() < 3) {
            System.out.println("Select weapon:\n[1] ROCK\n[2] PAPER\n[3] SCISSORS");
            userInput.setInput();
            String input = userInput.getInput();

            switch (input) {
                case "1" -> user.setWeapon(Weapon.ROCK);
                case "2" -> user.setWeapon(Weapon.PAPER);
                case "3" -> user.setWeapon(Weapon.SCISSORS);
            }
            System.out.println("User selected: " + user.getWeapon() + " and computer selected " + computer.getWeapon());
            String result = gameCheck.gameCheck(user, computer);
            System.out.println(result);
        }
    }
}
