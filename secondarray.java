package com.abhi;

import java.util.Arrays;
import java.util.Scanner;

public class secondarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];

        //input
        for (int r = 0; r < arr.length; r++) {
            //column
            for (int c = 0; c < arr[r].length; c++){
                arr[r][c] = input.nextInt();
            }
        }
        //output
        for (int r = 0; r < arr.length; r++) {
            System.out.println(Arrays.toString(arr[r]));
        }
    }
}
