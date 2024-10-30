public class rectangle {
    private double width;
    private double height;
    public rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return 2 * width + 2 * height;
    }
}
