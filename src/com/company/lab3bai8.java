package com.company;

import java.util.Scanner;

public class lab3bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        int a = sc.nextInt();
        System.out.print("Nhap so thu hai: ");
        int b = sc.nextInt();
        System.out.println("Menu");
        System.out.println("================");
        System.out.println("+");
        System.out.println("-");
        System.out.println("*");
        System.out.println(":");
        System.out.println("=================");
        System.out.print("Chon: ");
        char m = sc.next().charAt(0);
        switch (m) {
            case '+':
                System.out.println(a+b);
            case '-':
                System.out.println(a-b);
            case '*':
                System.out.println(a*b);
            case ':':
                System.out.println(a/b);
        }
    }
}
