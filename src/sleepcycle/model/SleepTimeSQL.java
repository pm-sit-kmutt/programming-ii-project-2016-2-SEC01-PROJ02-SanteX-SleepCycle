package sleepcycle.model;

import java.sql.*;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class SleepTimeSQL {
    
    private ArrayList<SleepTime> sleepList = new ArrayList<>();
    private final SimpleDateFormat hour = new SimpleDateFormat("HH");
    private final SimpleDateFormat min = new SimpleDateFormat("mm");
    private final SimpleDateFormat month = new SimpleDateFormat("YYYY-MM");
    private final SimpleDateFormat year = new SimpleDateFormat("YYYY");
    private final SimpleDateFormat date = new SimpleDateFormat("YYYY-MM-dd");
    
    public SleepTimeSQL() {
    }
    
    public ArrayList<SleepTime> sleepTimeQuery(){
        try {
            Connection conn = MySQLConnect.getMySQLConnection();
            String sql = "select * from SleepTime";
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            int i = 0;
            while (rs.next()) {
                sleepList.add(new SleepTime());
                orm(rs, sleepList.get(i));
                i++;
            }
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return sleepList;
    }
    
    public void orm(ResultSet rs, SleepTime a) {
        try {
            int id = rs.getInt("stId");
            Date sleepDay = rs.getDate("sleepDate");
            int hour = rs.getInt("hours");
            int min = rs.getInt("mins");
            Time timeSt = rs.getTime("sleepStart");
            Time timeEd = rs.getTime("sleepEnd");
            a.setStId(id);
            a.setHour(hour);
            a.setMin(min);
            a.setSleepDate(sleepDay);
            a.setTimeStart(timeSt);
            a.setTimeEnd(timeEd);
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }
    
    public void startSleep(){
        sleepTimeQuery();
        int i;
        if(sleepList.isEmpty()){
            i = 0;
        }
        else{
            i = sleepList.get(sleepList.size()-1).getStId();
        }
        int stId = ++i;
        try {
            Connection conn = MySQLConnect.getMySQLConnection();
            String sql = "insert into SleepTime(stId,sleepDate,sleepStart,sleepEnd) value(?,?,?,?)";
            PreparedStatement pstm = conn.prepareStatement(sql) ;
            pstm.setInt(1,stId);
            Date date = new Date(System.currentTimeMillis());
            long t = date.getTime();
            Time time = new Time(t);
            pstm.setDate(2,date);
            pstm.setTime(3,time);
            pstm.setTime(4,time);
            pstm.executeUpdate();
            SleepTime st = new SleepTime(stId,date,time,time);
            sleepList.add(st);
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SleepTime.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int getSleepTimeId(){ // ได้ id ล่าสุด
        int id = 0;
        if(!sleepList.isEmpty()){
            id = sleepList.get(sleepList.size()-1).getStId();
        }
        return id;
    }
          
    public void setTimeEnd(){ //บันทึกเวลา สิ้นสุดการนอน
        int stId = getSleepTimeId();
        try {
            Connection conn = MySQLConnect.getMySQLConnection();
            String sql = "update SleepTime set sleepEnd = ? "+
                         "where stId = ?";
            PreparedStatement pstm = conn.prepareStatement(sql) ;
            Date date = new Date(System.currentTimeMillis());
            long t = date.getTime();
            Time time = new Time(t);
            for (int i = 0 ; i < sleepList.size() ; i++){
                if(sleepList.get(i).getStId()==stId){
                    sleepList.get(i).setTimeEnd(time);
                }
            }
            pstm.setTime(1,time);
            pstm.setInt(2, stId);
            pstm.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SleepTimeSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Time getTimeStart(int id){ //ดึงเวลาเริ่มนอน
        Time timeStart = new Time(0);
        for (int i = 0 ; i < sleepList.size() ; i++){
            if(sleepList.get(i).getStId()==id){
                timeStart = sleepList.get(i).getTimeStart();
            }
        }
        return timeStart;
    }
    
    public Time getTimeEnd(int id){ //ดึงเวลาสิ้นสุดการนอน
        Time timeEnd = new Time(0);
        for (int i = 0 ; i < sleepList.size() ; i++){
            if(sleepList.get(i).getStId()==id){
                timeEnd = sleepList.get(i).getTimeEnd();
            }
        }
        return timeEnd;
    }
    
    public void computeTime(int id){ //คำนวนเวลา
        String hStart = hour.format(getTimeStart(id));
        String mStart = min.format(getTimeStart(id));
        String hEnd = hour.format(getTimeEnd(id));
        String mEnd = min.format(getTimeEnd(id));
        int hSt = Integer.parseInt(hStart);
        int mSt = Integer.parseInt(mStart);
        int hEd = Integer.parseInt(hEnd);
        int mEd = Integer.parseInt(mEnd);
        int mElapse = 0,hElapse = 0;
        if(mEd<mSt){
            mElapse = mEd + 60 - mSt;
            hEd--;
            if(hEd<hSt){
                hElapse = (hEd - hSt)*-1;
            }
        }else if(mEd>mSt){
            mElapse = mEd - mSt;
            if(hEd>hSt){
                hElapse = hEd - hSt;
            }
        }
        try {
            Connection conn = MySQLConnect.getMySQLConnection();
            String sql = "update SleepTime set hours = ?, mins = ? "+
                         "where stId = ?";
            PreparedStatement pstm = conn.prepareStatement(sql) ;
            pstm.setInt(1,hElapse);
            pstm.setInt(2,mElapse);
            pstm.setInt(3,id);
            pstm.executeUpdate();
            conn.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(SleepTimeSQL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SleepTimeSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public ArrayList<Integer> getSleepTime(int month, int year) { // เก็บเป็นนาที
        ArrayList<Integer> allMin = new ArrayList<>();
        try {
            Connection conn = MySQLConnect.getMySQLConnection();
            String sql ="select sleepDate, hours, mins from SleepTime ";
            PreparedStatement pstm = conn.prepareStatement(sql) ;
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                Date d = rs.getDate("sleepDate");
                if (d.getMonth()==month && d.getYear()==year) {
                    int tempHour = rs.getInt("hours");
                    int total = (tempHour*60)+rs.getInt("mins");
                    allMin.add(total);
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
        return allMin;
    }
    
    public ArrayList[] countSleepState(int type){
        ArrayList<Integer> totalHour = new ArrayList<>();
        ArrayList<String> dateDisplay = new ArrayList<>();
        ArrayList[] count = new ArrayList[2];
        long today = System.currentTimeMillis();
        switch (type) {
            case 0:
                for(int j = 0 ; j < sleepList.size();j++){
                    if(date.format(new Date(today)).equals(date.format(sleepList.get(j).getSleepDate()))){
                        totalHour.add(sleepList.get(j).getHour());
                        dateDisplay.add(sleepList.get(j).getSleepDate().toString());
                    }                  
                }   break;
            case 1:
                for(int j = 0 ; j < sleepList.size();j++){
                    if(month.format(new Date(today)).equals
                      (month.format(sleepList.get(j).getSleepDate()))){
                        totalHour.add(sleepList.get(j).getHour());
                        dateDisplay.add(sleepList.get(j).getSleepDate().toString());
                    }
                }   break;
            case 2:
                for(int j = 0 ; j < sleepList.size();j++){
                    if(year.format(new Date(today)).equals
                      (year.format(sleepList.get(j)))){
                        totalHour.add(sleepList.get(j).getHour());
                        dateDisplay.add(sleepList.get(j).getSleepDate().toString());
                    }
                }   break;
            default:
                break;
        }
        count[0] = totalHour;
        count[1] = dateDisplay;
        System.out.println(count[1]);
        return count;
    }
    
}

