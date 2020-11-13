package com.epam.algorithmization.oneDimensionArrays;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input please size of array:");
        int n = in.nextInt();

        double[] array = getArrayFillRandomNumber(n);

        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        int countZero = 0;
        int countPositive = 0;
        int countNegative = 0;

        // count zero number
        for (int i = 0; i < n; i++) {
            if (array[i] == 0) {
                countZero++;
            }
        }

        // count negative number
        for (int i = 0; i < n; i++) {
            if (array[i] < 0) {
                countNegative++;
            }
        }

        // count positive number
        for (int i = 0; i < n; i++) {
            if (array[i] > 0) {
                countPositive++;
            }
        }

        System.out.println("\ncount zero = " + countZero);
        System.out.println("count posotive number = " + countPositive);
        System.out.println("count negative number = " + countNegative);
    }

    private static  double[] getArrayFillRandomNumber(int sizeArray) {
        double[] array = new double[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            array[i] = getRandomDoubleBetweenRange(-100, 100);
        }
        return array;
    }

    private static double getRandomDoubleBetweenRange(double min, double max){
        double x = (Math.random()*((max-min)+1))+min;
        return x;
    }
}
