package com.timshaya.behavioral.strategy;

public class SemiAutomaticFire implements WeaponSystem {
    @Override
    public void fire(String target) {
        try {
            System.out.println("Firing 3-round burst from KEW cannons at " + target);
        } catch (RuntimeException e) {
            System.out.println("Error: Failed to engage target " + target + ". Reason: " + e.getMessage());
        }
    }

}
