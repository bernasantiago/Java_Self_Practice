package JD14_abstraction_interface_poly.CarTask;

public class CarClients {
    public static void main(String[] args) {

        Car car1 = new Honda("Honda", "Civic", 2010, 10_000, "Gray");

        car1.drive();
        car1.start();
        car1.stop();

        Car car2 = new Mercedes("Mercedes", "Gta roadster", 2020, 30_000, "pink");

        car2.start();
        car2.stop();
        ((Mercedes) car2).autoPark();
        car2.drive();

        Car car3 = new Nio("Nio", "SD03", 2015, 5_000, "White");

        car3.drive();
        car3.start();
        car3.stop();
        ((Nio) car3).autoPark();
        ((Nio) car3).selfDrive();

        Car car4 = new Tesla("Tesla", "x", 2023, 35_000, "Red");

        car4.stop();
        car4.start();
        car4.drive();
        ((Tesla) car4).selfDrive();
        ((Tesla) car4).autoPark();

        Car car5 = new Toyota("Toyota", "Cambry", 2018, 15_000, "Silver");

        car5.drive();
        car5.stop();
        car5.start();

        Car car6 = new Audi("Audi", "RS", 2010, 3_000,"Black");

        car6.start();
        car6.stop();
        car6.drive();
        ((Audi)car6).autoPark();

        Car car7 = new CydeoCar("Cydeo", "Java", 2024,10_000,"Blue");

        car7.drive();
        car7.stop();
        car7.start();
        ((CydeoCar)car7).selfDrive();
        ((CydeoCar)car7).autoPark();
        ((CydeoCar)car7).fly();



    }
}
/*
11. Create a Class Named 'CarClients':
    - Instantiate an object from each concrete class.
    - Test all functions of each object.
    - Analyze the relationships between the classes.

 */