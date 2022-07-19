package DatabaseConnectivity;

import entity.Movie;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class MovieRepository extends DatabaseConnector {

    public void addMovie(Movie movie) throws SQLException {
            System.out.println("inserting data to movie table");
            int rows;
            try (PreparedStatement statement = connection.prepareStatement("""
                    INSERT INTO Movie(title,price,releasedyear)
                    VALUES (?,?,?)
                    """)) {
                statement.setString(1, movie.getTitle());
                statement.setInt(2,movie.getPrice());
                statement.setDate(3, (Date) movie.getReleasedYear());
                rows = statement.executeUpdate();
            }
            System.out.println("rows added: " + rows);

    }
    public void removeMovie(Movie movie) throws SQLException{
        System.out.println("Deleting records from movie table");
        int rows;
        try (PreparedStatement statement = connection.prepareStatement("""
                    DELETE FROM Movie
                    where title like ?
                    """)) {
            statement.setString(1, movie.getTitle());
            rows = statement.executeUpdate();
        }
        System.out.println("rows deleted: " + rows);
    }
    public Movie getMovie( String title) throws SQLException {
        System.out.println("fetching records from movie table");
        int rows;
        try (PreparedStatement statement = connection.prepareStatement("""
                    SELECT title, price, releasedyear FROM Movie
                    where title like ?
                    """)) {
            statement.setString(1, title);
            rows = statement.executeUpdate();
        }
        System.out.println("rows fetched: " + rows);
        return null;
    }
    public List<Movie> getMovieList() throws SQLException {
        System.out.println("fetching records from movie table");
        int rows;
        try (PreparedStatement statement = connection.prepareStatement("""
                    SELECT title, price, releasedyear FROM Movie
                    """)) {
            rows = statement.executeUpdate();
        }
        System.out.println("rows fetched: " + rows);
        return null;
    }

}
