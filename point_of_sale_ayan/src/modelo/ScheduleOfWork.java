package modelo;
public class ScheduleOfWork {
    private String day;
    private String hourOfIn;
    private String hourOfOut;

    public ScheduleOfWork(String day, String hourOfIn, String hourOfOut) {
        this.day = day;
        this.hourOfIn = hourOfIn;
        this.hourOfOut = hourOfOut;
    }
    public void setDay(String day) {
        this.day = day;
    }
    public void setHourOfIn(String hourOfIn) {
        this.hourOfIn = hourOfIn;
    }

    public void setHourOfOut(String hourOfOut) {
        this.hourOfOut = hourOfOut;
    }

    public String getDay() {
        return day;
    }

    public String getHourOfIn() {
        return hourOfIn;
    }

    public String getHourOfOut() {
        return hourOfOut;
    }
}