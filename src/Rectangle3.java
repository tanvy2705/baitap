public abstract class Rectangle3 implements GeometricObject{
    private double width;
    private double length;
    public Rectangle3(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public String tosString(){
        return "Rectangle3{width=" + width + ", length=" + length + "}";
    }
}
