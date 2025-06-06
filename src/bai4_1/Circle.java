package bai4_1;

public class Circle {
    double radius = 1.0;
    String color = "red";

    Circle(){
        //
    }
    Circle(double radius){
        this.radius = radius;
    }
    Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public String toString(){
        return "bai6_1.Circle [ radius: " + radius + ", color: " + color + " ]";
    }
}


