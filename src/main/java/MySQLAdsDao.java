import dao.Config;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.jdbc.Driver;
public class MySQLAdsDao implements Ads{
    public MySQLAdsDao(Config config){
        try{
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    // DB connection url
                    config.getUrl(),
                    // DB username
                    config.getUser(),
                    // DB password
                    config.getPassword()
            );
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    protected Connection connection;


    @Override
    public List<Ad> all() {
        ArrayList<Ad> allAdsList = new ArrayList<Ad>() {};
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM ads");

            while(resultSet.next()){
                Ad ad = new Ad(
                        resultSet.getInt("id"),
                        resultSet.getInt("user_id"),
                        resultSet.getString("title"),
                        resultSet.getString("description"));
                allAdsList.add(ad);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return allAdsList;
    }

    @Override
    public Long insert(Ad ad) {
        try{
            Statement statement = connection.createStatement();
//            String insertQuery = ("INSERT INTO ads(user_id,title, description) VALUES('"+ad.getUserId()+"','"+ad.getTitle()+"','"+ad.getDescription()+"')");
            String insertQuery = String.format("INSERT INTO ads (user_id,title, description) VALUES (%d, '%s', '%s')",
                    ad.getUserId(),
                    ad.getTitle(),
                    ad.getDescription()
            );
            statement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();

            return (long)rs.getInt("id");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
