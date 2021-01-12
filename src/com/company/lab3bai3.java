package com.company;

import java.util.Scanner;

public class lab3bai3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int max = a;
        int min = a;
        if(max<b) max = b;
        if(max<c) max = c;
        if(max<d) max = d;
        if(min>b) min = b;
        if(min>c) min = c;
        if(min>d) min = d;

        System.out.println("max la: " + max);
        System.out.println("min la: " + min);


    }
}
