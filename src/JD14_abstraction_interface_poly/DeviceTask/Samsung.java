package JD14_abstraction_interface_poly.DeviceTask;

public class Samsung extends Phone implements Downloadable,AndroidApps {

    public Samsung(String BRAND, String MODEL, String SIZE, int price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(BRAND, MODEL, SIZE, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Samsung is turning on");

    }

    @Override
    public void turnOff() {
        System.out.println("Samsung is turning off");

    }

    @Override
    public void downloadApp() {
        System.out.println("Samsung phone is downloading the app from" + appStoreName + " by using " + OS);

    }
}
/*
 - 'Samsung':
        - Extends Phone class.
        - Implements Downloadable & AndroidApps interfaces.
    - 'Google':
 */