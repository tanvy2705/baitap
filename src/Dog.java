public class Dog {
    private String name;

    public Dog(String name) {
        super();
    }

    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woooof");
    }

    @Override
    public String toString() {
        return "Dog[Dog[Mammal[Animal[name=" + name + "]]]]";
    }
}


