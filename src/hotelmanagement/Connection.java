package hotelmanagement;
import java.sql.*;
public class Connection {
    Connection c ;
    Statement s;
    Connection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = (Connection) DriverManager.getConnection("jdbc:mysql:///hotelmanagementsystem", "new connection" , "palakagarwal@2005");                                          //MYSQL CONNECTIONSTRING
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}