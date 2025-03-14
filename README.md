This is a Gradle project written in Java.

Run the unit tests to execute the code. For example, see the relevant /test files for the Factory pattern: 

```java

    @Test
    void testCreateCylonStarFighter() {
        Fleet cylonFleet = new CylonFleet("Raider");
        StarFighter fighter = StarFighterFactory.createStarFighter(cylonFleet);
        assertNotNull(fighter);
        assertEquals("Raider", fighter.getShipModelName());
    }

```
