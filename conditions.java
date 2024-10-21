package com.abhi;

import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Write your Salary=");
        int salary = input.nextInt();

        if( salary > 10000 ) {
            salary += 2000;
        }
        else if( salary > 5000 ) {
            salary += 1000;
        }
        else {
            salary += 500;
        }
        System.out.println("Your Salary " +salary);
    }
}
