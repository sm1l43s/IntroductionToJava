package com.epam.basicsOfSoftwareCodeDevelopment.Ifs;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Set the dimensions of the rectangular hole (А, B): ");
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println("Set the dimension of the break (x, y, z): ");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        if ( ((a >= x) && (b >= y)) || ((a >= y) && (b >= x))
             || ((a >= x) && (b >= z)) || ((a >= z) && (b >= x))
             || ((a >= y) && (b >= z)) || ((a >= z) && (b >= y)) ) {
            System.out.println("The brick will go through the hole");
        } else {
            System.out.println("Brick won't go through the hole");
        }

    }

}
