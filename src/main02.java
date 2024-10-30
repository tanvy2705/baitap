public class main02 {
    public static void main(String[] args) {
        invoiceitem c1 = new invoiceitem("dg", "sdfg",35,45);
        System.out.println(c1);
        System.out.println("ID is: " + c1.getID());
        System.out.println("desc is: " + c1.getdesc());
        System.out.println("Qty is: " + c1.getQty());
        System.out.println("UnitPrice is: " + c1.getUnitPrice());
        System.out.println("Total is: " + c1.getTotal());
        System.out.println(c1);
    }
}
