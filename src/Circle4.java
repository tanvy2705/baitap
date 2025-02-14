public abstract class Circle4 implements GeometricObject{
   private double radius;
   public Circle4(double radius) {
       this.radius = radius;
   }

    @Override
    public String toString() {
        return "Circle4[radius=" + radius + "]";
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
       return 2 * Math.PI * radius;
    }
}
