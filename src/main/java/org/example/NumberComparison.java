package org.example;

import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {

        //creates scanner
        Scanner sc = new Scanner(System.in);
        //Prompts user to enter a number
        System.out.println("Enter a number:");
        //allows user to enter a number  to decimal places
        double number1 = sc.nextDouble();
        //prompts second user input
        System.out.println("Enter another number");
        double number2 = sc.nextDouble();
        if (number1 > number2) {
            System.out.println("The first number is larger than the second number");
        } else if (number1 == number2) {
            System.out.println("The first number is equal to the second number");
       } else {
                System.out.println("The second number is larger than the first number");
        }
        sc.close();
    }
}
