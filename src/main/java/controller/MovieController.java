package controller;

import entity.Actor;
import entity.Movie;
import entity.Movie_copy;
import services.MovieManager;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MovieController {
    MovieManager movieManager;
    public MovieController(){
        movieManager = new MovieManager();
    }
    public void menu(){
        int input;
        Scanner scan= new Scanner(System.in);
        System.out.println("\t\tMovie Management \n\t\t please input number only press" +
                "\t\t1. To view available movies" +
                "\t\t2. To view rented movies" +
                "\t\t3. To rent movie" +
                "\t\t4. To view movie detail" +
                "\t\t5. To add new movie" +
                "\t\t6. To remove movie" +
                "\t\t7. To view movie List" +
                "\t\t8. To view Actors cast in the movie" );
        input = scan.nextInt();
        switch (input){
            case 1:
                getAvailableMovies();
                break;
            case 2:;
            case 3:;
            case 4:
                printMovie();
                break;
            case 5:
                addMovie();
                break;
            case 6:
                removeMovie();
                break;
            case 7:
                getMovieList();
                break;
            case 8:
                printActors();
                break;
            default:
                System.out.println("wrong entry please insert only number between 1 upto 7");
                menu();
        }

    }
    public void addMovie()  {
        Scanner scan= new Scanner(System.in);
        System.out.println("insert Movie Title");
        String title=scan.next();
        System.out.println("Insert the released year");
        Movie movie = null;
        try {
            String date= scan.next();
            Date releasedDate= new SimpleDateFormat("dd/MM/yyyy").parse(date);
            System.out.println(" insert the price");
            int price= scan.nextInt();
            movie=new Movie(title, releasedDate,price);
            movieManager.addMovie(movie);
        } catch (Exception e) {
            e.printStackTrace();
        }
        addActor(movie.getTitle());
        addMovieCopy(movie.getTitle());
    }
    public void printActors() {
        Scanner scan= new Scanner(System.in);
        System.out.println("insert Movie Title");
        String title=scan.next();
        List<Actor> actorList = null;
        try {
            actorList= movieManager.getActorList(title);
        }catch (SQLException e) {
            e.printStackTrace();
        }
        actorList.stream().forEach(x -> {
            System.out.println("\nFirst Name: "+ x.getFirstName());
            System.out.println("\nLast Name: "+ x.getLastName());
            System.out.println("\nMovie Title: "+ title);
        });
    }

    public void addActor(String title){
        Scanner scan= new Scanner(System.in);
        System.out.println("insert the Actors casted in the movie");
        System.out.println("insert number of the Actors");
        int numberOfCopy = scan.nextInt();
        List<Actor> cast=new ArrayList<>();
        while(numberOfCopy>0){
            System.out.println("First name: ");
            String fname= scan.next();
            System.out.println("Last Name: ");
            String lname= scan.next();
            cast.add(new Actor(fname,lname,title));
            numberOfCopy --;
        }
        try {
            movieManager.addActorList(cast);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void addMovieCopy(String title){
        List<Movie_copy> cast=new ArrayList<>();
        Scanner scan= new Scanner(System.in);
        System.out.println("insert number of copy of the Movie");
        int numberOfCopy = scan.nextInt();
        while(numberOfCopy>0){
            cast.add(new Movie_copy(title,true));
            numberOfCopy --;
        }
        try {
            movieManager.addMovieCopy(cast);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void removeMovie() {
        Scanner scan= new Scanner(System.in);
        System.out.println("insert Movie Title");
        String movieTitle=scan.next();
        try {
            movieManager.removeMovie(movieTitle);
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void printMovie() {
        Scanner scan= new Scanner(System.in);
        System.out.println("insert Movie Title");
        String movieTitle=scan.next();
        Movie movie=null;
        try {
            movie= movieManager.getMovie(movieTitle);
        }catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("\nMovie Title: "+ movie.getTitle());
        System.out.println("\nMovie Released Date: "+ movie.getReleasedYear());
        System.out.println("\nMovie Price: "+ movie.getPrice());
    }


    public void getMovieList() {
        List<Movie> movieList=null;
        try {
            movieList= movieManager.getMovieList();
        }catch (SQLException e) {
            e.printStackTrace();
        }
        movieList.stream().forEach(x -> {
            System.out.println("\nMovie Title: "+ x.getTitle());
            System.out.println("\nMovie Released Date: "+ x.getReleasedYear());
            System.out.println("\nMovie Price: "+ x.getPrice());
        });
    }


    public void getAvailableMovies() {
        List<Movie_copy> movieList=null;
        try {
            movieList= movieManager.getAvailableMovies();
        }catch (SQLException e) {
            e.printStackTrace();
        }
        movieList.stream().forEach(x -> {
            System.out.println("\nMovie Title: "+ x.getCopiedMovieTitle());
            System.out.println("\nMovie Availability : "+ x.isAvailable());
        });
    }
}
