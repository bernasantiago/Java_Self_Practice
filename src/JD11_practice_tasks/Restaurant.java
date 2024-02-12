package JD11_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String Owner;
    public String Location;
    public int numberOfStars;

   public ArrayList<Server> servers = new ArrayList<>();

   public ArrayList<Chef> chefs= new ArrayList<>();

    public Restaurant(String owner, String location, int numberOfStars) {
        Owner = owner;
        Location = location;
        this.numberOfStars = numberOfStars;
    }
    public void hireServer(Server server){
        servers.add(server);
    }
    public void hireServer(Server[] servers){
       this.servers.addAll(Arrays.asList(servers));
    }
    public void hireChef(Chef chef){
        chefs.add(chef);
    }

    public void hireChef(Chef[] chefs){
        this.chefs.addAll(Arrays.asList(chefs));

    }
    public void terminateChef(int employeeID){
        this.chefs.remove(employeeID);
    }
    public void terminateServer(int employeeID){
        this.servers.remove(employeeID);
    }

    public String toString() {
        return "Restaurant{" +
                "Owner='" + Owner + '\'' +
                ", Location='" + Location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", servers=" + servers +
                ", chefs=" + chefs +
                '}';
    }
}
