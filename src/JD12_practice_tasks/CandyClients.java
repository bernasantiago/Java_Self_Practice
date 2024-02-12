package JD12_practice_tasks;

public class CandyClients {
    public static void main(String[] args) {

        Candy candy1 = new Candy();

        candy1.setBrand("Kit Kat");
        candy1.setPrice(2);
        candy1.setQuantity(3);
        candy1.setHasPeanuts(false);

        System.out.println(candy1.getQuantity() + " " +  candy1.getBrand());
        System.out.println(candy1.getPrice());
        System.out.println(candy1.isHasPeanuts());

        System.out.println("-----------------------------------");

        Candy candy2 = new Candy();

        candy2.setPrice(0);
        candy2.setBrand("Blow Pops");
        candy2.setQuantity(10);
        candy2.setHasPeanuts(true);

        System.out.println(candy2.getQuantity() + " " + candy2.getBrand());
        System.out.println(candy2.getPrice());
        System.out.println(candy2.isHasPeanuts());


    }
}
