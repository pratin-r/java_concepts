package JDBC.src;
import java.sql.*;

public class PreparedStatementImp {
    public static void main(String[] args) {
        int sidFromUser = 7;
        String snameFromUser = "Jill";
        int smarksFromUser = 26;
        String sqlQuery = "insert into students values (?,?,?)";
        String url = "jdbc:postgresql://localhost:5432/demodb";
        String userName = "trialuser1";
        String password = "trial";
        try{
            Connection conn = DriverManager.getConnection(url,userName,password);
            System.out.println("Connection established...");
            PreparedStatement st = conn.prepareStatement(sqlQuery);
            st.setInt(1,sidFromUser);
            st.setString(2,snameFromUser);
            st.setInt(3,smarksFromUser);
            st.execute();
            System.out.println("Statement executed...");
            System.out.println("Connection closed...");
            conn.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
