package sleepcycle.model;

public class Alarm {

    private int id;
    private int hour;
    private int min;
    private int select;
    private int timeMin;
    private int saId;

    public Alarm() {
        this(0,0,0,0,0);
    }

    public Alarm(int id, int hour, int min, int timeMin, int saId) {
        this.id = id;
        this.hour = hour;
        this.min = min;
        select = 0;
        this.timeMin = timeMin;
        this.saId = saId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSelect() {
        return select;
    }

    public void setSelect(int select) {
        this.select = select;
    }

    public int getTimeMin() {
        return timeMin;
    }

    public void setTimeMin(int timeMin) {
        this.timeMin = timeMin;
    }

    public int getSaId() {
        return saId;
    }

    public void setSaId(int saId) {
        this.saId = saId;
    }

    @Override
    public String toString() {
        return "Alarm >> \nId : " + id
                + "\nTime : " + hour + ":" + min
                + "\nSelect : " + select
                + "\ntimeMin : " + timeMin
                + "\nsoundId : " + saId;
    }

}
