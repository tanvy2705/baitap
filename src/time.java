public class time {
    private int hour;
    private int minute;
    private int second;
    public time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    public void settime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    @Override
    public String toString() {
        return "time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
    public time nextSecond() {
        return new time(hour, minute, second);
    }
    public time previousSecond() {
        return new time(hour - 1, minute, second);
    }
}
