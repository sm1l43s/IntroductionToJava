package com.epam.basicsOfSoftwareCodeDevelopment.linearPrograms;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input please number 'R' (nnn.ddd): ");
        double R = in.nextDouble();

        char[] arrNumber = String.valueOf(R).toCharArray();

        String newStr = "";

        for (int i = arrNumber.length - 1; i >= 0; i--) {
            newStr += arrNumber[i];
        }

        System.out.println("Changed number: " + Double.parseDouble(newStr));
    }

}
