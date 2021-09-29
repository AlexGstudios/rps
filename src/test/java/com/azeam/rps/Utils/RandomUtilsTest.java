package com.azeam.rps.Utils;

import static org.hamcrest.MatcherAssert.assertThat;

import com.azeam.rps.Players.Computer;
import com.azeam.rps.Weapon.Weapon;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class RandomUtilsTest {
    Computer computer;

    @Test
    public void get_random_weapon() {
        computer = new Computer();
        Weapon weapon = computer.getWeapon();

        assertThat(weapon, Matchers.either(Matchers.is(Weapon.ROCK)).or(Matchers.is(Weapon.PAPER))
                .or(Matchers.is(Weapon.SCISSORS)));
    }
}
