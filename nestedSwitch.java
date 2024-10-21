package com.abhi;

import java.util.Scanner;

public class nestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empID = input.nextInt();
        String department = input.next();
        switch (empID) {
            case 1:
                System.out.println("Abhishek");
                break;
            case 2:
                System.out.println("Aman");
                break;
            case 3:
                System.out.println("emp");
                switch (department) {
                    case "IT" :
                        System.out.println("IT department");
                        break;
                    case "Management" :
                        System.out.println("Management department");
                        break;
                }
                break;
            default:
                System.out.println("Invalid Statement");
        }
    }
}
