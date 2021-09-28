package com.azeam.rps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GameCheckTest {

    @Test
    void test_game_check_tries() {
        GameCheck gameCheck = new GameCheck();

        assertEquals(5, gameCheck.getTries());
    }

    @Test
    void test_game_check_wins() {
        GameCheck gameCheck = new GameCheck();

        assertEquals(3, gameCheck.getWins());
    }
}