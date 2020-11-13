package com.epam.algorithmization.oneDimensionArrays;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input please size of array:");
        int sizeArray = in.nextInt();

        double[] array = getArrayFillRandomNumbers(sizeArray);

        System.out.println("Input please number Z to compare:");
        double z = in.nextDouble();

        System.out.println("Array:");
        for (int i = 0; i < sizeArray; i++) {
            System.out.print(array[i] + " ");
        }

        int swap = 0;
        for (int i = 0; i < sizeArray; i++) {
            if (array[i] > z) {
                array[i] = z;
                swap++;
            }
        }

        System.out.println("\nChanged array: ");
        for (int i = 0; i < sizeArray; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nCount swap = " + swap);

    }

    private static double[] getArrayFillRandomNumbers(int sizeArray) {
        double[] array = new double[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            array[i] = getRandomNumber(100);
        }
        return array;
    }

    private static double getRandomNumber(double max) {
        return Math.random() * max;
    }

}
