package com.azeam.rps.GameLogic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.azeam.rps.UserInput;
import com.azeam.rps.Players.Computer;
import com.azeam.rps.Players.User;
import com.azeam.rps.Utils.RandomUtils;
import com.azeam.rps.Weapons.Weapon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BattleTest {
    UserInput userInput;
    Battle battle;
    User player1;
    User player2;
    Computer computer;
    RandomUtils randomUtils;
    GameCheck gameCheck;

    @BeforeEach
    void setup() {
        userInput = mock(UserInput.class);
        randomUtils = mock(RandomUtils.class);
        gameCheck = mock(GameCheck.class);
        battle = new Battle(userInput, randomUtils, gameCheck);
        player1 = new User("Player 1");
        player2 = new User("Player 2");
        computer = new Computer("Computer");
    }

    @Test
    void pvp_battle_weapon_choice_success() {
        when(userInput.getInput()).thenReturn("1", "2", "1", "2", "1", "2");
        when(gameCheck.getRoundResult(player1, player2)).thenReturn(Outcome.WIN);

        battle.startBattle(player1, player2);

        assertEquals(Weapon.ROCK, player1.getWeapon());
        assertEquals(Weapon.PAPER, player2.getWeapon());
    }

    @Test
    void pvc_battle_weapon_choice_success() {
        when(randomUtils.getRandomWeapon()).thenReturn(Weapon.SCISSORS);
        when(userInput.getInput()).thenReturn("1");
        when(gameCheck.getRoundResult(player1, computer)).thenReturn(Outcome.WIN);
        battle.startBattle(player1, computer);

        assertEquals(Weapon.ROCK, player1.getWeapon());
        assertEquals(Weapon.SCISSORS, computer.getWeapon());
    }

    @Test
    void pvc_battle_outcome_success() {
        when(randomUtils.getRandomWeapon()).thenReturn(Weapon.SCISSORS);
        when(userInput.getInput()).thenReturn("1");
        when(gameCheck.getRoundResult(player1, computer)).thenReturn(Outcome.WIN);
        Outcome result = battle.startBattle(player1, computer);

        assertEquals(Outcome.WIN, result);
    }

    @Test
    void pvp_battle_outcome_success() {
        when(userInput.getInput()).thenReturn("1", "3", "1", "3", "1", "3");
        when(gameCheck.getRoundResult(player1, player2)).thenReturn(Outcome.WIN);
        Outcome result = battle.startBattle(player1, player2);

        assertEquals(Outcome.WIN, result);
    }

    @Test
    void player_weapon_choice_fail() {
        when(userInput.getInput()).thenReturn("99");

        assertThrows(IllegalStateException.class, () -> {
            battle.startBattle(player1, player2);
        });
    }
}
