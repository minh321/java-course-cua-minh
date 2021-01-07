package com.company;

import java.util.Scanner;

public class lab2bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a");
        float a = sc.nextFloat();
        System.out.println("nhap b");
        float b = sc.nextFloat();
        System.out.println("nhap c");
        float c = sc.nextFloat();
        phuongtrinh( a, b, c);
    }
    public static void phuongtrinh(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo nghiem");
            }else {
                System.out.println("Phuong trinh co 1 nghiem" + "x=" + (-c/b));
            }
            return;
        }
        float delta = b * b - a * c * 4;
        float x1, x2;
        if (delta < 0) {
            System.out.println("phuong trinh vo nghiem");
        }else if (delta == 0) {
            System.out.println("phuong trinh co nghiem kep"+"x1=x2="+(-b/2*a));
        }else if (delta > 0) {
            x1 = (float) ((-b+Math.sqrt(delta))/2*a);
            x2 = (float) ((-b-Math.sqrt(delta))/2*a);
            System.out.println("phuong trinh co 2 nghiem phan biet: "+"x1="+x1+"va x2="+x2);
        }
    }

}


