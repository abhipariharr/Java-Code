package com.abhi;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(IsArmstrong(n));

//        for (int i=1; i<=1000; i++) {
//            if(IsArmstrong(i)) {
//                System.out.println(i + "");
//            }
//        }
    }
    static boolean IsArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n>0) {
            int rem = n %10;
            sum = sum +rem*rem*rem;
             n = n/10;
        }
        return sum == original;
    }

}
