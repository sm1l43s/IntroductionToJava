package com.epam.basicsOfSoftwareCodeDevelopment.Ifs;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input please number a: ");
        double a = in.nextDouble();

        System.out.println("Input please number b: ");
        double b = in.nextDouble();

        System.out.println("Input please number c: ");
        double c = in.nextDouble();

        System.out.println("Input please number d: ");
        double d = in.nextDouble();

        System.out.println("max(min(a, b), min(c, d)): " + max(min(a, b), min(c, d)));
    }

    private static Double max(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    private static Double min(double a, double b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

}
