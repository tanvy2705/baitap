package bai66;

public abstract class animal {
    private String name;
    public animal(String name){
        this.name = name;
    }
    public void greets(){
        System.out.println("hello "+name);
    }


}
