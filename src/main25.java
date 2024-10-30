public class main25 {
    public static void main(String[] args) {
        Customer1 c1 = new Customer1(2,"letanvy",'m');
        System.out.println(c1);
        System.out.println(c1.toString());
        Account1 a1 = new Account1(9,new Customer(2,"letanvy",'m'),9);
        System.out.println(a1);
        System.out.println(a1.toString());

    }
}
