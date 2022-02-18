package smarthome;


import org.junit.jupiter.api.Test;

public class SmartHomeTest {
    @Test
    void whenSwitchIsOn_turnBulbOn() {
        BulbSpy bulb = new BulbSpy();
        Switch toggle = new AlwaysOnSwitchStub();

        new SmartHome().run(bulb, toggle);

        bulb.bulbTurnedOnCorrectly();
    }

    @Test
    void whenSwitchIsOff_turnBulbOff() {
        BulbSpy bulb = new BulbSpy();
        Switch toggle = new AlwaysOffSwitchStub();

        new SmartHome().run(bulb, toggle);

        bulb.bulbTurnedOffCorrectly();
    }
}
