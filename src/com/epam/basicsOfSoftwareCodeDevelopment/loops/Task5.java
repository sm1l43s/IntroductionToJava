package com.epam.basicsOfSoftwareCodeDevelopment.loops;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input please number n: ");
        int n = in.nextInt();

        System.out.println("Input please e: ");
        double e = in.nextDouble();

        double sum = 0;

        for (int i = 0; i < n; i++) {
            double an = 1 / Math.pow(i, i) + 1 / Math.pow(i + 1, i);

            if (Math.abs(an) >= e) {
                sum += an;
            }
        }

        System.out.println("the sum of the series = " + sum);
    }

}
