public abstract class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;
    public MovableCircle(int radius,int x, int y, int xSpeed,int ySpeed){
        this.radius = radius;
        center = new MovablePoint(x, y);
        xSpeed = xSpeed;
        ySpeed = ySpeed;
    }
    public String toString(){
        return "x="+center.x+",y="+center.y+",radius="+radius;
    }


}
