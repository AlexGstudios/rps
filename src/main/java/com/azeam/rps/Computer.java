package com.azeam.rps;

import com.azeam.rps.Utils.RandomUtils;
import com.azeam.rps.Weapon.Weapon;

import lombok.Data;

@Data
public class Computer {
    Weapon weapon;
    int wins = 0;
    int losses = 0;

    public Computer() {
        this.weapon = RandomUtils.getRandomWeapon();
    }

    public void setWeapon() {
        this.weapon = RandomUtils.getRandomWeapon();
    }
}
