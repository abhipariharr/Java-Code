package com.abhi;

import java.util.Scanner;
public class function {
    public static void main(String[] args) {
        sum();  //this is a calling function
        sum();  //function will be called two time because we write function 2 times.
    }
    static void sum() {  //void is a return type. we used voi because we don't want any return type
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number=");
        int num1  = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
    }

}
