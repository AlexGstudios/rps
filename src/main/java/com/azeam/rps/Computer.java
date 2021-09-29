package com.azeam.rps;

import com.azeam.rps.Utils.RandomUtils;

public class Computer {
    Weapon weapon;

    public Computer() {
        this.weapon = RandomUtils.getRandomWeapon();
    }

    public Weapon getWeapon() {
        return this.weapon;
    }
}
