package JD11_practice_tasks;

public class Server {

    public String name;
    public  String employeeID ;
    public double hourlyRate;
    public boolean fullTime;

    public Server(String name, String employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void makeOrder(){
        System.out.println(name + " is making an order.");

    }
    public void washDishes(){
        System.out.println(name + " is washing the dishes.");
    }

    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTime +
                '}';
    }
}
