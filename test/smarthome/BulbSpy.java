package smarthome;

public class BulbSpy implements Bulb {
    private boolean turnBulbOn_wasCalled = false;

    @Override
    public void turnOn() {
        turnBulbOn_wasCalled = true;
    }

    @Override
    public void turnOff() {
    }

    public boolean turnBulbOnWasCalled() {
        return turnBulbOn_wasCalled;
    }
}
