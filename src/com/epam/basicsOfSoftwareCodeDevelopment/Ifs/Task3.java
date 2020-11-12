package com.epam.basicsOfSoftwareCodeDevelopment.Ifs;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("enter the coordinates of the first point (x, y): ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();

        System.out.println("enter the coordinates of the second point (x, y): ");
        int x2 = in.nextInt();
        int y2 = in.nextInt();

        System.out.println("enter the coordinates of the third point (x, y): ");
        int x3 = in.nextInt();
        int y3 = in.nextInt();

        if ( (x1 - x2) / (y1 - y2) == (x1 - x3) / (y1 - y3)) {
            System.out.println("points are on the same straight line.");
        } else {
            System.out.println("points are't on the same straight line.");
        }

    }

}
