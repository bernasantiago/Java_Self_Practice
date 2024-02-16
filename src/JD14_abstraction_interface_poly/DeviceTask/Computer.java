package JD14_abstraction_interface_poly.DeviceTask;

public abstract class Computer extends Device {

    public Computer(String BRAND, String MODEL, String SIZE, int price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(BRAND, MODEL, SIZE, price, color, hasBattery, hasPowerButton);
    }

    abstract void install();
}
/*
3. Create a Child Abstract Class of Device Named 'Computer':
    - Add extra methods as needed.
 */