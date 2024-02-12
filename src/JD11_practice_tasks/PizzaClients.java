package JD11_practice_tasks;

import java.util.Scanner;

public class PizzaClients {
    public static void main(String[] args) {

        Pizza pizza1= new Pizza("small", 2,4);

        System.out.println("Pizza1  = " + pizza1.calcCost());

        Pizza pizza2 = new Pizza("MEdium",1,5);

        System.out.println("Pizza2 = " + pizza2.calcCost());

        Pizza pizza3= new Pizza("LarGe",0,1);

        System.out.println("Pizza3 =" + pizza3.calcCost());



    }




}
