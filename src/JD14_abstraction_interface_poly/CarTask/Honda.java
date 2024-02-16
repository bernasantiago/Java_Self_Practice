package JD14_abstraction_interface_poly.CarTask;

public class Honda extends Car{
    public Honda(String MAKE, String MODEL, int YEAR, int price, String color) {
        super(MAKE, MODEL, YEAR, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMAKE() + " is starting");

    }

    @Override
    public void drive() {
        System.out.println(getMAKE() + " is driving");

    }
}
/*
6. Create a Subclass of Car Named 'Honda'.
 */