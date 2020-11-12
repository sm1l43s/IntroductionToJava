package com.epam.basicsOfSoftwareCodeDevelopment.linearPrograms;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input please point x:");
        int x = in.nextInt();

        System.out.println("Input please point y:");
        int y = in.nextInt();


        if ( (x <= 4 && x >= -4)  &&  (y <= 4 && y >= -3) ) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

}
