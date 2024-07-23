package org.example;

import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) {

        //scanner created
        Scanner in = new Scanner(System.in);
        //prompts user input
        System.out.println("Enter a word:");
        String word = in.nextLine();
        //prompts second user input
        System.out.println("Enter another word:");
        String otherWord = in.nextLine();
        //conditional statement to check if words are the same
        if (word.equals(otherWord)) {
            System.out.println("These words are the same");
        } else {
            System.out.println("These words are not the same");
        }
        in.close();
    }
}
