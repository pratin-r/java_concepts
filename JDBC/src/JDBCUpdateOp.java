package jdbc.src;
import java.sql.*;

public class JDBCUpdateOp {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/demodb";
        String userName = "trialuser1";
        String password = "trial";
        String sqlQuery = "update students set smarks = 24 where sname = 'Zoe' ";
        try {
            Connection conn = DriverManager.getConnection(url,userName,password);
            System.out.println("Connection established successfully...");
            Statement st = conn.createStatement();
            int rowsAffected = st.executeUpdate(sqlQuery);
            System.out.println("Rows updated: " + rowsAffected);
            conn.close();

        }catch (SQLException e){
            e.printStackTrace();
//            throw new RuntimeException("Database connection is failed...");
        }
    }
}

