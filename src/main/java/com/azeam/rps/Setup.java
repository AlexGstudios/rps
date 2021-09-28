package com.azeam.rps;

public class Setup {

    private static WeaponValues rock = new WeaponValues();
    private static WeaponValues scissors = new WeaponValues();
    private static WeaponValues paper = new WeaponValues();

    public void setup() {
        rock.ID = 0;
        rock.name = "Rock";
        rock.beats = "Scissors";

        scissors.ID = 1;
        scissors.name = "Scissors";
        scissors.beats = "Paper";

        paper.ID = 2;
        paper.name = "Paper";
        paper.beats = "Rock";
    }

    public static WeaponValues getRock() {
        return rock;
    }

    public static WeaponValues getScissors() {
        return scissors;
    }

    public static WeaponValues getPaper() {
        return paper;
    }

    public static String[] weaponds() {
        String[] choices = { getRock().name, getScissors().name, getPaper().name };

        return choices;
    }
}
