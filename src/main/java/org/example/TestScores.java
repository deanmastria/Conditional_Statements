package org.example;

import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        //Created Scanner
        Scanner scanner = new Scanner(System.in);
        //
        System.out.println("Enter Score");

        //user enters test score
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("A!");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else if (score <= 59) {
            System.out.println("F");
        }
        scanner.close();
    }
}

