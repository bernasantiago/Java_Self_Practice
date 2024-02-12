package JD07_class_scanner;

public class RectangleClients {

    public static void main(String[] args) {


        Rectangle input= new Rectangle();
        input.width = 10.0;
        input.length = 6.5;


        input.calculateArea();
        input.calculatePerimeter();

        System.out.println(input);

        System.out.println("-----------------");

        Rectangle input2= new Rectangle();
        input2.width= 15.0;
        input2.length = 7.5;

        input2.calculateArea();
        input2.calculatePerimeter();

        System.out.println(input2);
    }
}
