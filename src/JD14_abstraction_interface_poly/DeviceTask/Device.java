package JD14_abstraction_interface_poly.DeviceTask;

public abstract class Device {

    private final String BRAND = getClass().getSimpleName();
    private final String MODEL;
    private int price;
    private String color;
    private final String SIZE;
    private boolean hasBattery;
    private boolean hasPowerButton;

    public String getBRAND() {
        return BRAND;
    }

    public String getMODEL() {
        return MODEL;
    }

    public int getPrice() {
        return price;
    }

    public String getSIZE() {
        return SIZE;
    }

    public void setPrice(int price) {
        if (price < 0) {
            throw new RuntimeException("Price must not be 0 or negative");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            throw new RuntimeException("Color must not be null or empty.");
        }
        this.color = color;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public Device(String BRAND, String MODEL, String SIZE, int price, String color, boolean hasBattery, boolean hasPowerButton) {
        if (BRAND == null || BRAND.isEmpty()) {
            throw new RuntimeException(" Brand must not be null or empty.");
        }
        if (MODEL == null || MODEL.isEmpty()) {
            throw new RuntimeException("Model must not be null or empty.");
        }
        if (SIZE == null || SIZE.isEmpty()) {
            throw new RuntimeException(" Size must not be null or empty.");
        }
        this.MODEL = MODEL;
        this.SIZE = SIZE;
        setPrice(price);
        setColor(color);
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);


    }

    public abstract void turnOn();

    public abstract void turnOff();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "BRAND='" + BRAND + '\'' +
                ", MODEL='" + MODEL + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", SIZE='" + SIZE + '\'' +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
/*
1. Create an Abstract Class Named 'Device':
    - Variables:
        - final brand
        - final model
        - price
        - color
        - final size
        - hasBattery
        - hasPowerButton
    - Encapsulate all fields.
    - Constructor: Initializes all fields.
    - Conditions:
        - brand, model, color, and size must not be null or empty.
        - price must be positive.
    - Abstract Methods:
        - turnOn()
        - turnOff()
    - Non-Abstract Method:
        - toString()
 */