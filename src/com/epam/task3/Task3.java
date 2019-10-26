package com.epam.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int num = getIntSize();
        reverseInt(num);
    }

    public static void reverseInt(int arg1) {
        String str1 = ""+arg1;
        char str2 = str1.charAt(str1.length()-1);
        char str3 = str1.charAt(str1.length()-2);
        System.out.println( "" + str1.charAt(str1.length()-1) + str1.charAt(str1.length()-2) );
    }

    public static int getIntSize() {
        Scanner sc = new Scanner(System.in);
        int num;
        while (true) {
            System.out.print("Enter number -> ");
            num = sc.nextInt();
            if (num > 9) {
                return num;
            }
            System.out.print("Incorrect value. Enter value greater then 9 -> ");
        }
    }

}