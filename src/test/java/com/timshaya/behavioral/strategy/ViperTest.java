package com.timshaya.behavioral.strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.any;

public class ViperTest {

    @Mock
    private WeaponSystem mockWeaponSystem;

    private Viper viper;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        viper = new Viper(mockWeaponSystem);
    }

    @Test
    void testAttack() {
        String target = "Cylon Raider";
        viper.attack(target);
        verify(mockWeaponSystem).fire(target);
    }

    @Test
    void testChangeWeaponType() {
        WeaponSystem newWeaponSystem = mock(WeaponSystem.class);
        viper.changeWeaponType(newWeaponSystem);

        String target = "Enemy Base";
        viper.attack(target);
        verify(newWeaponSystem).fire(target);
        verify(mockWeaponSystem, never()).fire(any());
    }

}