package week3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCEx01 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "user";
        String password = "user1234";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, user, password);
        Statement ps = conn.createStatement();
        ResultSet rs = ps.executeQuery("SELECT * FROM T");
        while(rs.next()){
            System.out.println(rs.getInt(1) + " : " + rs.getString(2));
        }
    }
}
