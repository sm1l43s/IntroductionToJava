package com.epam.basicsOfSoftwareCodeDevelopment.loops;

public class Task4 {

    public static void main(String[] args) {

        int p = 1;
        int i = 1;
        while (i <= 200)  {
            p *= Math.pow(i, 2);
            i++;
        }

        System.out.println("multiplication of squares of the first 200 numbers = " + p);

    }

}
