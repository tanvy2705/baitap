package quanlybenhviendakhoa;

public class Person {
    private String name;
    private String year;
    private String address;
    public Person(String name, String year, String address) {
        this.name = name;
        this.year = year;
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public String getYear(){
        return year;
    }
    public String getAddress(){
        return address;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setYear(String year){
        this.year = year;
    }
    public void setAddress(String address){
        this.address = String.valueOf(address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
