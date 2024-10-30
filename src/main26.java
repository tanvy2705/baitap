public class main26 {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(0,0);
        MyPoint p2 = new MyPoint();
        System.out.println("x is: " + p1.getX());
        System.out.println("y is: " + p1.getY());
        System.out.println(p1);
        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));
        System.out.println(p1.distance(5, 6));
        System.out.println(p1.distance());
    }
}
