package com.abhi;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int[] arr = new int[4];
//        arr[0] = 12;
//        arr[1] = 32;
//        arr[2] = 34;
//        arr[3] = 1;
//
//        System.out.println(arr[2]);

        //for input
//        for(int i = 0; i < 4; i++) {
//          arr[i] = input.nextInt();
//        }
        //for output
//        for (int i = 0; i < 4; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        System.out.print(Arrays.toString(arr));
        //Array class has a toString method. When you give array into it, it coverts it into string.

        String[] str = new String[4];
        System.out.print("Enter string= ");

        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[2] = "hello";
        System.out.println(Arrays.toString(str));
    }
}
