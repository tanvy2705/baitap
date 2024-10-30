public class Author1 {
    private String name;
    private String email;
    public Author1(String name, String email){
        this.name = name;
        this.email = email;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author1{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
