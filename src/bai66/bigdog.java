package bai66;

public class bigdog extends dog{

    public bigdog(String name) {
        super(name);
    }
    public void greets(){
        System.out.println("woooow");
    }
    public void greets(dog another){
        System.out.println("woooooooow");
    }
    public void greets(bigdog another){
        System.out.println("woooooooooooooooow");
    }
}
