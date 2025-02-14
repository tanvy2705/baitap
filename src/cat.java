public class cat {
    private String name;

    public cat(String name) {
        super();
    }

    public void greets() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat[Cat[Mammal[Animal[name=" + name + "]]]]";
    }
}

