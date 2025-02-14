public abstract class Shape1 {
    protected String color = "red";
    protected boolean filled = true;
    public Shape1() {}
    public Shape1(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
     public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape1[color=" + color + "," + "filled=" + filled + "]";
    }
}
