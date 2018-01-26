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
            }else if(type_answer.equals("movie")){
                favorite_movies.add(favorite_answer);
            }
        } while (continue_answer.equals("Y") || continue_answer.equals("y"));
        Collections.sort(favorite_movies);
        /*
        for (int i = 0; i < favorite_movies.length; i++){
            System.out.println(favorite_movies[i]);

        }*/
        return favorite_movies;

    }
}
