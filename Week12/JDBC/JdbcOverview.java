package Week12.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcOverview {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner in = new Scanner(System.in);
		System.out.print("Login Username: ");
		String name = in.nextLine();
		in.close();
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
        //     while (rs.next()) {
        //         String customer = rs.getString("customer_name");
        //         int id = rs.getInt("id");
        //         double balance = rs.getDouble("balance");
        //         System.out.printf("%d. %10s $%.2f%n", id, customer, balance);
        //     }
        // } catch (SQLException e) {
        //     System.out.println(e.getMessage());
        // }
        /////////////////////////////////////////////////////////////////////////////////////
//			rs = stmt.executeQuery("SELECT * FROM account WHERE customer_name = \"" + name + "\";");
//			System.out.println("Here is your account info");
//			if (rs.next()) {
//				String customer = rs.getString("customer_name");
//				int id = rs.getInt("id");
//				double balance = rs.getDouble("balance");
//				System.out.printf("%d %20s $%.2f%n", id, customer, balance);
//			} else {
//				System.out.println("No account found");
//			}
			///////////////////////////////////////////////////////////////////////////////////////
			PreparedStatement prstmt= conn.prepareStatement("SELECT * FROM account WHERE customer_name = ?;");
			prstmt.setString(1, name); // not zero indexed
			System.out.println("Here is your account info");
			ResultSet result = prstmt.executeQuery();
			if (result.next()) {
				String customer = result.getString("customer_name");
				int id = result.getInt("id");
				double balance = result.getDouble("balance");
				System.out.printf("%d %20s $%.2f%n", id, customer, balance);
			} else {
				System.out.println("No account found");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
    }
}
