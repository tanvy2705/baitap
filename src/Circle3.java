public class Circle3 extends Shape {
    protected double radius = 1.0;
    public Circle3() {}
    public Circle3(double radius){
        this.radius = radius;
    }
    public Circle3( double radius,String color,boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
      return "Circle3[" + super.toString() + ", radius=" + radius + "]";
    }
}
