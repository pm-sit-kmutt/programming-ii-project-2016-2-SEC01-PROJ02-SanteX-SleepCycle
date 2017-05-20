package sleepcycle.model;

import java.sql.*;


public class SleepTime {
    private int stId;
    private Date sleepDate;
    private Time timeStart;
    private Time timeEnd;
    private int hour;
    private int min;
    
    public SleepTime() {
    }

    public SleepTime(int stId, Date sleepDate, Time timeStart, Time timeEnd) {
        this.stId = stId;
        this.sleepDate = sleepDate;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
    }
    
    public int getStId() {
        return stId;
    }

    public void setStId(int stId) {
        this.stId = stId;
    }

    public Date getSleepDate() {
        return sleepDate;
    }

    public void setSleepDate(Date sleepDate) {
        this.sleepDate = sleepDate;
    }

    public Time getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Time timeStart) {
        this.timeStart = timeStart;
    }

    public Time getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Time timeEnd) {
        this.timeEnd = timeEnd;
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

    @Override
    public String toString() {
        return "SleepTime >> stId : " + stId 
                + "\nsleepDate : " + sleepDate
                + "\ntimeStart : " + timeStart 
                + "\ntimeEnd : " + timeEnd 
                + "\nhour : " + hour 
                + "\nmin : " + min ;
    }          
}    