package JD14_abstraction_interface_poly.DeviceTask;

public class Desktop extends Computer{


    public Desktop(String BRAND, String MODEL, String SIZE, int price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(BRAND, MODEL, SIZE, price, color, hasBattery, hasPowerButton);
    }

    @Override
    void install() {
        System.out.println("Installing the app on desktop");

    }

    @Override
    public void turnOn() {
        System.out.println("Desktop is on");

    }

    @Override
    public void turnOff() {
        System.out.println("Desktop is off");

    }
}
