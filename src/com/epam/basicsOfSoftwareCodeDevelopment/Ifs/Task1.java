package com.epam.basicsOfSoftwareCodeDevelopment.Ifs;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first angle of the triangle");
        int angleOne = in.nextInt();

        System.out.println("Enter the second angle of the triangle");
        int angleTwo = in.nextInt();

        if (angleOne + angleTwo < 180) {
            if (angleOne == 90 || angleTwo == 90 || (angleOne + angleTwo) == 90) {
                System.out.println("triangle exists and it is rectangular");
            } else {
                System.out.println("triangle exists but he is not rectangular");
            }
        } else  {
            System.out.println("triangle is not exists");
        }

    }

}
