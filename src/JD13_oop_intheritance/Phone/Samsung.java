package JD13_oop_intheritance.Phone;

public class Samsung extends Iphone {


    public Samsung(String brand, String model, String size, String color, double price) {
        super(brand, model, size, color, price);
    }

    @Override
    public void call(String phoneNumber) {
        super.call(phoneNumber);
    }

    @Override
    public void text(String phoneNumber) {
        super.text(phoneNumber);
    }




}




/*
2. Create a class named 'Samsung' with these specifications:
   Attributes:
       - Same as IPhone.

   Encapsulation:
       - Same conditions as IPhone.

   Constructor:
       - Same as IPhone.

   Actions:
       - call(phoneNumber): Display "calling the number [phoneNumber]".
       - text(phoneNumber): Display "texting to the number [phoneNumber]".
       - toString(): Prints the information of the Samsung object.

 */