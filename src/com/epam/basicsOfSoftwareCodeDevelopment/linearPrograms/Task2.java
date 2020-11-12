package com.epam.basicsOfSoftwareCodeDevelopment.linearPrograms;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input please number 'a': ");
        double a = in.nextDouble();

        System.out.println("Input please number 'b': ");
        double b = in.nextDouble();

        System.out.println("Input please number 'c': ");
        double c = in.nextDouble();


        System.out.println("Calculated = " + calculate(a, b, c));
    }

    private static double calculate(double a, double b, double c) {
        return ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a) - (Math.pow(a, 3) * c + Math.pow(b, -2));
    }

}
