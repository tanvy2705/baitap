public class Account1 {
    private int id;
    private Customer customer;
    private double balance;
    public Account1(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    public Account1(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }
    public int getId(){
        return id;
    }
    public Customer getCustomer(){
        return customer;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public String toString(){
        return "ID: " + id + "\nCustomer: " + customer + "\nBalance: " + balance;
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public Account1 deposit(double amount){
        balance += amount;
        return this;
    }
    public Account1 withdraw(double amount){
        balance -= amount;
        return this;
    }

}
