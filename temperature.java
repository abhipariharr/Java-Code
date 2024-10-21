package com.abhi;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Fahrenheit:");
        float temp = input.nextFloat();
        float a;
        a = (temp - 32) * 5/9;
        System.out.println(a);
    }
}
