package com.epam.basicsOfSoftwareCodeDevelopment.linearPrograms;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please input number x: ");
        double x = in.nextDouble();

        System.out.println("Please input number y: ");
        double y = in.nextDouble();

        System.out.println("Calculated = " + calculate(x, y));
    }

    private  static double calculate(double x, double y) {
        return (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
    }

}
