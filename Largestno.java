package com.abhi;

import java.util.Scanner;

public class Largestno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three number");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

    /*    if(num1>num2 && num1>num3) {
            System.out.println(num1 + " is biggest");
        }
        else if(num2>num3 && num2>num1) {
            System.out.println(num2 + " is biggest");
        }
        else{
            System.out.println(num3 + " is biggest");
        }
     */
        int max =  Math.max(num3, Math.max(num1, num2));
        System.out.println(max);
    }
}
