package com.azeam.rps.Weapons;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.azeam.rps.UserInput;
import com.azeam.rps.Players.Computer;
import com.azeam.rps.Players.User;
import com.azeam.rps.Utils.RandomUtils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WeaponChoiceTest {
    UserInput userInput;
    WeaponChoice weaponChoice;
    User player1;
    User player2;
    Computer computer;
    RandomUtils randomUtils;

    @BeforeEach
    void setup() {
        userInput = mock(UserInput.class);
        randomUtils = mock(RandomUtils.class);
        weaponChoice = new WeaponChoice(userInput, randomUtils);
        player1 = new User("Player 1");
        player2 = new User("Player 2");
        computer = new Computer("Computer");
    }

    @Test
    void pvp_battle_weapon_choice_success() {
        when(userInput.getInput()).thenReturn("1", "2", "1", "2", "1", "2");
        weaponChoice.showWeaponChoices(player1, player2);

        assertEquals(Weapon.ROCK, player1.getWeapon());
        assertEquals(Weapon.PAPER, player2.getWeapon());
    }

    @Test
    void pvc_battle_weapon_choice_success() {
        when(randomUtils.getRandomWeapon()).thenReturn(Weapon.SCISSORS);
        when(userInput.getInput()).thenReturn("1", "1", "1");
        weaponChoice.showWeaponChoices(player1, computer);

        assertEquals(Weapon.ROCK, player1.getWeapon());
        assertEquals(Weapon.SCISSORS, computer.getWeapon());
    }

    @Test
    void pvc_battle_outcome_success() {
        when(randomUtils.getRandomWeapon()).thenReturn(Weapon.SCISSORS);
        when(userInput.getInput()).thenReturn("1", "1", "1");
        weaponChoice.showWeaponChoices(player1, computer);

        assertEquals(3, player1.getWins());
        assertEquals(0, computer.getWins());
        assertEquals(0, player1.getLosses());
        assertEquals(3, computer.getLosses());
    }

    @Test
    void pvp_battle_outcome_success() {
        when(userInput.getInput()).thenReturn("1", "2", "1", "2", "1", "2");
        weaponChoice.showWeaponChoices(player1, player2);

        assertEquals(0, player1.getWins());
        assertEquals(3, player2.getWins());
        assertEquals(3, player1.getLosses());
        assertEquals(0, player2.getLosses());
    }

    @Test
    void player_weapon_choice_fail() {
        when(userInput.getInput()).thenReturn("99");

        assertThrows(IllegalStateException.class, () -> {
            weaponChoice.showWeaponChoices(player1, player2);
        });
    }
}
