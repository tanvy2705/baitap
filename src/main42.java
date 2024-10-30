public class main42 {
    public static void main(String[] args) {
        Person p1 = new Person("letanvy","c10 l15");
        System.out.println(p1);
        System.out.println(p1.toString());
        Student s1 = new Student("thang","hoa tien","giao duc",2024,45);
        System.out.println(s1);
        System.out.println(s1.toString());
        Staff s2 = new Staff("tai","quang nam","chu van an",67);
        System.out.println(s2);
        System.out.println(s2.toString());
    }
}
