package com.azeam.rps.Utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import com.azeam.rps.GameLogic.Outcome;
import com.azeam.rps.Players.User;
import com.azeam.rps.Weapons.Weapon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    User player1;
    User player2;
    StringUtils result;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setup() {
        player1 = mock(User.class);
        player2 = mock(User.class);
        result = new StringUtils();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void get_score_data() {
        when(player1.getName()).thenReturn("Player 1");
        when(player2.getName()).thenReturn("Player 2");
        when(player1.getWeapon()).thenReturn(Weapon.ROCK);
        when(player2.getWeapon()).thenReturn(Weapon.SCISSORS);
        when(player1.getWins()).thenReturn(1);
        when(player2.getWins()).thenReturn(0);
        when(player1.getLosses()).thenReturn(0);
        when(player2.getLosses()).thenReturn(1);

        Outcome outcome = Outcome.WIN;
        result.printResult(player1, player2, outcome);
        assertThat(outContent.toString(), equalTo(
                "Player 1 selected ROCK and Player 2 selected SCISSORS\nPlayer 1 beats Player 2.\nPlayer 1 wins: 1, losses: 0\nPlayer 2 wins: 0, losses: 1\n\n"));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }
}
