package JD14_abstraction_interface_poly.DeviceTask;

public class Google extends Phone implements Downloadable,AndroidApps {

    public Google(String BRAND, String MODEL, String SIZE, int price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(BRAND, MODEL, SIZE, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Google is turning on");

    }

    @Override
    public void turnOff() {
        System.out.println("Google is turning off");

    }

    @Override
    public void downloadApp() {
        System.out.println("Google is downloading the app.");

    }
}
/*
- 'Google':
        - Extends Phone class.
        - Implements Downloadable & AndroidApps interfaces.

 */