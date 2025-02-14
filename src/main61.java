public class main61 {
    public static void main(String[] args) {
        Shape1 s1 = new Shape1() {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimeter() {
                return 0;
            }
        };
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.toString());

    }
}
