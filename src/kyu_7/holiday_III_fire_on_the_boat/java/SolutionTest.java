package kyu_7.holiday_III_fire_on_the_boat.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void basicTest() {
        String case1 = "Boat Rudder Mast Boat Hull Water ~~ Boat Deck Hull ~~ Propeller Deck ~~ Deck Boat Mast";
        String case2 = "Mast Deck Engine Water ~~";
        String case3 = "~~ Deck Engine Sail Deck ~~ ~~ ~~ Rudder ~~ Boat ~~ ~~ Captain";
        assertEquals(case1, CodeWars.fireFight("Boat Rudder Mast Boat Hull Water Fire Boat Deck Hull Fire Propeller Deck Fire Deck Boat Mast"));
        assertEquals(case2, CodeWars.fireFight("Mast Deck Engine Water Fire"));
        assertEquals(case3, CodeWars.fireFight("Fire Deck Engine Sail Deck Fire Fire Fire Rudder Fire Boat Fire Fire Captain"));

    }
}

