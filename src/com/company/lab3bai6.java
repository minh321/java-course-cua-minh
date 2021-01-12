package com.company;

import java.util.Scanner;

public class lab3bai6 {
    public static void main(String[] args) {
        boolean isVowel = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ky tu: ");
        char kytu = sc.next().charAt(0);
        sc.close();
        switch (kytu) {
            case 'a', 'i', 'e', 'u', 'o', 'A', 'I', 'E', 'O', 'U' -> isVowel = true;
        }
        if (isVowel) {
            System.out.println(kytu + " la nguyen am");
        } else {
            if ((kytu >= 'a' && kytu <= 'z') || (kytu >= 'A' && kytu <= 'Z')) {
                System.out.println(kytu + " la phu am");
            } else {
                System.out.println(kytu + " khong la ky tu alphabet");
            }
        }


    }
}