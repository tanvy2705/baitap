public class book {
    private String name;
    private author author;
    private double price;
    private int qty;
    public book(String name, author Author, double price) {
        this.name = name;
        this.author = Author;
        this.price = price;
    }
    public book(String name, author Author, double price, int qty) {
        this.name = name;
        this.author = Author;
        this.price = price;
        this.qty = qty;
    }
    public String getName() {
        return name;
    }
    public author getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
