package com.azeam.rps.Weapon;

public class WeaponData {

    private WeaponValues weaponValues;

    public WeaponValues getWeaponData(Weapon weapon) {
        switch (weapon) {
            case ROCK -> weaponValues = new WeaponValues(Weapon.ROCK, Weapon.SCISSORS);
            case PAPER -> weaponValues = new WeaponValues(Weapon.PAPER, Weapon.ROCK);
            case SCISSORS -> weaponValues = new WeaponValues(Weapon.SCISSORS, Weapon.PAPER);
        }
        return weaponValues;
    }
}
