package JD14_abstraction_interface_poly.DeviceTask;



public class DeviceShop {
    public static void main(String[] args) {

        Phone phone1 = new Iphone("Iphone","12pro","5.8", 800,"Gray", true, true);

        phone1.turnOff();
        phone1.turnOn();
        phone1.text(234093123);
        phone1.call(234093123);
        ((Iphone) phone1 ).downloadApp();

        Phone phone2 = new Samsung("Samsung", " xs", "7", 900, "White", true,false );

        phone2.call(12304939);
        phone2.text(12304939);
        phone2.turnOn();
        phone2.turnOff();
        ((Samsung)phone2).downloadApp();

        Phone phone3= new Google("Google", "b12", "9", 750, "White", true,false);


        ((Google) phone3).downloadApp();

        Computer computer1 = new PersonalComputer("Mac","Mac air", "13",1000,"Gray", true,true);

        computer1.install();
        computer1.turnOff();
        computer1.turnOn();



    }




}
/*
9. Create a Class Named 'DeviceShop':
    - Instantiate an object from each concrete class.
    - Test all functions of each object.
    - Analyze the relationships between the classes.

 */