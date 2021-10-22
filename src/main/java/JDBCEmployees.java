import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;
public class JDBCEmployees {
    public static void main(String[] args) {
        try{
            DriverManager.registerDriver(new Driver());

            // create connection

            Connection connection = DriverManager.getConnection(
                    // DB connection url
                    "jdbc:mysql://localhost/employees?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true",
                    // DB username
                    "root",
                    // DB password
                    "codeup"
            );
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM employees"); //"SELECT * FROM employees LIMIT 10"
            int i =0;
            ArrayList<String> firstTenNamesList = new ArrayList<String>();
            while(resultSet.next() && (i <10)){
                firstTenNamesList.add(resultSet.getString("first_name") + " " +resultSet.getString("last_name"));
//                System.out.println(resultSet.getString("first_name") + " " +resultSet.getString("last_name"));
                i++;
            }
            for (String name : firstTenNamesList
                 ) {
                System.out.println(name);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
