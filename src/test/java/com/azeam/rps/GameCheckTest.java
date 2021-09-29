package com.azeam.rps;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class GameCheckTest {

    GameCheck gameCheck;

    @BeforeAll
    void test_setup() {
        gameCheck = new GameCheck();
    }

    @Test
    void test_game_check_wins() {
        // assertEquals(3, gameCheck.getWins());
    }
}