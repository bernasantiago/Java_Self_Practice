package JD11_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class LocalRestaurant {
    public static void main(String[] args) {

        Restaurant rst = new Restaurant("Sindy","1458 illion street 92184", 5);

        Server server1 = new Server("Josh", "14",15.0,true);
        Server  server2= new Server("Yasmine","19",17.0,false);

        Server [] servers ={server1,server2};

        Chef chef1 = new Chef("Emily", "14",20.0,true);
        Chef chef2= new Chef("Gabriel", "17",19.0,false);

        Chef [] chefs = {chef1,chef1};

        rst.hireServer(servers);
        rst.hireChef(chefs);
        System.out.println(Arrays.toString(servers));
        System.out.println(Arrays.toString(chefs));




    }
}
