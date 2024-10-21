package com.abhi;


public class occurring {
    public static void main(String[] args) {

        int num = 84794048;
        int count = 0;

        while(num > 0){
            int rem = num % 10;

            if(rem == 0){
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
    }
}
