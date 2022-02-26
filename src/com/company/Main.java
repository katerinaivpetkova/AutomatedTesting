package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        int min;
        min = 1;
        int max;
        max = 10;
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

        if (randomNum > 5) {
            System.out.println("The number is greather than five. It is " + randomNum + ".");
        }
    }
}
