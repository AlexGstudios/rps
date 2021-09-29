package com.azeam.rps.Players;

import com.azeam.rps.Utils.RandomUtils;

public class Computer extends AbstractPlayer {
    public Computer(String name) {
        super.weapon = RandomUtils.getRandomWeapon();
        super.name = name;
    }
}
