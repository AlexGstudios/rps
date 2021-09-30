package com.azeam.rps.weapons;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.azeam.rps.UserInput;
import com.azeam.rps.Players.User;
import com.azeam.rps.Weapons.Weapon;
import com.azeam.rps.Weapons.WeaponChoice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WeaponChoiceTest {

    UserInput userInput;
    WeaponChoice weaponChoice;
    User player1;
    User player2;

    @BeforeEach
    void test_setup() {
        userInput = mock(UserInput.class);
    }

    @Test
    void test_player_choice() {
        when(userInput.getInput()).thenReturn("1");

        player1 = new User("Player 1");
        player2 = new User("Player 2");

        weaponChoice = new WeaponChoice(userInput);

        weaponChoice.setWeaponChoice(player1);
        weaponChoice.setWeaponChoice(player2);

        assertEquals(Weapon.ROCK, player1.getWeapon());
        assertEquals(Weapon.ROCK, player2.getWeapon());
    }
}
