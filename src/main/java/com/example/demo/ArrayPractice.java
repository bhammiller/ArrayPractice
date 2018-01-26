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
            while(favorite_answer.equals("")){
                System.out.println("Please enter a book or a movie");
                favorite_answer = keyboard.nextLine();
            }
            System.out.println("Is this a book or movie?");
            String type_answer = keyboard.nextLine();
            while(!(type_answer.equals("book")||type_answer.equals("Book")||type_answer.equals("movie")
                    ||type_answer.equals("Movie"))) {
                System.out.println("Is that a movie or a book?");
                type_answer = keyboard.nextLine();
            }
            System.out.println("Do you have any more favorite books or movies? (Y/N)");
            continue_answer = keyboard.nextLine();
            while(!(continue_answer.equals("Y")||continue_answer.equals("N")||continue_answer.equals("y")
                    ||continue_answer.equals("n"))){
                System.out.println("Please enter Y or N");
                continue_answer = keyboard.nextLine();
            }
            if (type_answer.equals("book")||type_answer.equals("Book")){
                favorite_books.add(favorite_answer);
            }else {
                favorite_movies.add(favorite_answer);
            }
        } while (continue_answer.equals("Y") || continue_answer.equals("y"));
        Collections.sort(favorite_movies);
        for (Object movie:favorite_movies){
            System.out.println(movie);

        }
        return favorite_movies;

    }
}
