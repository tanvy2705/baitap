public class Employee {
    private int id;
    private String lastName;
    private String firstName;
    private int salary;
    public Employee(int id, String lastName, String firstName, int salary){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    }
    public int getId(){
        return id;
    }
    public String getlastName(){
        return lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getname(){
        return firstName + " " + lastName;
    }
    public int getSalary(){
        return salary;
    }
    public void setsalary(int salary){
        this.salary = salary;
    }
    public int getAnnualsalary(){
        return salary * 12;
    }
    public int raisesalary(){
        return salary + getAnnualsalary();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", salary=" + salary +
                '}';
    }

}
