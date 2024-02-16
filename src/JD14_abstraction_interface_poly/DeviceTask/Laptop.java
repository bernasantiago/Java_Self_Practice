package JD14_abstraction_interface_poly.DeviceTask;

public class Laptop extends Computer{


    public Laptop(String BRAND, String MODEL, String SIZE, int price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(BRAND, MODEL, SIZE, price, color, hasBattery, hasPowerButton);
    }

    @Override
    void install() {
        System.out.println("Installing the app on my laptop");
    }

    @Override
    public void turnOn() {
        System.out.println("Laptop is on");

    }

    @Override
    public void turnOff() {
        System.out.println("Laptop is off");

    }
}
