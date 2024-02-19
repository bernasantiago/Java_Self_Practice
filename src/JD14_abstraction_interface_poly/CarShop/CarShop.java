package JD14_abstraction_interface_poly.CarShop;

import JD14_abstraction_interface_poly.CarTask.Audi;
import JD14_abstraction_interface_poly.CarTask.Car;
import JD14_abstraction_interface_poly.CarTask.Honda;
import JD14_abstraction_interface_poly.CarTask.Tesla;

import java.util.ArrayList;
import java.util.Arrays;

public class CarShop {

    public static void main(String[] args) {

        Car[] cars = {
                new Honda("Pilot", "White", 2010, 25000),
                new Audi("Q6", "Red", 2014, 32000),
                new Honda("Accord", "White", 2011, 20000),
                new Audi("Q4", "Blue", 2015, 33000),
                new Audi("A7", "Black", 2019, 35000),
                new Audi("Q8", "White", 2018, 40000),
                new Audi("Q5", "Purple", 2009, 30000),
                new Audi("A4", "Black", 2011, 30000),
                new Honda("Civic", "Red", 2018, 30000),
                new Honda("CR-V", "Red", 2012, 23000),
                new Honda("HR-V", "Blue", 2019, 35000),
                new Tesla("Model 3", "White", 2015, 45000),
                new Tesla("Model Y", "Black", 2017, 65000),
                new Tesla("Model X", "White", 2016, 48000),
                new Tesla("Model X", "Blue", 2014, 48000),
        };

        for (Car eligible : cars) {
            if ((eligible instanceof Honda && ((eligible.getYEAR() == 2010) || (eligible.getYEAR() == 2011))) ||
                    (eligible instanceof Audi && ((eligible.getYEAR() >= 2015) || (eligible.getYEAR() <= 2019))) ||
                    (eligible instanceof Tesla) && ((eligible.getYEAR() == 2015) || (eligible.getYEAR() == 2016))) {
                System.out.println(eligible);
            }


            Car highestPrice = cars[0];
            for (Car car : cars) {
                if (car.getPrice() > highestPrice.getPrice()) {
                    highestPrice = car;
                }
            }
            System.out.println("Highest price: " + highestPrice.getMODEL() + highestPrice);


            Car lowestPrice = cars[0];
            for (Car car : cars) {
                if (car.getPrice() < lowestPrice.getPrice()) {
                    lowestPrice = car;
                }
            }
            System.out.println("Lowest price: " + lowestPrice.getMODEL() + lowestPrice);

        }

        ArrayList<Tesla> teslaCars = new ArrayList<>();


        for (Car car : cars) {
            if (car instanceof Tesla){
                teslaCars.add((Tesla) car);
            }
            
        }
        System.out.println(teslaCars);












    }


}

/*
. Create a Class Named 'CarShop':
    - Given an array of Car objects:
            Car[] cars = {
                new Honda("Pilot","White", 2010, 25000),
                new Audi("Q6", "Red",2014, 32000),
                new Honda("Accord", "White",2011, 20000  ),
                new Audi("Q4", "Blue", 2015, 33000),
                new Audi("A7", "Black",2019, 35000),
                new Audi("Q8", "White",2018, 40000),
                new Audi("Q5", "Purple",2009, 30000),
                new Audi("A4", "Black", 2011, 30000),
                new Honda("Civic", "Red",2018, 30000),
                new Honda("CR-V", "Red", 2012, 23000),
                new Honda("HR-V", "Blue",2019, 35000),
                new Tesla("Model 3", "White", 2015, 45000),
                new Tesla("Model Y", "Black", 2017, 65000),
                new Tesla("Model X", "White", 2016, 48000),
                new Tesla("Model X", "Blue",2014, 48000),
            };

    - Tasks:
        1.2. Display all cars eligible for recall:
            - Honda: Years 2010 to 2011
            - Audi: Years 2015 to 2019
            - Tesla: Years 2015 to 2016
        1.3. Display the car with the highest price.
        1.4. Display the car with the lowest price.
        1.5. Create an ArrayList of Tesla named 'teslaCars' and store all Tesla cars from the cars array.



 */