package JD14_abstraction_interface_poly.DeviceTask;

public abstract class Phone extends Device {


    public Phone(String BRAND, String MODEL, String SIZE, int price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(BRAND, MODEL, SIZE, price, color, hasBattery, hasPowerButton);
    }

    public long call (long phoneNum){
        return phoneNum;
    }

    public long text(long phoneNum){
        return phoneNum;
    }


}
/*
2. Create a Child Abstract Class of Device Named 'Phone':
    - Extra Non-Abstract Methods:
        - call(long phoneNum)
        - text(long phoneNum)
        - toString()
 */