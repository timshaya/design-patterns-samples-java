package com.timshaya.creational.factory;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class StarFighterFactoryTest {

    @Test
    void testCreateColonialStarFighter() {
        Fleet colonialFleet = new ColonialFleet("Viper");
        StarFighter fighter = StarFighterFactory.createStarFighter(colonialFleet);
        assertNotNull(fighter);
        assertEquals("Viper", fighter.getShipModelName());
    }

    @Test
    void testCreateCylonStarFighter() {
        Fleet cylonFleet = new CylonFleet("Raider");
        StarFighter fighter = StarFighterFactory.createStarFighter(cylonFleet);
        assertNotNull(fighter);
        assertEquals("Raider", fighter.getShipModelName());
    }

    @Test
    void testCreateStarFighterWithNullInput() {
        StarFighter fighter = StarFighterFactory.createStarFighter(null);
        assertNull(fighter);
    }


    @Test
    void testCreateStarFighterWithUnknownFleetType() {
        Fleet unknownFleet = new Fleet() {};
        StarFighter fighter = StarFighterFactory.createStarFighter(unknownFleet);
        assertNull(fighter);
    }
}
