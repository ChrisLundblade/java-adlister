import java.sql.*;
import com.mysql.cj.jdbc.Driver;
import models.Album;

public class JDBCPractice {
    public static void main(String[] args) {
        try {
            // register driver
            // create connection
            // create statement
            // (Select) execute the query with statement
            // scroll through ResultSet to print album artists

            // register driver

            DriverManager.registerDriver(new Driver());

            // create connection

            Connection connection = DriverManager.getConnection(
                    // DB connection url
                    "jdbc:mysql://localhost/codeup_test_db?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true",
                    // DB username
                    "root",
                    // DB password
                    "codeup"
            );

            // create statement

            Statement statement = connection.createStatement();



            // scroll through ResultSet to print album artists

            // id |         artist |                      name | release_date | sales | genre <------------ column names
            // 1  |              2 |                         3 |            4 |     5 |     6 <------------ column numbers
            // 1 | Michael Jackson |                  Thriller |         1982 |  47.3 | Pop, Rock, R&B
            // 2 |           AC/DC |             Back in Black |         1980 |  26.1 | Hard rock
            // 3 |      Pink Floyd | The Dark Side of the Moon |         1973 |  24.2 | Progressive rock
            //

            Album updateAlbum = new Album(
                    2,
                    "Jimmy Eat World",
                    "Clarity",
                    1999,
                    1,
                    "Emo pop, rock, alternative"
            );

            String updateQuery = String.format("UPDATE albums SET artist = '%s', name = '%s', release_date = %d, sales = %f, genre = '%s' WHERE id = %d",
                    updateAlbum.getArtist(),
                    updateAlbum.getName(),
                    updateAlbum.getReleaseDate(),
                    updateAlbum.getSales(),
                    updateAlbum.getGenre(),
                    updateAlbum.getId()
            );

            System.out.println(updateQuery);

//            boolean returnsResultSet = statement.execute(updateQuery);
            int numberOfRowsEffected = statement.executeUpdate(updateQuery);

            // ======================== INSERTING A RECORD

//            Album brandNewAlbum = new Album(
//                    "The Smiths",
//                    "The Queen Is Dead",
//                    1986,
//                    1,
//                    "rock, post-punk, alternative rock"
//            );
//
//            String insertQuery = String.format("INSERT INTO albums (artist, name, release_date, sales, genre) VALUES ('%s', '%s', %d, %f, '%s')",
//                    brandNewAlbum.getArtist(),
//                    brandNewAlbum.getName(),
//                    brandNewAlbum.getReleaseDate(),
//                    brandNewAlbum.getSales(),
//                    brandNewAlbum.getGenre()
//            );
//            System.out.println(insertQuery);
//
//            statement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
//            ResultSet rs = statement.getGeneratedKeys();
//
//            if (rs.next()) {
//                System.out.println("Inserted id is: " + rs.getLong(1));
//            }
//
//            // (Select) execute the query with statement
//
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM albums");
//
//            resultSet.next(); // look at first result
//
//            String firstArtist = resultSet.getString("artist");
//            String firstAlbum = resultSet.getString("name");
//
//            System.out.println(firstArtist);
//            System.out.println(firstAlbum);
//
//            while(resultSet.next()){
//                System.out.println(resultSet.getString("name"));
//            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
