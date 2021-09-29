package com.azeam.rps;

import com.azeam.rps.Weapon.Weapon;

import lombok.Data;

@Data
public class User {
    Weapon weapon;
    int wins = 0;
    int losses = 0;
}
