package com.abhi;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylistex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(3);
//
//        list.add(334);
//        list.add(335);
//        list.add(336);
//        list.add(337);
//
//        System.out.println(list);

        for (int i = 0; i<5; i++) {
            list.add(input.nextInt());
        }
        System.out.print(list + " ");
    }
}
