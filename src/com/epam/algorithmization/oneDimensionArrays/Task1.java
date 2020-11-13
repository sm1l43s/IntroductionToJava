package com.epam.algorithmization.oneDimensionArrays;

import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input please size of array: ");
        int sizeArray = in.nextInt();

        int[] array = getArrayFillRandomNaturalNumbers(sizeArray);

        System.out.println("Input please number to compare: ");
        int k = in.nextInt();

        int sum = 0;

        System.out.println("Array: ");
        for (int i = 0; i < sizeArray; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < sizeArray; i++) {
            if (array[i] % k == 0) {
                sum += array[i];
            }
        }

        System.out.println("\nSum of elements that are multiple " + k + " = " + sum);

    }

    private static int[] getArrayFillRandomNaturalNumbers(int sizeArray) {
        int[] array = new int[sizeArray];

        for (int i = 0; i < sizeArray; i++) {
            array[i] = getRandomNumberInts(1, 100);
        }

        return array;
    }

    private static int getRandomNumberInts(int min, int max){
        Random random = new Random();
        return random.ints(min,(max+1)).findFirst().getAsInt();
    }

}
