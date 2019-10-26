package com.epam.task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int num = getIntSize();
        pyramid(num);
    }

    public static int pyramid(int args) {
        int line = 0;
        while (line <= args) {
            int row = args;
            while (row > 1) {
                if (row > line) {
                    System.out.print(" ");
                } else {
                    System.out.print(row);
                }
                row--;
            }
            while (row < args*2) {
                if (row > line) {
                    System.out.print(" ");
                } else {
                    System.out.print(row);
                }
                row++;
            }
            line++;
            System.out.println("");
        }
        return line;
    }

    public static int getIntSize() {
        Scanner sc = new Scanner(System.in);
        int num;
        while (true) {
            System.out.print("Enter number -> ");
            num = sc.nextInt();
            if (num < 10) {
                return num;
            }
            System.out.print("Incorrect value. Enter value greater less 10 -> ");
        }
    }
}
