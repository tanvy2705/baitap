import java.sql.SQLOutput;

public class main23 {
    public static void main(String[] args){
        // test Author1 class
        Author1 a1 = new Author1("tan vy","letanvy@gmail.com");
        System.out.println(a1);
        a1.setEmail("tan vy@gmail.com");
        System.out.println(a1);
        System.out.println("name is: " + a1.getName());
        System.out.println("email is: " + a1.getEmail());
        // test Book1 class
        Book1 b1 = new Book1("270506","java for dumies", a1,8.8,88);
        System.out.println(b1);
        b1.setPrice(9.9);
        b1.setQty(99);
        System.out.println(b1);
        System.out.println("isbn is: " + b1.getIsbn());
        System.out.println("name is: " + b1.getName());
        System.out.println("price is: " + b1.getPrice());
        System.out.println("qty is: " + b1.getQty());
        System.out.println("author's name is: " + b1.getAuthor().getName());
        System.out.println("author's name is: " + b1.getAuthor().getName());
        System.out.println("author's email is: " + b1.getAuthor().getEmail());

    }
}
