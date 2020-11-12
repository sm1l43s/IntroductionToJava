package com.epam.basicsOfSoftwareCodeDevelopment.Ifs;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input please number 'x': ");
        double x = in.nextDouble();

        double fx = 0;

        if (x <= 3.0) {
            fx = Math.pow(x, 2) - 3 * x + 9;
        } else  {
            fx = 1 / (Math.pow(x, 3) + 6);
        }

        System.out.println("Calculated F(x): " + fx);

    }

}
