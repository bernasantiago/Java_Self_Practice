package JD12_practice_tasks;

public class Item {

    private String name;
    private int unitPrice;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            System.out.println("The name cannot be empty or blank.");
            System.exit(1);
        }
        boolean isSpecialCh;

        for (int i = 0; i < name.toCharArray().length; i++) {
            if (isSpecialCh = !Character.isLetterOrDigit(name.charAt(i))) {
                System.err.println("The name cannot contain any special characters other than space.");
                System.exit(1);
            }
            if (isSpecialCh = !Character.isLetter(name.charAt(i))) {
                System.out.println("The name must start with letters.");
                System.exit(1);
            }

        }
        this.name = name;
    }


    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        if (unitPrice < 0){
            System.out.println("The unitPrice cannot be negative.");
            System.exit(1);
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0 ){
            System.out.println("The quantity cannot be negative.");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public Item(String name, int unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public int calcCost(){
        return unitPrice * quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                '}';
    }
}

/*
3. Create a custom class named Item with the following specifications:

	Attributes:
		name
		unitPrice
		quantity

	Ensure encapsulation for all fields.
		Conditions:
			The name cannot be empty or blank.
			The name cannot contain any special characters other than space.
			The name must start with letters.
			The unitPrice cannot be negative.
			The quantity cannot be negative.

	Add a constructor that enables the user to set all fields during object creation.

	Actions:
		calcCost(): Returns the total cost.
		toString(): Displays the name, unit price, quantity, and total cost calculated by calcCost() when the object is printed.

	Create another class named ItemClients, create multiple item objects, and test each function of the item object.
 */
