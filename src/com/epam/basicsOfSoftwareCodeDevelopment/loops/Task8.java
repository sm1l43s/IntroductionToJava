package com.epam.basicsOfSoftwareCodeDevelopment.loops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input two any numbers: ");
        int a = in.nextInt();
        int b =in.nextInt();

        System.out.println("number " + a + " has numbers: " + getNumber(a));
        System.out.println("number " + b + " has numbers: " + getNumber(b));

    }

    private static List<Integer> getNumber(int number) {
        List<Integer> numbers = new ArrayList<>();

        while (number > 0) {
            numbers.add(number % 10);
            number /= 10;
        }
        Collections.reverse(numbers);
        return numbers;
    }

}
