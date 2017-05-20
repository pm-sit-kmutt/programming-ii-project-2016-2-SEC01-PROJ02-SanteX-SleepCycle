package sleepcycle.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnect {
    public static Connection getMySQLConnection()
            throws ClassNotFoundException, SQLException {

        String hostName = "10.4.56.28";
        String dbName = "Santex_Sleep_Cycle";
        String dbPort = "3306";
        String userName = "itangx";
        String password = "password";
        
        return getMySQLConnection(hostName, dbName, dbPort, userName, password);
    }

    public static Connection getMySQLConnection(String hostName, String dbName,
            String dbPort, String userName, String password) throws SQLException,
            ClassNotFoundException {
        
        Class.forName("com.mysql.jdbc.Driver");

        String connectionURL = "jdbc:mysql://" + hostName + ":"+ dbPort +"/" + dbName+"?useSSL=false";

        Connection conn = DriverManager.getConnection(connectionURL, userName,
                password);
        return conn;
    }   
}
