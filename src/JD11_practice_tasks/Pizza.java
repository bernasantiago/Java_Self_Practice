package JD11_practice_tasks;

public class Pizza {

    public String size;

    public int numberOfCheeseTopping;

    public int numberOfPepperoniTopping;


    public int calcCost() {


        int Cost = (size.equalsIgnoreCase("small") ? 10 : (size.equalsIgnoreCase("medium") ? 12 : 14));
        int totalCost = Cost + (numberOfPepperoniTopping * 2) + (numberOfCheeseTopping * 2);
        return totalCost;


    }


    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                '}';
    }

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }
}






    /*
    1. Create a custom class named Pizza with the following specifications:

    Attributes:
		   size
		   numberOfCheeseTopping
		   numberOfPepperoniTopping

	Actions:
		calcCost(): returns the totalCost of the pizza
		toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

   Pizza cost is determined by:
   		Small: $10 + $2 per topping
   		Medium: $12 + $2 per topping
   		Large: $14 + $2 per topping

    Create another class named PizzaClients, create multiple pizza objects, and test each function of the pizza object.



     */

