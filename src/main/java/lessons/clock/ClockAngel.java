package lessons.clock;

/**
 * Created by userPG on 05.04.2017.
 */
public class ClockAngel {
    private int minute = 0;
    private int hour = 0;
    private int alfaMinute = 0;
    private int alfaHour = 0;
    private final int MAX_ANGEL = 360;
    private final int MAX_HOUR = 12;
    private final int MAX_MINUTE = 60;
    private final int HOUR_BETWEEN_ANGEL = MAX_ANGEL / MAX_HOUR;


    public ClockAngel(int minute, int hour) {
        this.minute = minute;
        this.hour = hour;

    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getAlfaMinute() {
        return alfaMinute;
    }

    public void setAlfaMinute(int alfaMinute) {
        this.alfaMinute = alfaMinute;
    }

    public int getAlfaHour() {
        return alfaHour;
    }

    public void setAlfaHour(int alfaHour) {
        this.alfaHour = alfaHour;
    }

    public void clockCalculate(){
        this.alfaMinute = MAX_ANGEL/MAX_MINUTE * this.minute;
        this.alfaHour = MAX_ANGEL/MAX_HOUR * (this.hour % MAX_HOUR) + HOUR_BETWEEN_ANGEL * this.minute / MAX_MINUTE;
    }

    @Override
    public String toString() {
        return "" + alfaMinute + ":" + alfaHour + "";
    }
}
