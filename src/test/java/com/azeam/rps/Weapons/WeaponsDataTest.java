package com.azeam.rps.Weapons;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WeaponsDataTest {
    WeaponData weaponData;
    WeaponValues weaponValue;

    @BeforeEach
    void setup() {
        weaponData = new WeaponData();
    }

    @Test
    void weapon_ROCK_beats_SCISSORS() {
        weaponValue = weaponData.getWeaponData(Weapon.ROCK);

        assertEquals(weaponValue.getBeats(), Weapon.SCISSORS);
    }

    @Test
    void weapon_PAPER_beats_ROCK() {
        weaponValue = weaponData.getWeaponData(Weapon.PAPER);

        assertEquals(weaponValue.getBeats(), Weapon.ROCK);
    }

    @Test
    void weapon_SCISSOR_beats_PAPER() {
        weaponValue = weaponData.getWeaponData(Weapon.SCISSORS);

        assertEquals(weaponValue.getBeats(), Weapon.PAPER);
    }
}