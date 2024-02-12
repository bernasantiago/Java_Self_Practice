package JD13_oop_intheritance.Phone;

public class PhoneClients {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone", "12pro", "5.78", "Gray", 1000);



        System.out.println(iphone);

        iphone.call("858-320-0000");
        iphone.text("858-320-0000");
        iphone.faceTime("858-320-0000");

       // iphone.setBrand("");  // restriction



        System.out.println("-----------------------------------------");

        Samsung samsung = new Samsung("Samsung","Galaxy A54", "6.4", "White", 800);

        System.out.println(samsung);
        samsung.call("901-234-8998");
        samsung.text("901-234-8998");

       //  samsung.setModel(null);   //restriction




    }



}
/*
4. Create a class named "PhoneClients":
   - Create multiple objects representing different phones.
   - Test the methods and variables of each object.

 */
