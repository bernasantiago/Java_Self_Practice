package JD12_practice_tasks;

public class RectangleClients {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();

        rectangle1.setLength(7.5);
        rectangle1.setWidth(9.0);
        System.out.println(rectangle1.getLength());
        System.out.println(rectangle1.getWidth());
        System.out.println(rectangle1.calcArea());
        System.out.println(rectangle1.calcPerimeter());

        Rectangle rectangle2 = new Rectangle();

        rectangle2.setLength(4.5);
        rectangle2.setWidth(6.7);
        System.out.println(rectangle2.getLength());
        System.out.println(rectangle2.getWidth());
        System.out.println(rectangle2.calcArea());
        System.out.println(rectangle2.calcPerimeter());


    }
}
