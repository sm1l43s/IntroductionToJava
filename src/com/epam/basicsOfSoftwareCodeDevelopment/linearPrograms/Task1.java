package com.epam.basicsOfSoftwareCodeDevelopment.linearPrograms;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input please number 'a': ");
        double a = in.nextDouble();

        System.out.println("Input please number 'b': ");
        double b = in.nextDouble();

        System.out.println("Input please number 'c': ");
        double c = in.nextDouble();

        double z = ((a - 3) * b / 2) + c;

        System.out.println("z = " + z);
    }

}
