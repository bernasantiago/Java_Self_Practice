package JD14_abstraction_interface_poly.DeviceTask;

public class Iphone extends Phone implements Downloadable,AppleApps{


    public Iphone(String BRAND, String MODEL, String SIZE, int price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(BRAND, MODEL, SIZE, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Iphone is turning on.");

    }

    @Override
    public void turnOff() {
        System.out.println("Iphone is turning on.");


    }

    @Override
    public void downloadApp() {
        System.out.println("Iphone is downloading the app from " + appStoreName + " by using" + OS);
    }

}
/*
 - 'Iphone':
        - Extends Phone class.
        - Implements Downloadable & AppleApps interfaces.
 */