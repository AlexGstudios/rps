package com.azeam.rps;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameTest {

    UserInput userInput;

    @BeforeEach
    void test_setup() {
        userInput = mock(UserInput.class);
    }

    @Test
    void integration_test_single_player_choice() {
        when(userInput.getInput()).thenReturn("1");

        GameFactory gameFactory = new GameFactory(userInput);
        Game game = gameFactory.createGame();

        assertTrue(game instanceof SinglePlayer);
        assertFalse(game instanceof MultiPlayer);
    }

    @Test
    void integration_test_multi_player_choice() {
        when(userInput.getInput()).thenReturn("2");

        GameFactory gameFactory = new GameFactory(userInput);
        Game game = gameFactory.createGame();

        assertTrue(game instanceof MultiPlayer);
        assertFalse(game instanceof SinglePlayer);
    }
}