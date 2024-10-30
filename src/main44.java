public class main44 {
    public static void main(String[] args) {
        Point p1 = new Point(0.0f,0.0f);
        System.out.println(p1.toString());
        MovablePoint m1 = new MovablePoint(1.1f,1.2f);
        System.out.println(m1.toString());
        System.out.println(m1.move());

    }
}
