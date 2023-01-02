package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnection {


    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=PS21684_ASM;user=sa;password=123";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con = DriverManager.getConnection(url);
        return con;
    }

}
