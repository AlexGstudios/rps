package com.azeam.rps.GameLogic;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import com.azeam.rps.Players.Computer;
import com.azeam.rps.Players.User;
import com.azeam.rps.Weapons.Weapon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameCheckTest {

    private Computer computer;
    private User player1;
    private User player2;
    private GameCheck gameCheck;

    @BeforeEach
    public void setup() {
        player1 = mock(User.class);
        player2 = mock(User.class);
        computer = mock(Computer.class);
        gameCheck = new GameCheck();
    }

    @Test
    public void rock_beats_scissors() {
        when(player1.getWeapon()).thenReturn(Weapon.ROCK);
        when(player2.getWeapon()).thenReturn(Weapon.SCISSORS);
        when(computer.getWeapon()).thenReturn(Weapon.SCISSORS);

        assertThat(gameCheck.gameCheck(player1, player2), equalTo(Outcome.WIN));
        assertThat(gameCheck.gameCheck(player2, player1), equalTo(Outcome.LOSS));
        assertThat(gameCheck.gameCheck(player1, computer), equalTo(Outcome.WIN));
    }

    @Test
    public void scissors_beats_paper() {
        when(player1.getWeapon()).thenReturn(Weapon.SCISSORS);
        when(player2.getWeapon()).thenReturn(Weapon.PAPER);
        when(computer.getWeapon()).thenReturn(Weapon.PAPER);

        assertThat(gameCheck.gameCheck(player1, player2), equalTo(Outcome.WIN));
        assertThat(gameCheck.gameCheck(player2, player1), equalTo(Outcome.LOSS));
        assertThat(gameCheck.gameCheck(player1, computer), equalTo(Outcome.WIN));
    }

    @Test
    public void paper_beats_rock() {
        when(player1.getWeapon()).thenReturn(Weapon.PAPER);
        when(player2.getWeapon()).thenReturn(Weapon.ROCK);
        when(computer.getWeapon()).thenReturn(Weapon.ROCK);

        assertThat(gameCheck.gameCheck(player1, player2), equalTo(Outcome.WIN));
        assertThat(gameCheck.gameCheck(player2, player1), equalTo(Outcome.LOSS));
        assertThat(gameCheck.gameCheck(player1, computer), equalTo(Outcome.WIN));
    }

    @Test
    public void same_type_draws() {
        when(player1.getWeapon()).thenReturn(Weapon.PAPER);
        when(player2.getWeapon()).thenReturn(Weapon.PAPER);
        when(computer.getWeapon()).thenReturn(Weapon.PAPER);

        assertThat(gameCheck.gameCheck(player1, player2), equalTo(Outcome.DRAW));
        assertThat(gameCheck.gameCheck(player2, player1), equalTo(Outcome.DRAW));
        assertThat(gameCheck.gameCheck(player1, computer), equalTo(Outcome.DRAW));

        when(player1.getWeapon()).thenReturn(Weapon.ROCK);
        when(player2.getWeapon()).thenReturn(Weapon.ROCK);
        when(computer.getWeapon()).thenReturn(Weapon.ROCK);

        assertThat(gameCheck.gameCheck(player1, player2), equalTo(Outcome.DRAW));
        assertThat(gameCheck.gameCheck(player2, player1), equalTo(Outcome.DRAW));
        assertThat(gameCheck.gameCheck(player1, computer), equalTo(Outcome.DRAW));

        when(player1.getWeapon()).thenReturn(Weapon.SCISSORS);
        when(player2.getWeapon()).thenReturn(Weapon.SCISSORS);
        when(computer.getWeapon()).thenReturn(Weapon.SCISSORS);

        assertThat(gameCheck.gameCheck(player1, player2), equalTo(Outcome.DRAW));
        assertThat(gameCheck.gameCheck(player2, player1), equalTo(Outcome.DRAW));
        assertThat(gameCheck.gameCheck(player1, computer), equalTo(Outcome.DRAW));

    }
}
