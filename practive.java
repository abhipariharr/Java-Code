package com.abhi;

public class practive {
    public void main(String[] args) {
        Student Abhishek = new Student();

        Abhishek.rollno = 15;
        Abhishek.name = "Abhishek";

        System.out.println(Abhishek.rollno);
        System.out.println(Abhishek.name);
    }
    class Student{
        int rollno;
        String name;
    }
}
