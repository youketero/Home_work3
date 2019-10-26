package com.epam.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number");
        int num1 = sc.nextInt();
        bytenum(num1);
    }

    public static void bytenum(int arg1) {
        int arg2;
        String str = "";
        while (arg1 > 0){
            arg2 = arg1 % 2;
            str = arg2 + str;
            arg1 = arg1/2;
        }
        System.out.print("Converted number" + str);
        }
}
