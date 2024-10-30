public class MyLine {
    private MyPoint begin;
    private MyPoint end;
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin =begin;
        this.end = end;
    }
  public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
  }
  public MyPoint getBegin() {
        return begin;
  }
  public void  setBegin(MyPoint begin) {
        this.begin = begin;
  }
  public MyPoint getEnd() {
        return end;
  }
  public void setEnd(MyPoint end) {
        this.end = end;
  }
  public int getBeginX() {
        return begin.getX();
  }
  public void setBeginX(int beginX){
        this.begin.setX(beginX);
  }
 public int getBeginY(){
        return begin.getY();
 }
 public void setBeginY(int beginY){
        this.begin.setY(beginY);
 }
 public int getEndX() {
        return end.getX();
 }
 public void setEndX(int endX){
        this.end.setX(endX);
 }
 public int getEndY() {
        return end.getY();
 }
 public void setEndY(int endY){
        this.end.setY(endY);
 }
 public int getBeginXY(){
        return begin.getX();
 }
 public void setBeginXY(int beginXY){
        this.begin.setX(beginXY);
 }
 public int getEndXY(){
        return end.getX();
 }
 public void setEndXY(int endXY){
        this.end.setX(endXY);
 }
 public double getLength(){
        return end.distance();
 }
 public double getGradient(){
     return Math.sqrt(Math.pow(this.getBeginX(), 2) + Math.pow(this.getBeginY(), 2));
 }
 public String toString(){
        return "MyLine[begin=" + begin + ", end=" + end + "]";
 }
}
