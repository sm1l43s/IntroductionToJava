package com.epam.basicsOfSoftwareCodeDevelopment.loops;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input please any positiv number: ");
        int number = in.nextInt();

        int sum = 0;
        for (int i = 0; i < number; i++) {
            sum += i;
        }

        System.out.println("Sum of the numbers in range 1-" + number + " = " + sum);
    }

}
