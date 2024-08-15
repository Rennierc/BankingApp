import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://127.0.0.1:3306/bankapp";
        String DB_USERNAME = "root";
        String DB_PASSWORD = "Djatedc2025";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {
            System.out.println("Connection successful!");
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
