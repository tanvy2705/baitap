public class Square extends Rectangle2{
    public Square() {}
    public Square(double side){
        super (side,side);
    }
    public Square(double side, String color,boolean filled){
       super(side,side,color,filled);
    }
    public double getSide(){
        return width;
    }
    public void setSide(double side){
        this.width = side;
        this.width = side;
    }
    public void setWidth(double side){
        setSide(side);
    }
    public void setLength(double side){
        setSide(side);
    }
    public String toString(){
        return "Square["+ super.toString() + ", side=" + getSide() + ", width=" + getWidth() +  "]";
    }


}
