package JD14_abstraction_interface_poly.DeviceTask;

public class PersonalComputer extends Computer{


    public PersonalComputer(String BRAND, String MODEL, String SIZE, int price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(BRAND, MODEL, SIZE, price, color, hasBattery, hasPowerButton);
    }

    @Override
    void install() {
        System.out.println("My personal computer is installing");
    }

    @Override
    public void turnOn() {
        System.out.println("My personal computer is turning on");

    }

    @Override
    public void turnOff() {
        System.out.println("My personal computer is turning off");

    }
}
