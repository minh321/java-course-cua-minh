package com.company;

import java.util.Scanner;

public class lab3bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap toa do xA:");
        int xA = sc.nextInt();
        System.out.print("Nhap toa do yA:");
        int yA = sc.nextInt();
        System.out.println("Diem A: " + "(" + xA + ","+ yA + ")");
        System.out.print("Nhap toa do xB:");
        int xb = sc.nextInt();
        System.out.print("Nhap toa do yB:");
        int yb = sc.nextInt();
        System.out.println("Diem B: " + "(" + xb + ","+ yb + ")");
        System.out.print("Nhap toa do xC:");
        int xc = sc.nextInt();
        System.out.print("Nhap toa do xC:");
        int yc = sc.nextInt();
        System.out.println("Diem C: " + "(" + xc + ","+ yc + ")");
        double a = Math.sqrt(Math.pow(xb-xA,2) + Math.pow(yb-yA,2));
        double b = Math.sqrt(Math.pow(xc-xb,2) + Math.pow(yc-yb,2));
        double c = Math.sqrt(Math.pow(xc-xA,2) + Math.pow(yc-yA,2));
        if ((a+b>c) && (a+c>b) && (b+c>a)) {
            System.out.println("Day la tam giac");
        }else {
            System.out.println("Day khong phai la tam giac");
        }


    }
}
