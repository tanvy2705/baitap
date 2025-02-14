package bai12;

public class MainCircle {
    public static void main(String[] args) {
        Circle Circle = new Circle();
        Circle c1= new Circle(1.1);
        System.out.println(c1);
        Circle c2 = new Circle();
        System.out.println(c2);

        System.out.println("Area: "+c1.Area());
        System.out.println("circumference: "+c1.Circumference());
        System.out.println("radius is: "+ c1.getRadius());
    }
}
