package com.azeam.rps.weapons;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.azeam.rps.Weapons.Weapon;
import com.azeam.rps.Weapons.WeaponData;
import com.azeam.rps.Weapons.WeaponValues;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

public class WeaponsDataTest {

    WeaponData weaponData;
    WeaponValues weaponValue;

    @BeforeEach
    void test_setup() {
        weaponData = new WeaponData();
    }

    @Test
    void test_weapon_ROCK() {
        weaponValue = weaponData.getWeaponData(Weapon.ROCK);

        assertEquals(weaponValue.getBeats(), Weapon.SCISSORS);
    }

    @Test
    void test_weapon_PAPER() {
        weaponValue = weaponData.getWeaponData(Weapon.PAPER);

        assertEquals(weaponValue.getBeats(), Weapon.ROCK);
    }

    @Test
    void test_weapon_SCISSOR() {
        weaponValue = weaponData.getWeaponData(Weapon.SCISSORS);

        assertEquals(weaponValue.getBeats(), Weapon.PAPER);
    }
}