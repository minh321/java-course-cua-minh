package com.company;

import java.util.Scanner;

public class lab2bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap a: ");
        float a = sc.nextFloat();
        System.out.print("nhap b: ");
        float b = sc.nextFloat();
        System.out.print("nhap c: ");
        float c = sc.nextFloat();

        if ((a+b>c) && (a+c>b) && (b+c>a)) {
            System.out.println("Day la tam giac");
        }else {
            System.out.println("Day khong phai la tam giac");
        }
    }
}
