package com.timshaya.creational.factory;

import java.util.Map;
import java.util.HashMap;
import org.jetbrains.annotations.Nullable;

public class StarFighterFactory {
    private static final Map<Class<? extends Fleet>, String> fleetToModelMap = new HashMap<>();

    static {
        fleetToModelMap.put(ColonialFleet.class, "Viper");
        fleetToModelMap.put(CylonFleet.class, "Raider");
    }

    @Nullable
    public static StarFighter createStarFighter(Fleet fleet) {
        if (fleet == null) {
            System.out.println("Error: createStarFighter() requires a non-null Fleet");
            return null;
        }

        String modelName = fleetToModelMap.get(fleet.getClass());
        if (modelName != null) {
            return new StarFighter(modelName);
        }

        System.out.println("No fleet specified or unknown fleet type");
        return null;
    }
}