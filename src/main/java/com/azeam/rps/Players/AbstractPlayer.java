package com.azeam.rps.Players;

import com.azeam.rps.Weapons.Weapon;

import lombok.Data;

@Data
public abstract class AbstractPlayer {
    Weapon weapon;
    int wins = 0;
    int losses = 0;
    String name;
}
