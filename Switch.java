package com.abhi;

import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String fruit = input.next();

//        switch (fruit) {
//            case "mango":
//                System.out.println("King of fruit");
//                break;
//            case "apple":
//                System.out.println("red fruit");
//                break;
//            case "grapes":
//                System.out.println("small fruit");
//                break;
//            default:
//                System.out.println("invalid fruit");
//        }

        switch (fruit) {
            case "mango" -> System.out.println("King of fruit");
            case "apple" -> System.out.println("red fruit");
            case "grapes" -> System.out.println("small fruit");
            default -> System.out.println("invalid fruit");
        }
    }
}
