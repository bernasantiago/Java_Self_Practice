package JD14_abstraction_interface_poly.CarTask;

public class Audi extends Car implements AutoPark {

    public Audi(String MAKE, String MODEL, int YEAR, int price, String color) {
        super(MAKE, MODEL, YEAR, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMAKE() + " has auto park");
    }

    @Override
    public void start() {
        System.out.println(getMAKE() + " is starting.");

    }

    @Override
    public void drive() {
        System.out.println(getMAKE() + " is driving.");

    }
}
