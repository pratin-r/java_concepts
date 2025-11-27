package JDBC.src;
import java.sql.*;

public class JDBCReadOp {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/demodb";
        String userName = "trialuser1";
        String password = "trial";
        String sqlQuery = "select * from students"; // reading the values
        try {
            Connection con = DriverManager.getConnection(url,userName,password);
            System.out.println("Database connection is established...");
            Statement st = con.createStatement();
            // you can also use .execute() method but context wise .executeQuery() is used for SELECT queries
            ResultSet res = st.executeQuery(sqlQuery);
            /*
            * initially the cursor will present before the first row of the table.
            * So, this moves the cursor to first row (its a mandatory step)
            */
//            res.next();
//            System.out.println("Name of the student is: " + res.getString("sname")); // takes the first name from the table.
            while(res.next()){
                System.out.println("Student ID: "+ res.getInt("sid")+"Name of the student is: " + res.getString("sname")+"\nMarks Obtained (out of 30): " + res.getString("smarks"));
                System.out.println("-----");
            }
            con.close();
            System.out.println("Database connection is closed...");
        } catch (SQLException e) {
//            e.printStackTrace();
            throw new RuntimeException("Database connection establishment is failed...");
        }
    }
}