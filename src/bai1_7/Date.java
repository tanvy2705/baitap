package bai1_7;

public class Date {
    private int day;
    private int month;
    private int year;
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(int day, int month, int year) {
        this.day = day;
    }

    public int getDay(){
        return day;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public int getMonth(){
        return month;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return year;
    }

    @Override
    public String toString() {
        return   day + "/" + month + "/" + year;
    }
}


