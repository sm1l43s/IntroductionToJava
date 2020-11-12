package com.epam.basicsOfSoftwareCodeDevelopment.loops;

public class Task3 {

    public static void main(String[] args) {

        int sum = 0;
        int i = 1;
        while (i <= 100)  {
            sum += Math.pow(i, 2);
            i++;
        }

        System.out.println("sum of squares of the first 100 numbers = " + sum);

    }
}
