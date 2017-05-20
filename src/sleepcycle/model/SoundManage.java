package sleepcycle.model;

import java.io.*;
import java.sql.*;
import java.util.*;
import javax.sound.sampled.*;
import javax.swing.*;

public class SoundManage {
    
    private ArrayList<Sound> soundAList = new ArrayList<>();
    private ArrayList<Sound> soundSList = new ArrayList<>();
    
    public ArrayList<Sound> SoundAlarmQuery(){
        try {
            Connection conn = MySQLConnect.getMySQLConnection();
            String sql = "select * from SoundAlarm";
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            int i = 0;
            while (rs.next()) {
                soundAList.add(new Sound());
                ormSA(rs, soundAList.get(i));
                i++; 
            }
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return soundAList;
    }

    public void ormSA(ResultSet rs, Sound s) {
        try {
            int id = rs.getInt("saId");
            String path = rs.getString("saPath");
            s.setId(id);
            s.setPath(path);
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }
    
    public ArrayList<Sound> SoundSleepQuery(){
        try {
            Connection conn = MySQLConnect.getMySQLConnection();
            String sql = "select * from SoundSleep";
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            int i = 0;
            while (rs.next()) {
                soundSList.add(new Sound());
                ormSS(rs, soundSList.get(i));
                i++; 
            }
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return soundSList;
    }
    
    public void ormSS(ResultSet rs, Sound s) {
        try {
            int id = rs.getInt("ssId");
            String path = rs.getString("ssPath");
            s.setId(id);
            s.setPath(path);
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }
    
    public void playSoundAlarm(int saId,int timeMin){
        String path = "";
        for (int i = 0 ; i < soundAList.size() ; i++){
            if(soundAList.get(i).getId()==saId){
                path = soundAList.get(i).getPath();
            }
        }
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream
            (new File(System.getProperty("user.dir")+path).getAbsoluteFile());
                  
            Clip clip = AudioSystem.getClip();
            clip.open(ais);
            clip.start();
            long lenght = clip.getMicrosecondLength();
            long round = timeMin*60*1000000/lenght;
            clip.loop((int)round);         
            ais.close();
        } catch(IOException | LineUnavailableException |
                UnsupportedAudioFileException ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }
    
    public void playSoundSleep(int ssId,int timeMin){
        String path = "";
        for (int i = 0 ; i < soundSList.size() ; i++){
            if(soundSList.get(i).getId()==ssId){
                path = soundSList.get(i).getPath();
            }
        }
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream
            (new File(System.getProperty("user.dir")+path).getAbsoluteFile());
                  
            Clip clip = AudioSystem.getClip();
            clip.open(ais);
            clip.start();
            long lenght = clip.getMicrosecondLength();
            long round = timeMin*60*1000000/lenght;
            clip.loop((int)round);         
            ais.close();
        } catch(IOException | LineUnavailableException |
                UnsupportedAudioFileException ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }
    
}