public class main06 {
    public static void main(String[] args) {
        date Date = new date(1,2,2024);
        System.out.println(Date);
        Date.setMonth(12);
        Date.setMonth(9);
        Date.setYear(2034);
        System.out.println(Date);
        System.out.println("Month: " + Date.getMonth());
        System.out.println("Year: " + Date.getYear());
        System.out.println("Day: " + Date.getDay());
        // Test setData()
        Date.setDate(5,6,2025);
        System.out.println(Date);
    }
}
