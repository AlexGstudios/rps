package com.azeam.rps;

public class SinglePlayer {

    private String userInput;
    private User user;
    private Computer computer;

    public SinglePlayer() {
        user = new User();
        computer = new Computer();
        showUserOptions();
    }

    private void showUserOptions() {
        System.out.println("Select weapon:\n[1] ROCK\n[2] PAPER\n[3] SCISSORS");
        UserInput.setInput();
        userInput = UserInput.getInput();

        switch (userInput) {
            case "1" -> user.setWeapon(Weapon.ROCK);
            case "2" -> user.setWeapon(Weapon.PAPER);
            case "3" -> user.setWeapon(Weapon.SCISSORS);
        }
        System.out.println("User selected: " + user.getWeapon() + " and computer selected " + computer.getWeapon());
    }

    // TODO: koppla dator mot spelare
    // kolla val med getInput() från UserInput
    // skicka in i gameCheck -> kolla vem som vinner

}
