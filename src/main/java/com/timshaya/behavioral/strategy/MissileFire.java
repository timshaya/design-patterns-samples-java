package com.timshaya.behavioral.strategy;

public class MissileFire implements WeaponSystem {
    @Override
    public void fire(String target) {
        try {
            System.out.println(new StringBuilder("Launching Viper Mark VII missile salvo at ")
                    .append(target));
        } catch (RuntimeException e) {
            System.out.println(String.format("Error: Failed to engage target %s. Reason: %s", target, e.getMessage()));
        }
    }
}
