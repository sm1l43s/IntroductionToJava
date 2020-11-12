package com.epam.basicsOfSoftwareCodeDevelopment.linearPrograms;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input please time in seconds: ");
        int seconds = in.nextInt();

        System.out.println("Time: " + calculateTIme(seconds));
    }

    private static String calculateTIme(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds - hours * 3600) / 60;
        int second =  seconds - hours * 3600 - minutes * 60;

        String fullTime = addZero(hours) + "ч " + addZero(minutes) + "м " + addZero(second) + "с";
        return fullTime;
    }

    private static String addZero(int number) {
        if (number < 10) {
            return "0" + number;
        }
        return String.valueOf(number);
    }

}
