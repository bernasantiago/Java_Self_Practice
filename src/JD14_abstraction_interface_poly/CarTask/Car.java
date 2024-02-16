package JD14_abstraction_interface_poly.CarTask;

public abstract class Car {

    private final String MAKE;
    private final String MODEL;
    private final int YEAR;
    private int price;
    private String color;

    public Car(String MAKE, String MODEL, int YEAR, int price, String color) {
        if (MAKE == null || MAKE.isEmpty()){
            throw new RuntimeException("Make must not be null or empty.");
        }
        if (MODEL == null || MODEL.isEmpty()){
            throw new RuntimeException("Model must not be null or empty");
        }
        if (color == null ||  color.isEmpty()){
            throw new RuntimeException("Color must not be null or empty");
        }
        if (YEAR < 1886){
            throw new RuntimeException("Year  must not be less than 1886");
        }
        this.MAKE = MAKE;
        this.MODEL = MODEL;
        this.YEAR = YEAR;
        setPrice(price);
        setColor(color);
    }



    public String getMAKE() {
        return MAKE;
    }

    public String getMODEL() {
        return MODEL;
    }

    public int getYEAR() {
        return YEAR;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price <0){
            throw new RuntimeException("price must not be negative");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void start();

    public abstract void drive();

    public void stop(){
        System.out.println(getMAKE() + " is stopping. ");

    }




    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "MAKE='" + MAKE + '\'' +
                ", MODEL='" + MODEL + '\'' +
                ", YEAR=" + YEAR +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

/*
1. Create an Abstract Class Named 'Car':
    - Variables:
        - final make
        - final model
        - final year
        - price
        - color
    - Encapsulate all fields.
    - Constructor: Initializes all fields.
    - Conditions for setting fields:
        - make, model, color must not be null or empty.
        - year must not be less than 1886.
        - price must not be negative.
    - Abstract Methods:
        - start()
        - drive()
    - Non-Abstract Methods:
        - stop()
        - toString()
 */