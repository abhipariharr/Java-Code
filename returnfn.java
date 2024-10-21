package com.abhi;
import java.util.Scanner;

public class returnfn {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);
        ans = sum();
        System.out.println(ans);

    }
    static int sum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two number=");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2;
        return sum;
        //below return sum nothing will execute.end of the program.
    }
}
