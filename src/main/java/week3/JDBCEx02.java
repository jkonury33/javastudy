package week3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCEx02 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "user";
        String password = "user1234";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, user, password);
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM T WHERE id = ?");
        ps.setInt(1, 1);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            System.out.println(rs.getInt(1) + " : " + rs.getString(2));
        }
    }
}