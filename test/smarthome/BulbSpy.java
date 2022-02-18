package smarthome;

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
}
