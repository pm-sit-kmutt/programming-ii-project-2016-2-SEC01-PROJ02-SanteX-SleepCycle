package sleepcycle.model;

import java.sql.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.*;

public class AlarmSQL {

    private ArrayList<Alarm> alarmList = new ArrayList<>();
    private ArrayList<Alarm> choosedAlarmList = new ArrayList<>();
    private DecimalFormat df = new DecimalFormat("00");
    private SimpleDateFormat sHour = new SimpleDateFormat("HH");
    private SimpleDateFormat sMin = new SimpleDateFormat("mm");

    public AlarmSQL() {
    }

    public ArrayList<Alarm> alarmQuery() {
        try {
            Connection conn = MySQLConnect.getMySQLConnection();
            String sql = "select * from Alarm";
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            int i = 0;
            while (rs.next()) {
                alarmList.add(new Alarm());
                orm(rs, alarmList.get(i));
                i++;
            }
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        getChoosedAlarm();
        return alarmList;
    }

    public void orm(ResultSet rs, Alarm a) {
        try {
            int id = rs.getInt("alarmId");
            int hour = rs.getInt("alarmHr");
            int min = rs.getInt("alarmMin");
            int select = rs.getInt("selected");
            int timeMin = rs.getInt("alarmTimeMin");
            int saId = rs.getInt("saId");
            a.setId(id);
            a.setHour(hour);
            a.setMin(min);
            a.setSelect(select);
            a.setTimeMin(timeMin);
            a.setSaId(saId);
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }

    public void createAlarm(int hour, int min, int saId) {
        alarmQuery();
        int i;
        if(alarmList.isEmpty()){
            i = 0;
        }
        else{
            i = alarmList.get(alarmList.size()-1).getId();
        }
        int alarmId = ++i;
        Alarm a = new Alarm(alarmId, hour, min, 0, saId);
        alarmList.add(a);
        
        try {
            Connection conn = MySQLConnect.getMySQLConnection();
            String sql = "insert into Alarm(alarmId,alarmHr,alarmMin,selected,saId)"
                        + "values("+alarmId+","+hour+","+min+",0,"+saId+")";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.executeUpdate();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void editAlarm(int alarmId, int hr, int min) {
        for (int i = 0 ; i < alarmList.size() ; i++){
            if(alarmList.get(i).getId()==alarmId){
                alarmList.get(i).setHour(hr);
                alarmList.get(i).setMin(min);
            }
        }
        try {
            Connection conn = MySQLConnect.getMySQLConnection();
            String sql = "update Alarm"
                        + " set alarmHr = " + hr + " ,alarmMin = " + min
                        + " where alarmId = " + alarmId;
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.executeUpdate();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void deleteAlarm(int alarmId) {
        for (int i = 0 ; i < alarmList.size() ; i++){
            if(alarmList.get(i).getId()==alarmId){
                alarmList.remove(i);
            }
        }
        try {
            Connection conn = MySQLConnect.getMySQLConnection();
            String sql = "delete from Alarm where alarmId = " + alarmId;
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void chooseAlarm(int alarmId, int timeMin) {
        for (int i = 0 ; i < alarmList.size() ; i++){
            if(alarmList.get(i).getId()==alarmId){
                alarmList.get(i).setTimeMin(timeMin);
                alarmList.get(i).setSelect(1);
                choosedAlarmList.add(alarmList.get(i));
            }
        }
        try {
            Connection conn = MySQLConnect.getMySQLConnection();
            String sql = "update Alarm set selected = 1 ,alarmTimeMin = ? "
                        + "where alarmId = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, timeMin);
            pstm.setInt(2, alarmId);
            pstm.executeUpdate();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public String getAlarmTime(int alarmId) {
        int hr = 0, min = 0;
        for (int i = 0 ; i < alarmList.size() ; i++){
            if(alarmList.get(i).getId()==alarmId){
                hr = alarmList.get(i).getHour();
                min = alarmList.get(i).getMin();
            }
        }
        return "" + df.format(hr) + "  :  " + df.format(min);
    }
    
    public ArrayList<Alarm> showAlarm() {
        return alarmList;
    }
    
    public ArrayList<Alarm> getChoosedAlarm() {
        for(int i = 0; i < alarmList.size() ; i++ ){
            Alarm a = alarmList.get(i);
            choosedAlarmList.add(a);
        }
        return choosedAlarmList;
    }

    public void wakeUp() {
        int timeH, timeM, alarmid = 0 , saId = 0 , timeMin = 0;
        int j = 0;
        do {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            timeH = Integer.parseInt(sHour.format(new java.util.Date()));
            timeM = Integer.parseInt(sMin.format(new java.util.Date()));
            
            for (int i = 0 ; i < choosedAlarmList.size() ; i++) {
                if(choosedAlarmList.get(i).getMin()== timeM &&
                   choosedAlarmList.get(i).getHour()== timeH ){
                    alarmid = choosedAlarmList.get(i).getId();
                    saId = choosedAlarmList.get(i).getSaId();
                    timeMin = choosedAlarmList.get(i).getTimeMin();
                }
            }
        } while (alarmid == 0);
        int wp = JOptionPane.showConfirmDialog(null, "Wake UP!!!!!!!", "Alarm",
                 JOptionPane.CLOSED_OPTION,
                 JOptionPane.WARNING_MESSAGE);
        
        
        SoundManage sm = new SoundManage();
        sm.SoundAlarmQuery();
        sm.playSoundAlarm(saId, timeMin);
        SleepTimeSQL st = new SleepTimeSQL();   
        st.setTimeEnd();
        
    }
}
