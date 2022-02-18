package smarthome;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BulbSpy implements Bulb {
    private boolean turnBulbOn_wasCalled = false;
    private boolean turnBulbOff_wasCalled = false;

    @Override
    public void turnOn() {
        turnBulbOn_wasCalled = true;
    }

    @Override
    public void turnOff() {
        turnBulbOff_wasCalled = true;
    }

    public boolean turnBulbOnWasCalled() {
        return turnBulbOn_wasCalled;
    }

    public boolean turnBulbOffWasCalled() {
        return turnBulbOff_wasCalled;
    }

    public void bulbTurnedOnCorrectly() {
        assertTrue(this.turnBulbOnWasCalled());
        assertFalse(this.turnBulbOffWasCalled());
    }

    public void bulbTurnedOffCorrectly() {
        assertTrue(this.turnBulbOffWasCalled());
        assertFalse(this.turnBulbOnWasCalled());
    }
}
