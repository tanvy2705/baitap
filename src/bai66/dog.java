package bai66;

public class dog extends animal{
    public dog(String name) {
        super(name);
    }
    public void greets(){
        System.out.println("woof");
    }
    public void greets(dog another){
        System.out.println("wooooof");
    }
}
