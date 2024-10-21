package com.abhi;

import java.util.Arrays;

public class arrayfunction {
    public static void main(String[] args) {
        int[] num = {2,3,4,5};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }
    static void change (int[] arr) {
        arr[0] = 99;
    }
}
