package entity;

import java.util.Date;
import java.util.List;

public class Movie {
    private long movieId;
    private String title;
    private Date year;
    private int age;
    private int price;
    private List<Actor> cast;

    public Movie(long movieId, String title, Date year, int age, int price, List<Actor> cast) {
        this.movieId = movieId;
        this.title = title;
        this.year = year;
        this.age = age;
        this.price = price;
        this.cast = cast;
    }

    public long getMovieId() {
        return movieId;
    }

    public void setMovieId(long movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Actor> getCast() {
        return cast;
    }

    public void setCast(List<Actor> cast) {
        this.cast = cast;
    }
}
