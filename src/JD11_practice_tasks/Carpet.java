package JD11_practice_tasks;

public class Carpet {

    public double width,length,unitPrice;
    public boolean isPersion;

    public double calcCost() {

        double totalPrice = (width * length) * unitPrice;
        if (isPersion) {
            return totalPrice += 200;
        }
        return totalPrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersion=" + isPersion +
                '}';
    }

    public Carpet(double width, double length, double unitPrice, boolean isPersion) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersion = isPersion;
    }
}
/*
2. Create a custom class named Carpet with the following specifications:

    Attributes:
   			width
   			length
   			unitPrice
   			isPersian (boolean)

    Actions:
		calcCost(): calculate the total cost of the carpet and return it as a double.
   		toString(): display all the info of the carpet, including the total cost of the carpet as calculated by calcCost()

   Price calculation formula:
   		Total price of carpet = (width * length) * unitPrice
   		If the carpet is Persian, add $200 to the totalPrice

    Create another class named CarpetClients, create multiple carpet objects, and test each function of the carpet object.


 */