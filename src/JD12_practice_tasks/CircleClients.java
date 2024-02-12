package JD12_practice_tasks;

public class CircleClients {
    public static void main(String[] args) {

        Circle circle1 = new Circle(4.5,3.14);

        // circle1.setRadius(4.5);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.calcArea());
        System.out.println(circle1.calcPerimeter());

        Circle circle2 = new Circle(6.0,3.14);

        System.out.println(circle2.getRadius());
        System.out.println(circle2.calcArea());
        System.out.println(circle2.calcPerimeter());


    }
}
