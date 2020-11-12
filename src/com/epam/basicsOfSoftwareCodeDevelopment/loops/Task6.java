package com.epam.basicsOfSoftwareCodeDevelopment.loops;

public class Task6 {

    public static void main(String[] args) {

        System.out.println("ASCII symbol and cods:");
        System.out.println("№ symbol");

        for (int i = 33; i < 256; i++) {
            char c = (char) i;
            System.out.println(i + " " + c);
        }


    }

}
