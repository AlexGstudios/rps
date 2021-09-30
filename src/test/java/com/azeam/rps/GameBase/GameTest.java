package com.azeam.rps.GameBase;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.azeam.rps.UserInput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameTest {
    GameBuilder gameBuilder;
    UserInput userInput;
    Game game;

    @BeforeEach
    void test_setup() {
        userInput = mock(UserInput.class);
        gameBuilder = new GameBuilder(userInput);
    }

    @Test
    void integration_test_single_player_choice() {
        when(userInput.getInput()).thenReturn("1");
        game = gameBuilder.createGame();

        assertTrue(game instanceof SinglePlayer);
        assertFalse(game instanceof MultiPlayer);
    }

    @Test
    void integration_test_multi_player_choice() {
        when(userInput.getInput()).thenReturn("2");
        game = gameBuilder.createGame();

        assertTrue(game instanceof MultiPlayer);
        assertFalse(game instanceof SinglePlayer);
    }

    @Test
    void integration_test_quit_choice() {
        when(userInput.getInput()).thenReturn("3");
        game = gameBuilder.createGame();

        assertNull(game);
    }

    @Test
    void integration_test_illegal_choice() {
        when(userInput.getInput()).thenReturn("99");
        assertThrows(IllegalStateException.class, () -> {
            game = gameBuilder.createGame();
        });
    }
}