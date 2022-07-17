package controller;

import java.util.Scanner;

public class MovieController {
    public void menu(){
        int input;
        Scanner scan= new Scanner(System.in);
        System.out.println("\t\tMovie Management \n\t\t please input number only press" +
                "\t\t1. To view available movies" +
                "\t\t2. To view rented movies" +
                "\t\t3. To view movie detail" +
                "\t\t4. To add new movie" +
                "\t\t5. To remove movie" +
                "\t\t6. To rent movie List" );
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
}
