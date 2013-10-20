package time;

/**
 * Created with IntelliJ IDEA.
 * User: bigwood928
 * Date: 10/12/13
 * Time: 10:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class Time24 {

    private int hour = 0;
    private int minute = 0;

    public Time24() {
        this.hour = 0;
        this.minute = 0;
    }

    public Time24(int hour, int minute) {
        this();
        addTime((hour*60) + minute);
    }

    public void addTime(int minutes) {
        if(minutes < 0) {
            throw new IllegalArgumentException("time.Time24 setTime: minutes must be a positive integer");
        }
        this.hour = (this.hour + ((int) Math.floor(minutes/60)))%24;
        this.minute = (this.minute + minutes) % 60;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setTime(int hour, int minute) {
        if(hour < 0 || minute < 0) {
            throw new IllegalArgumentException("time.Time24 setTime: parameters must be positive integers");
        }
        this.hour = 0;
        this.minute = 0;
        this.addTime((hour*60) + minute);
    }

    public Time24 interval(Time24 other) {
        int minutes = this.getHour()*60 + this.getMinute();
        int otherMinutes = other.getHour()*60 + other.getMinute();
        int difference = otherMinutes - minutes;
        Time24 newTime = new Time24();
        if(difference > 0) {
            newTime.addTime(difference);
        } else {
            newTime.addTime((24*60) + difference);
        }
        return newTime;
    }

    public static Time24 parseTime(String time) {
        String[] splits = time.split(":");
        Time24 someTime = new Time24();
        if(splits.length ==2) {
            int hours = Integer.parseInt(splits[0]);
            int minutes = Integer.parseInt(splits[1]);
            someTime = new Time24(hours, minutes);
        }
        return someTime;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();

        if(hour < 10) {
            sb.append(0).append(hour);
        } else {
            sb.append(hour);
        }
        sb.append(":");
        if(minute < 10){
            sb.append(0).append(minute);
        } else {
            sb.append(minute);
        }
        return sb.toString();

    }
}
