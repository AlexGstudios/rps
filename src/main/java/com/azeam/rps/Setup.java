package com.azeam.rps;

public class Setup {

    private static UserValues rock = new UserValues();
    private static UserValues scissors = new UserValues();
    private static UserValues paper = new UserValues();

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

    public static UserValues getRock() {
        return rock;
    }

    public static UserValues getScissors() {
        return scissors;
    }

    public static UserValues getPaper() {
        return paper;
    }

    public static String[] weaponds() {
        String[] choices = { getRock().name, getScissors().name, getPaper().name };

        return choices;
    }
}
