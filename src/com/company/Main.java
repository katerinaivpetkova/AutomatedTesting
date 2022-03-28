package com.company;

import java.io.BufferedReader;
import java.sql.SQLOutput;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*int min;
        min = -100;
        int max;
        max = 101;

        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        String message = (randomNum > 0)? "The number is positive" : "The number is negative";
        System.out.println(message + ". It is " + randomNum + ".");

        int grade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter grade: ");
        grade = sc.nextInt();
        sc.close();

        switch(grade) {
            case 3:
                System.out.println("Your grade is 'Middle'");
                break;
            case 4:
                System.out.println("Your grade is 'Good'");
                break;
            case 5:
                System.out.println("Your grade is 'Very good'");
                break;
            case 6:
                System.out.println("Your grade is 'Excellent'");
                break;
            default:
                System.out.println("Your grade is 'Bad'");
        }*/

       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int inputNumber = sc.nextInt();
        int result = 1;

        while (inputNumber > 0){
           result*=inputNumber;
           inputNumber--;
        }
        System.out.printf("Factorial of a number is : " + result);
        sc.close();*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Get the limit of Fibonacci sequence:");
        int limit = sc.nextInt();
        int precedingFirst = sc.nextInt();
        int precedingSecond = sc.nextInt();
        int currentResult = 0;

        do {
            currentResult = precedingFirst + precedingSecond;
            System.out.println(precedingFirst + ", " + precedingSecond + ", " + currentResult + ", ");
            precedingSecond = precedingFirst;
        }   while (currentResult != limit);

        sc.close();
    }
}
