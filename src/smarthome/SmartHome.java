package smarthome;

interface Bulb {
    void turnOn();
    void turnOff();
}

interface Switch {
    boolean isOn();
}

public class SmartHome {
    void run(Bulb bulb, Switch toggle) {
        if (toggle.isOn()) {
            bulb.turnOn();
        }
    }
}
