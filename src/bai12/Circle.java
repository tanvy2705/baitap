package bai12;

public class Circle {
    private double radius;
    Circle(){
        radius = 1.0;
    }
    public Circle( double radius){
        this.radius = radius;
    }
    public void setRadius(){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
    public double Area(){
        return (Math.PI * radius * radius);
    }
    public double Circumference(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "myCircle{" +
                "radius=" + radius +
                '}';
    }
}
