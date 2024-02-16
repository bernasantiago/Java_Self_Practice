package JD14_abstraction_interface_poly.CarTask;

public class Toyota extends Car{

    public Toyota(String MAKE, String MODEL, int YEAR, int price, String color) {
        super(MAKE, MODEL, YEAR, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMAKE() + " is starting.");

    }

    @Override
    public void drive() {
        System.out.println(getMAKE() + " is driving. ");

    }
}
