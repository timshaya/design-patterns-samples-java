package com.timshaya.behavioral.strategy;

public class Viper {
    private WeaponSystem weaponStrategy;

    public Viper(WeaponSystem weaponStrategy) {
        this.weaponStrategy = weaponStrategy;
    }

    public void attack(String target) {
        weaponStrategy.fire(target);
    }

    public void changeWeaponType(WeaponSystem newStrategy) {
        this.weaponStrategy = newStrategy;
        System.out.println("Tactical computer: Weapon system reconfigured");
    }
}
