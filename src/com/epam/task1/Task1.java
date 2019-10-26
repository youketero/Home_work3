package com.epam.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first word -> ");
        String str1 = sc.next();
        uniChar(str1);
    }

    public static void uniChar(String arg1) {
        int index = 0;
        String res = " ";
        while (index < arg1.length()){
            char ch = arg1.charAt(index);
            if(!res.contains(""+ch)){
                res += ch;
            }
            index++;
        }
        System.out.print(res);
    }
}