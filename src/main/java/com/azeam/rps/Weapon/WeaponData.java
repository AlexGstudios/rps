package com.azeam.rps.Weapon;

public class WeaponData {

    private WeaponValues weaponValues;

    public WeaponValues getWeaponData(Weapon weapon) {
        switch (weapon) {
            case ROCK -> weaponValues = new WeaponValues(0, Weapon.ROCK, Weapon.SCISSORS);
            case PAPER -> weaponValues = new WeaponValues(0, Weapon.PAPER, Weapon.ROCK);
            case SCISSORS -> weaponValues = new WeaponValues(0, Weapon.SCISSORS, Weapon.PAPER);
        }
        return weaponValues;
    }
}
