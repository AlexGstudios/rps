package com.azeam.rps.Weapons;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.azeam.rps.UserInput;
import com.azeam.rps.Players.User;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WeaponChoiceTest {
    UserInput userInput;
    WeaponChoice weaponChoice;
    User player1;
    User player2;
    User player3;

    @BeforeEach
    void setup() {
        userInput = mock(UserInput.class);
        weaponChoice = new WeaponChoice(userInput);
        player1 = new User("Player 1");
        player2 = new User("Player 2");
        player3 = new User("Player 3");
    }

    @Test
    void player_weapon_choice_success() {
        when(userInput.getInput()).thenReturn("1");
        weaponChoice.setWeaponChoice(player1);
        when(userInput.getInput()).thenReturn("2");
        weaponChoice.setWeaponChoice(player2);
        when(userInput.getInput()).thenReturn("3");
        weaponChoice.setWeaponChoice(player3);

        assertEquals(Weapon.ROCK, player1.getWeapon());
        assertEquals(Weapon.PAPER, player2.getWeapon());
        assertEquals(Weapon.SCISSORS, player3.getWeapon());
    }

    @Test
    void player_weapon_choice_fail() {
        when(userInput.getInput()).thenReturn("99");

        assertThrows(IllegalStateException.class, () -> {
            weaponChoice.setWeaponChoice(player1);
        });
    }
}
