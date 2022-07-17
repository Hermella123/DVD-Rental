package controller;

import entity.Client;
import entity.Movie_copy;

import java.util.List;
import java.util.Scanner;

public class UserController {
    public void menu(){
        int input;
        Scanner scan= new Scanner(System.in);
        System.out.println("\t\tClient Management \n\t\t please input number only press" +
                "\t\t1. To view rented movie by user" +
                "\t\t2. To view user List" +
                "\t\t3. To view user detail" +
                "\t\t4. To add user" +
                "\t\t5. To remove user" +
                "\t\t6. To rent movie to the user" +
                "\t\t7. To delete rented movie from user");
        input = scan.nextInt();
        switch (input){
            case 1:;
            case 2:;
            case 3:;
            case 4:;
            case 5:;
            case 6:;
            case 7:;
            default:
                System.out.println("wrong entry please insert only number between 1 upto 7");
                menu();
        }

    }
    public void addUser(Client client){

    }
    public void removeUser(Client client){

    }
    public Client getUser(String firstName){
        return null;
    }
    public List<Client> getUserList(){
        return null;
    }
    public void addRentedMovie(Client client, Movie_copy movieCopy){
        //return null;
    }
    public void removeRentedMovie(Client client, long movieId){
        //return null;
    }
    public List<Movie_copy> getRentedMovie(Client client){
        return null;
    }
}
