package Week12.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcOverview {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // step 1: Load Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Step 2: Get a connection
        String url = "jdbc:mysql://localhost:3306/bank";
        String username = "root";
        String password = "***";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            // Step 3: Create SQL statement
            Statement stmt = conn.createStatement();

            // Step 4: Run the SQL statement
            ResultSet rs = stmt.executeQuery("SELECT * FROM account");
            System.out.println("Done.");

            // Step 5: Process the results
            while (rs.next()) {
                String customer = rs.getString("customer_name");
                int id = rs.getInt("id");
                double balance = rs.getDouble("balance");
                System.out.printf("%d. %10s $%.2f%n", id, customer, balance);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
