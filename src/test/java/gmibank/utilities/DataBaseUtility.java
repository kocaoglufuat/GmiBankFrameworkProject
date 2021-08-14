package gmibank.utilities;

import java.sql.*;

public class DataBaseUtility {
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultset;
    public static void createConnection() throws SQLException {
        String url = "jdbc:postgresql://157.230.48.97.5432/gmibank_db";
        String user = "Techpro_@126";
        String password = "Techpro_@126";
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        }
        public static void createConnection(String url,String user,String password) throws SQLException {
        connection=DriverManager.getConnection(url,user,password);
        }

}
