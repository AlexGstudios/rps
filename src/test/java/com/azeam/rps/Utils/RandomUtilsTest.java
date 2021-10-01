package com.azeam.rps.Utils;

import static org.hamcrest.MatcherAssert.assertThat;

import com.azeam.rps.Players.Computer;
import com.azeam.rps.Weapons.Weapon;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RandomUtilsTest {
    Computer computer;
    RandomUtils randomUtils;

    @BeforeEach
    void setup() {
        randomUtils = new RandomUtils();
    }

    @Test
    public void get_random_weapon() {
        Weapon weapon = randomUtils.getRandomWeapon();

        assertThat(weapon, Matchers.either(Matchers.is(Weapon.ROCK)).or(Matchers.is(Weapon.PAPER))
                .or(Matchers.is(Weapon.SCISSORS)));
    }
}
