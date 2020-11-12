package com.epam.basicsOfSoftwareCodeDevelopment.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input please range number from m to n, n > m: ");
        int m = in.nextInt();
        int n = in.nextInt();

        List<Integer> divisors = new ArrayList<>();

        for (int i = m; i < n; i++) {
            for (int j = 2; j < i; j++) {
                if ( i % j == 0) {
                    divisors.add(j);
                }
            }
            System.out.println("divisors of a "+ i + " other than 1 and a number " + i + " =" + divisors);
            divisors.clear();
        }

    }

}
