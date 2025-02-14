public abstract class MovablePonitt  implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    public MovablePonitt(int x, int y, int xSpeed, int ySpeed) {
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public String toString(){
        return "x="+x+" y="+y+" xSpeed="+xSpeed+" ySpeed="+ySpeed;
    }

}
