public class Rectangle2 extends Shape {
    protected double width =1.0;
    protected double length =1.0;
    public Rectangle2() {}
    public Rectangle2(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle2(double width, double length, String color,boolean filled) {
        super(color,filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return width*length;
    }
    public double getPerimeter() {
        return 2*width+2*length;
    }

    @Override
    public String toString() {
        return "Rectangle2 ["+ super. toString() + "width=" + width + ", length=" + length + "]";
    }
}
