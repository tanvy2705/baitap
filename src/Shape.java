public class Shape {
    private String color = "red";
    private boolean filled = true;
    public Shape() {
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public String tostring() {
        return color + "," + filled;
    }


}
