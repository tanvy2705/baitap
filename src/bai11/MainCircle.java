package bai11;

public class MainCircle {
    public static void main(String[] args) {

        Circle c1 = new Circle (3.0,"black");

        System.out.println(c1.getArea());

        Circle c2 = new Circle();

        System.out.println(c2.getArea());

        Circle c3 = new Circle(5, "white");

        System.out.println(c3.getArea());
        System.out.println(c3.getRadius());
    }
}


