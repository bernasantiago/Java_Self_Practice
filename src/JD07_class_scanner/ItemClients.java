package JD07_class_scanner;

public class ItemClients {
    public static void main(String[] args) {

        Item input = new Item();
        input.itemName = "Tablo";
        input.unitPrice = 10.0;
        input.quantity = 5 ;

        input.calcCost();

        System.out.println(input);

        System.out.println("---------------------");

        Item input2= new Item();
        input2.itemName = "Apple";
        input2.unitPrice = 2;
        input2.quantity = 5;

        input2.calcCost();
        System.out.println(input2);
    }
}
