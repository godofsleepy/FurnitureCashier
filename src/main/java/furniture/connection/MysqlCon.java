package furniture.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class MysqlCon {
    static Connection connection;
    public static Statement state;

    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/uji_level3?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String username = "root";
            String password = "";

            connection = DriverManager.getConnection(url, username, password);
            state = connection.createStatement();
            System.out.println("Connection Succes");
        } catch (Exception   e) {
            System.out.println("Connection Fail");
            e.printStackTrace();
        }

        return connection;
    }
}
