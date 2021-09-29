package com.azeam.rps.Utils;

import java.util.Random;

import com.azeam.rps.Weapons.Weapon;

public class RandomUtils {
    public static Weapon getRandomWeapon() {
        return Weapon.values()[new Random().nextInt(Weapon.values().length)];
    }
}
