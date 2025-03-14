package com.timshaya.behavioral.strategy;

public class FullyAutomaticFire implements WeaponSystem {
    @Override
    public void fire(String target) {
        try {
            System.out.println(new StringBuilder("Sustained barrage from rotating autocannons at ")
                    .append(target));
        } catch (RuntimeException e) {
            System.out.println(String.format("Error: Failed to engage target %s. Reason: %s", target, e.getMessage()));
        }
    }
}
