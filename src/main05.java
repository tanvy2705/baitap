public class main05 {
    public static void main(String[] args) {
     account Account = new account("tanvy","le",23);
     System.out.println(Account.getBalance());
        System.out.println("id is " + Account.getId());
        System.out.println("name is " + Account.getName());
        System.out.println("balance is " + Account.getBalance());
    }
}
