package hotelmanagement;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
public class Conn {
    java.sql.Connection c ;
    Statement s;
    Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///hotelmanagementsystem", "root", "palakagarwal@2005");
            s = c.createStatement();
            /* MYSQL CONNECTIONSTRING */
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
