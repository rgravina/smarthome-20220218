package smarthome;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SmartHomeTest {
    @Test
    void whenSwitchIsOn_turnBulbOn() {
        BulbSpy bulb = new BulbSpy();
        Switch toggle = new AlwaysOnSwitchStub();

        new SmartHome().run(bulb, toggle);

        assertTrue(bulb.turnBulbOnWasCalled());
    }

    @Test
    void whenSwitchIsOff_turnBulbOff() {
    }
}
