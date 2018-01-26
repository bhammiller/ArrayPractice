package com.example.demo;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPractice {
    public ArrayList practicer() {
        ArrayList favorite_books = new ArrayList();
        ArrayList favorite_movies = new ArrayList();
        Scanner keyboard = new Scanner(System.in);
        String continue_answer = "";
        do{
            System.out.println("What is your favorite book or movie?");
            String favorite_answer = keyboard.nextLine();
            System.out.println("Is this a book or movie?");
            String type_answer = keyboard.nextLine();
            System.out.println("Do you have any more favorite books or movies? (Y/N)");
            continue_answer = keyboard.nextLine();
            if (type_answer.equals("book")){
                favorite_books.add(favorite_answer);
            }else{
                favorite_movies.add(favorite_answer);
            }
        } while (continue_answer.equals("Y"));
        return favorite_movies;
    }
}
