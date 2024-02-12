package JD11_practice_tasks;

import javax.sql.rowset.CachedRowSet;

public class CarpetClients {
    public static void main(String[] args) {


        Carpet carpet1 =new Carpet(1.5,2.5,10,false);

       double total = carpet1.calcCost();
        System.out.println("total = " + total);


        Carpet carpet2 = new Carpet(3.0,2.0,10,true);

        System.out.println("total = " + carpet2.calcCost());


        Carpet carpet3 = new Carpet (3.4,2.5,15,true);

        System.out.println("total = " + carpet3.calcCost());
    }




}
