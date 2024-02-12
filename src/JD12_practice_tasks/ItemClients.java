package JD12_practice_tasks;

public class ItemClients {
    public static void main(String[] args) {

        Item item1 = new Item("Table",10,5);

        System.out.println(item1.getQuantity() +" " + item1.getName() + " is $" + item1.calcCost());


        Item item2 = new Item("Fly Ticket",100,2);

        // item2.setName("Ticket");

        System.out.println(item2.getQuantity() + " " + item2.getName() + " is $" + item2.calcCost());
    }


}
