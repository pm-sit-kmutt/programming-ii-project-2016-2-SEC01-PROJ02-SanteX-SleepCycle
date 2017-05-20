package sleepcycle.model;

import java.sql.*;
import java.text.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Review {
    
    private int id;
    private ArrayList<String> descript = new ArrayList<>();
    private ArrayList<Date> reviewDate = new ArrayList<>();
    private final int[] reviewState = new int[4];
    private final SimpleDateFormat month = new SimpleDateFormat("YYYY-MM");
    private final SimpleDateFormat year = new SimpleDateFormat("YYYY");
    private final SimpleDateFormat day = new SimpleDateFormat("dd");
    private final SimpleDateFormat date = new SimpleDateFormat("YYYY-MM-dd");
    private final DecimalFormat dc = new DecimalFormat("00");
    
    public Review(){
    }
    
    public void getLastReviewId(){ // ได้ id ล่าสุด
        try{
            Connection conn = MySQLConnect.getMySQLConnection();
            String sql = "select reviewId from Review";
            PreparedStatement pstm = conn.prepareStatement(sql) ;
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                id = rs.getInt("reviewId");
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SleepTime.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertReview(String s){
        getLastReviewId();
        try {
            Connection conn = MySQLConnect.getMySQLConnection();
            String sql = "insert into Review values(?,?,?)";
            PreparedStatement pstm = conn.prepareStatement(sql) ;
            pstm.setInt(1,++id);
            pstm.setString(2,s);
            pstm.setDate(3,new Date(System.currentTimeMillis()));
            pstm.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SleepTime.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<String> descriptQuery(){
        try {
            Connection conn = MySQLConnect.getMySQLConnection();
            String sql = "select description,reviewDate from Review";
            PreparedStatement pstm = conn.prepareStatement(sql) ;
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                descript.add(rs.getString("description"));
                reviewDate.add(rs.getDate("reviewDate"));
            }
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SleepTime.class.getName()).log(Level.SEVERE, null, ex);
        }
        return descript;
    }
    
    public int[] countState(int type){
        ArrayList<Integer> index = new ArrayList<>();
        long today = System.currentTimeMillis();
        switch (type) {
            case 0:
                for(int j = 0 ; j < reviewDate.size();j++){
                    for( int k = 0 ; k < 7 ; k++){
                        String days = day.format(new Date(today));
                        int d = Integer.parseInt(days);
                        d -= k;
                        days = month.format(new Date(today))+"-"+ dc.format(d);
                        if((days).equals(date.format(reviewDate.get(j)))){
                            index.add(j);
                        }
                    }                 
                }   break;
            case 1:
                for(int j = 0 ; j < reviewDate.size();j++){
                    if(month.format(new Date(today)).equals(month.format(reviewDate.get(j)))){
                        
                        index.add(j);
                    }
                }   break;
            case 2:
                for(int j = 0 ; j < reviewDate.size();j++){
                    if(year.format(new Date(today)).equals(year.format(reviewDate.get(j)))){
                        index.add(j);
                    }
                }   break;
            default:
                break;
        }
        int well = 0, deep = 0  , insomnia = 0 , drowsy = 0;
        for(int i = 0 ; i < index.size() ; i++){
            String stat = descript.get(index.get(i));
            if(stat.equals("sleepWell")){
                well++;
            }
            else if (stat.equals("sleepDeep")){
                deep++;
            }
            else if (stat.equals("sleepInsomnia")){
                insomnia++;
            }
            else if (stat.equals("sleepDrowsy")){
                drowsy++;
            }
        }
        reviewState[0] = well;
        reviewState[1] = deep;
        reviewState[2] = insomnia;
        reviewState[3] = drowsy;
        
        return reviewState;
    }
}
