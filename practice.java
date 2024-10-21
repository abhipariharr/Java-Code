package com.abhi;

public class practice {
    public static void main(String[] args) {
        Student Abhishek = new Student();

        Abhishek.rollno = 15;
        Abhishek.name = "Abhishek";

        System.out.println(Abhishek.rollno);
        System.out.println(Abhishek.name);
    }
    static class Student{
        int rollno;
        String name;
    }
}